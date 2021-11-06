package gestion_lab

class LaboratorioController {

    def laboratoriovs = {
        def idL=idLab
        def horaLab=hora
        def localA=local
        def profe=docente
        def materiaA=materiaActivaLaB
        [idLaboratorio: idL, horaLaboratorio: horaLab, localLaboratorio: localA,
        profesoreEncar: profe, materia: materiaA]
    }
}
