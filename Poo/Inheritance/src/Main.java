void main() {
    Empleado empl = new Empleado();
    Consultor consul = new Consultor();

    empl.getCargo();//propio
    empl.getNombre();//heredado

    consul.getNumConsultor();//propio
    consul.getNombre();//heredado


   /* Polimorfismo: "Persona" es la clase madre y Empleado, Consultor y Jefe son clases hijas.
    Y, porque son formas diferentes de representar a una misma persona, me permite que en un vector
    que pertenece a la clase madre pueda guardar distintos tipos que pertenezcan a clases hijas.
    Eso hace el polimorfismo, ya que normalmente datos que no son del mismo tipo en Java no pueden mezclarse. */


    Persona []vector = new Persona[5];
    vector [0] = new Persona();
    vector [1] = new Empleado();
    vector [2] = new Consultor();
    vector [3] = new Jefe();

}
