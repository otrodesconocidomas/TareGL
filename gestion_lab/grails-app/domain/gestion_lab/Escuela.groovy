package gestion_lab

class Escuela {
    int idEscuela
    String nombreEscuela
    static constraints = {
        idEscuela unique: true

    }
}