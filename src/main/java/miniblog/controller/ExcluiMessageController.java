package miniblog.controller;

import miniblog.model.BlogMessage;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/ControleExcluiMensagem")
public class ExcluiMessageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        List<BlogMessage> blogMessages = (ArrayList<BlogMessage>) context.getAttribute("messagesList");
        Long id = Long.valueOf(req.getParameter("idchave"));
        blogMessages.removeIf(b->b.getId().equals(id));
        context.setAttribute("messageList", blogMessages);
        req.getRequestDispatcher("/miniblog/blog.jsp").forward(req, resp);
    }
}
