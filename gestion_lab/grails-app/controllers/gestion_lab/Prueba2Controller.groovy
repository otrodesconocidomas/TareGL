package gestion_lab

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class Prueba2Controller {

    Prueba2Service prueba2Service

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond prueba2Service.list(params), model:[prueba2Count: prueba2Service.count()]
    }

    def show(Long id) {
        respond prueba2Service.get(id)
    }

    def create() {
        respond new Prueba2(params)
    }

    def save(Prueba2 prueba2) {
        if (prueba2 == null) {
            notFound()
            return
        }

        try {
            prueba2Service.save(prueba2)
        } catch (ValidationException e) {
            respond prueba2.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'prueba2.label', default: 'Prueba2'), prueba2.id])
                redirect prueba2
            }
            '*' { respond prueba2, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond prueba2Service.get(id)
    }

    def update(Prueba2 prueba2) {
        if (prueba2 == null) {
            notFound()
            return
        }

        try {
            prueba2Service.save(prueba2)
        } catch (ValidationException e) {
            respond prueba2.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'prueba2.label', default: 'Prueba2'), prueba2.id])
                redirect prueba2
            }
            '*'{ respond prueba2, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        prueba2Service.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'prueba2.label', default: 'Prueba2'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'prueba2.label', default: 'Prueba2'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
