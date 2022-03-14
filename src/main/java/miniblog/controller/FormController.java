package miniblog.controller;

import miniblog.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/formController")
public class FormController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> errors = new HashMap<>();

        String username = req.getParameter("name");

        if(username.length() < 3){
            errors.put("username", "Nome de usuário não deve conter menos de 3 caracteres");
        }

        if(errors.isEmpty()){
            req.getSession().setAttribute("user", new User(username));
            req.getRequestDispatcher("miniblog/blog.jsp").forward(req, resp);
        } else {
            req.setAttribute("errors", errors);
            req.getRequestDispatcher("formlogin.jsp").forward(req, resp);
        }
    }
}
