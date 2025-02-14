data class Revista(val titulo: String, val anioPublicacion: Int, val issue: Int) {
    init {
        require(titulo.isNotEmpty()) { "Debe tener titulo." }
        require(anioPublicacion in 0..2025) { "La fecha debe estar entre 0 y 2025." }
        require(issue >= 0) { "Debe ser mayor a 0." }
    }
}