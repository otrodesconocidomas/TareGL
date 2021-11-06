package gestion_lab

class Local {
    int idlocal
    float latitud 
    float longuitud
    static belongsTo = [escuelaUser: Escuela]
    static hasMany = [reservas: Reserva]

    static constraints = {
         idlocal unique: true
    }
}