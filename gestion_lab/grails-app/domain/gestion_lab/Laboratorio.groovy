package gestion_lab

class Laboratorio {
    int idLab
    Date hora
    
    static belongsTo = [local: Local,docente:Profesor,materiaActivaLaB: MateriaActiva]


    static constraints = {
         idLab unique: true
    }
}
