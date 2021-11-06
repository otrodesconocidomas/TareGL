package gestion_lab

class CatalogoLocales {

    static hasMany = [listalocales: Local]
    static belongsTo = [escuela: Escuela]
    static constraints = {
    }
}