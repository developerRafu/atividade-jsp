<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css" media="all">
            @import url("css/screen.css");
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
     application.setAttribute("MSG", new String("XX"));
     String msg = (String) application.getAttribute("MSG");
    %>
    <body>
        <h1>Miniblog </h1>
         <p>Olá, ${user.name} Bem-vindo ao Mini Blog!</p>
         <a href="/ControleBlog?acao=BLOG">Acesse o miniblog e poste uma mensagem</a>
    </body>
</html>
