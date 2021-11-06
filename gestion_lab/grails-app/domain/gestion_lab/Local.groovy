package gestion_lab

class Local {
    int idlocal
    String nombreLocal
    float latitud 
    float longuitud
    static hasMany =[materiaActivaLaB:MateriaActiva]   
    

    static constraints = {
         idlocal unique: true
    }
}