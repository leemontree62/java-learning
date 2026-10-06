import Logica.Alumno;

void main() {
    //instacia del objeto con constru sin paramtros
    Alumno alu1 = new Alumno();

    //instacia del objeto con constru con paramtros
    Alumno alu2 = new Alumno(1,"Javier","Cundumi");

    IO.println("_________________________________________");
    IO.println("La Id del alumno 2 es :" + alu2.getId());
    IO.println("El nombre es :" + alu2.getNombre());
    IO.println("El Apellido es :" + alu2.getApellido());

    //setter "colocar"
    alu1.setId(4);
    alu1.setNombre("Keneth");
    alu1.setApellido("Mancilla");

    IO.println("_________________________________________");
    IO.println("La Id del alumno 1 es :" + alu1.getId());
    IO.println("El nombre es :" + alu1.getNombre());
    IO.println("El Apellido es :" + alu1.getApellido());

    //setter
    alu2.setId(50);
    IO.println("_________________________________________");
    IO.println("La Id del alumno 2 es :" + alu2.getId());
    IO.println("El nombre es :" + alu2.getNombre());
    IO.println("El Apellido es :" + alu2.getApellido());

}
