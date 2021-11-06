package gestion_lab

class PensumController {

    def pensumvs = {
        def idP=idePensum
        def carreraP=carrera
        def asignaturas=listaMaterias
        [idPensum: idP, nombreCarrera:carreraP, materiasP: asignaturas]
     }
}
