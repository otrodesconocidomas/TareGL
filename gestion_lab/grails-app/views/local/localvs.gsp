<%@ page contentType="text/html;charset=UTF-7" %>
<html>
    <head>
    </head>

    <body>
        <h1> lista locales obtenido en lista locales<h1>
        <ul>
            <g:each in="${lista}" var="item">
                <li> el local ${item?.idlocal}  con longuitud ${item?.longuitud} y latitud ${item?.latitud}</li>
            </g:each>
        </ul>
    </body>

    <footer>
    </footer>
</html>