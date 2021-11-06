package gestion_lab

class MateriaActiva {
int ciclo
int anio
Date horaLab

static belongsTo = [coordinador: Profesor, localReserva: Local]


    static constraints = {
    }
}
