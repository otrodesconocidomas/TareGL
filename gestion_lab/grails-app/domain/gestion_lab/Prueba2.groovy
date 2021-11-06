package gestion_lab

class Prueba2 {
    String nombrePrueba
    int anio

    static constraints = {
        nombrePrueba size:5..30
        anio min: 4, max: 8
    }
}
