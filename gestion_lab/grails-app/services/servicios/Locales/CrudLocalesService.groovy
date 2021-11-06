package servicios.Locales
import grails.gorm.transactions.Transactional
import gestion_lab.Local
import gestion_lab.Escuela

@Transactional
class CrudLocalesService {

    def listaLocales() {
        def lista = Local.list()
        lista

    }
}
