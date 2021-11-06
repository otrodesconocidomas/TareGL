package gestion_lab

class MateriaActiva {
int ciclo
int anio
static belongsTo = [coordinador: Profesor]


    static constraints = {
    }
}
