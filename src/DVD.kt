data class DVD(val titulo: String, val anioPublicacion: Int, val director: String) {
    init {
        require(titulo.isNotEmpty()) { "Debe tener titulo." }
        require(anioPublicacion in 0..2025) { "La fecha debe estar entre 0 y 2025." }
        require(director.isNotEmpty()) { "Debe tener director." }
    }
}
