package miniblog.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import miniblog.model.BlogMessage;
import miniblog.model.User;

@WebServlet("/BlogController")
public class BlogController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = req.getParameter("message");
        User user = (User) req.getSession().getAttribute("user");

        if(msg == null || msg.equals("")){
            req.setAttribute("errors", "Insira uma mensagem");
            req.getRequestDispatcher("/miniblog/blog.jsp").forward(req, resp);
            return;
        }

        updateSessionMessageList(msg, user);

        req.getRequestDispatcher("/miniblog/blog.jsp").forward(req, resp);
    }

    private void updateSessionMessageList(String msg, User user) {
        ServletContext context = getServletContext();

        ArrayList<BlogMessage> blogMessages = (ArrayList<BlogMessage>) context.getAttribute("messagesList");

        if(blogMessages == null || blogMessages.isEmpty()){
            blogMessages = new ArrayList<>();
        }

        blogMessages.add(new BlogMessage(msg, user));

        context.setAttribute("messagesList", blogMessages);
    }
}
