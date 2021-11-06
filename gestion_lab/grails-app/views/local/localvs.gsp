<%@ page contentType="text/html;charset=UTF-7" %>
<html>
    <head>
        <title>Laboratorios</title>
        <asset:stylesheet href="gps.css"/>
    </head>

    <body>
        <h1> lista locales obtenido en lista locales<h1>
        <ul>
            <g:each in="${lista}" var="item">
                <li> el local ${item?.idlocal}  con longuitud ${item?.longuitud} y latitud ${item?.latitud}</li>
            </g:each>
        </ul>
        <div id="map"></div>
        <asset:javascript src="localizacion.js"/>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDVWhOl_toN0XyeiTsicovxfn7pm6HZyEU&callback=iniciarMapa"></script>
    
    </body>

    <footer>
    </footer>
</html>