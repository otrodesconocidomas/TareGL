package gestion_lab

class Local {
    int idlocal
    float latitud 
    float longuitud
    
    

    static constraints = {
         idlocal unique: true
    }
}