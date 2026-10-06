void main() {
    Alumno alu1 = new Alumno();
    Alumno alu2 = new Alumno(5,"keneth","Cundumi");

    IO.println("Id: " + alu2.getId());
    IO.println("Nombre: " + alu2.getNombre());
    IO.println("Apellido: " + alu2.getApellido());

}
