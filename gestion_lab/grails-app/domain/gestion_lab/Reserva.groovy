package gestion_lab

class Reserva {
    int anioReserva
    int cicloReserva
    static belongsTo = [lab: Laboratorio,localReserva:Local]
    static constraints = {
    }
}
