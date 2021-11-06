package gestion_lab

class ProfesorController {

    def profesorvs = { 
        def idProfe=idProfesor
        def nitProfe=nit
        def nacimientoProfe=fecha_nacimiento
        def estadoProfe=estado
        [idDocente:idProfe, nitDocente: nitProfe, fechaNDocente: nacimientoProfe, estadoDocente: estadoProfe]
    }
}
