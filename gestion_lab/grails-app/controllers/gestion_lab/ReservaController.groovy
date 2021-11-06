package gestion_lab

class ReservaController {

    def reservavs = {
        def anioR=anioReserva
        def cicloR=cicloReserva
        def laboratorio=lab
        def localR= localReserva
        [anio:anioR, ciclo:cicloR, lab:laboratorio, local:localR]
    }
}
/*creo que asi es*/