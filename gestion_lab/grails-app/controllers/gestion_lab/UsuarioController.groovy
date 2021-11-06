package gestion_lab

class UsuarioController {

    def usuariovs = { 
        def idUser=idUsuario
        def typeUser=tipoUsuario
        def nameUser=nombreUsuario
        def lNameU=apellidoUsuario
        [idUsu: idUser, tipoUsu: typeUser, nombreUsu: nameUser, apellidoUsu: lNameU]
    }
}
