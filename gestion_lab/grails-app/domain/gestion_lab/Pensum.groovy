package gestion_lab

class Pensum {
int idePensum
static belongsTo = [carrera: Escuela]
static hasMany = [listaMaterias:Materia]


    static constraints = {
    }
}
