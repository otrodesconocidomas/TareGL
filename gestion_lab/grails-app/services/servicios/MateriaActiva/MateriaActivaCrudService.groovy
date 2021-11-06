package servicios.MateriaActiva

import grails.gorm.transactions.Transactional
import gestion_lab.MateriaActiva
import gestion_lab.Local

@Transactional
class MateriaActivaCrudService {

    def listaMateriaAct() {
        def listaMA = MateriaActiva.list()
        listaMA
    }
}
