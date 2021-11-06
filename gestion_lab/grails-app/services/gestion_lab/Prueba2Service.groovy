package gestion_lab

import grails.gorm.services.Service

@Service(Prueba2)
interface Prueba2Service {

    Prueba2 get(Serializable id)

    List<Prueba2> list(Map args)

    Long count()

    void delete(Serializable id)

    Prueba2 save(Prueba2 prueba2)

}