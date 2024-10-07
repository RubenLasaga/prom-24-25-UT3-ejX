public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Manolo",65);
        Persona persona2 = new Persona("Javier",19);
        Persona persona3 = new Persona("Mario",11);
        Persona persona4 = new Persona("Carlos",7);

        persona1.clasificarEdad();
        persona2.clasificarEdad();
        persona3.clasificarEdad();
        persona4.clasificarEdad();
    }
}