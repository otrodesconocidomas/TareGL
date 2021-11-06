package gestion_lab

import grails.gorm.services.Service

@Service(Pensum)
interface PensumService {

    Pensum get(Serializable id)

    List<Pensum> list(Map args)

    Long count()

    void delete(Serializable id)

    Pensum save(Pensum pensum)

}