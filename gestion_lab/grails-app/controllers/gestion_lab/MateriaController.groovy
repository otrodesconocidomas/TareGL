package gestion_lab

class MateriaController {

    def materiavs ={
        def codM=codMateria
        def nombreM=nombreMateria
        def unidadesV=uV
        def oblig=obligatoria
        def prere=prerequisito
        [codigoMater:codM, nombreMater: nombreM, unidadesValorativas:unidadesV, obligat:oblig,prerequisitoM:prere]
    }
}
