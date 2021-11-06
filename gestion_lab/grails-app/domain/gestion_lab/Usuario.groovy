package gestion_lab

class Usuario {
   int idUsuario
   int tipoUsuario
   String nombreUsuario
   String apellidoUsuario
   
    static constraints = {
        idUsuario unique: true
    }
}