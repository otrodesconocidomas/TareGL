package gestion_lab
import servicios.MateriaActiva.MateriaActivaCrudService

class MateriaActivaController {
    def materiaActivaCrudService

    def materiaActvs (){
       /* def anioD= anio
        def cicloD= ciclo
        def resp=coordinador
        [anioI:anioD, cicloI: cicloD, pResponsable: resp]
*/
        render(model:[lista: materiaActivaCrudService.listaMateriaAct()])
    
    }
}
