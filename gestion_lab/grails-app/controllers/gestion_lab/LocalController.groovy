package gestion_lab
import servicios.Locales.CrudLocalesService

class LocalController {
    def crudLocalesService
    
    def localvs(){
      
        /*def escuelaPropie= escuelaUser
        def reserva = reservas
        idLoc: idlocal, lati: latitud, longi: longuitud, escual: escuelaPropie, reser: reserva*/
          render(model:[lista: crudLocalesService.listaLocales()])
    }
}
/*La escuelaPropie y reserva no se si está bueno */
