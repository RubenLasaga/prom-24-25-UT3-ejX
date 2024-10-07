public class Persona {

    public String nombre;
    public int edad;

    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void clasificarEdad(){
        if (this.edad <= 10){
            System.out.println(this.nombre+" es un niño.");
        } else if(this.edad >= 11 && this.edad <= 19){
            System.out.println(this.nombre+" es un adolescente.");
        } else{
            System.out.println(this.nombre+" es un adulto.");
        }
    }
}
