package gestion_lab

class CatalogoLocalesController {

    def catalogovs = {
       def catalogo= listalocales
        [catalogoL: catalogo]
    }
}
/*creo que asíde e de ser :v
en todas, depues del igual de la variable pongo el nombre de la variable del modelo*/