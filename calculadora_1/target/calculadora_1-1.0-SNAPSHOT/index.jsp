<%-- 
    Document   : index
    Created on : 04/05/2021, 10:19:10
    Author     : gualv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Velocidade media e rendimento medio</title>
    </head>
    <body>
        
        <h1>Insira as informações da viagem: </h1>
        
        <form action= "Calcula" method ="post">
            <p>
                <br> Distancia em KM: <input type="text" name ="dist"><br> 
                <br> Tempo em Horas: <input type="text" name ="time"><br> 
                <br> Consumo em Litros: <input type="text" name ="cons"><br> 
                <br><input type="submit" name ="Calcular"><br> 
            </p>
        </form>
        
    </body>
</html>
