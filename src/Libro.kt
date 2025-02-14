data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int) {
    init {
        require(autor.isNotEmpty()) { "Debe tener autor." }
        require(titulo.isNotEmpty()) { "Debe tener titulo." }
        require(anioPublicacion in 0..2025) { "La fecha debe estar entre 0 y 2025." }
    }
}
