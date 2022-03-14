<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Bem-vindo!</h1>
        <form action="formController" method="post">
            <label>Informe seu nome:
                <input type="text" name="name">
            </label>
            <button type="submit">Entrar</button>
        </form>
        <span class="error">${errors.username}</span>
    </body>
</html>

