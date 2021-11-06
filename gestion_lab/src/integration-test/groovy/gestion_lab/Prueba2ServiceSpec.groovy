package gestion_lab

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class Prueba2ServiceSpec extends Specification {

    Prueba2Service prueba2Service
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Prueba2(...).save(flush: true, failOnError: true)
        //new Prueba2(...).save(flush: true, failOnError: true)
        //Prueba2 prueba2 = new Prueba2(...).save(flush: true, failOnError: true)
        //new Prueba2(...).save(flush: true, failOnError: true)
        //new Prueba2(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //prueba2.id
    }

    void "test get"() {
        setupData()

        expect:
        prueba2Service.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Prueba2> prueba2List = prueba2Service.list(max: 2, offset: 2)

        then:
        prueba2List.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        prueba2Service.count() == 5
    }

    void "test delete"() {
        Long prueba2Id = setupData()

        expect:
        prueba2Service.count() == 5

        when:
        prueba2Service.delete(prueba2Id)
        sessionFactory.currentSession.flush()

        then:
        prueba2Service.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Prueba2 prueba2 = new Prueba2()
        prueba2Service.save(prueba2)

        then:
        prueba2.id != null
    }
}
