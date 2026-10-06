void main() {

    /* Las clases abstractas no pueden ser instanciadas.
     * Las clases abstractas sirven como moldes para crear otras clases,
     * y pueden tener métodos abstractos.
     *
     * Es como tener un método "correr", pero no le diremos cómo corre,
     * porque simplemente será como una plantilla. Todas las clases que hereden
     * de ella van a poder correr, pero como no se especifica cómo, cada una
     * de sus clases hijas lo puede implementar a su manera.
     *
     * Las clases abstractas se utilizan cuando tenemos varias clases que
     * comparten características o comportamientos, pero necesitamos que
     * cada clase hija implemente ciertas partes de manera diferente.
     *
     * Por ejemplo, podemos tener una clase abstracta "Animal" con un método
     * abstracto "hacerSonido". Un Gato y un Perro son animales, por lo que
     * ambos pueden tener ese método, pero cada uno lo implementará de una
     * manera diferente etc.
     *
     * Una clase no puede heredar de varias clases, sean abstractas o no;
     * solo puede heredar de una clase. Esto es importante recordarlo.
     */


}
