public class Estudiantes {
    //atributos
    public String nombre;
    public int edad;


    public Estudiantes(String nombre, int edad) { //método contructor
        //este
        this.nombre = nombre;//parámetros
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public static void main(String[] args) {

        Estudiantes estudiantes_desarrollo = new Estudiantes("Dilan", 20);
        estudiantes_desarrollo.saludar();

    }
}
