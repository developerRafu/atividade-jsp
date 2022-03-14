<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net"  prefix="display"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css" media="all">
            @import url("css/screen.css");
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body style="width: 800px">
        <h1>Miniblog!</h1>
        <p>Olá, ${user.name} Bem-vindo ao Mini Blog!</p>
        <span style="color: red">${errors} </span>
        
        <form action="BlogController" method="post">
            <textarea rows="3" cols="40" value="" name="message" size="120"
                      style="height: 100%"></textarea>
            <br> <input type="submit" value="ENVIAR" />
        </form>
        <br/> <a href="ControleBlog" > Atualizar mensagens </a>
        <display:table  name="${messagesList}" >
            <display:column property="id"  />
            <display:column property="message" style="width: 85%;" />
            <display:column property="messageTime" title="Hora"/>
            <display:column property="user.name" title="Autor" />
            <display:column href="ControleExcluiMensagem"
                            paramId="idchave" paramProperty="id" >
                <img alt="Excluir" src="img/exclui.jpeg" height="16px" width="16px">
            </display:column>
        </display:table>    

    </body>
</html>
