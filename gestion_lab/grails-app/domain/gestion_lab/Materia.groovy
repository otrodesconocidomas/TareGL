package gestion_lab

class Materia {
int codMateria
String nombreMateria
int uV
boolean obligatoria
static belongsTo = [prerequisito: Materia]

    static constraints = {
                 codMateria unique: true
    }
}
