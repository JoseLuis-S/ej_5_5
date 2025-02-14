sealed class Usuarios {
    class Estudiante(val id: String, val nombre: String, val carrera: String) : Usuarios()
    class Profesor(val id: String, val nombre: String, val departamento: String) : Usuarios()
    class Visitante(val id: String, val nombre: String) : Usuarios()
}