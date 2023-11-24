//convencion correctamente
public class Persona {
    public String nombre;
    public int cedula;
    public int edad;


    //el contructor permite inicializar los atributos
    public Persona(String nombre, int cedula, int edad){
        //el primer nombre es el atributo y el segundo a los parámetros
        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
    }
    public void saludar(){
        System.out.println(this.nombre + " está saludando");
    }

    public static void main(String[] args){
        Persona persona1=new Persona("Dilan", 1728172881, 20);
        Persona persona2=new Persona("Alex", 1728395968, 20 );
        Persona persona3=new Persona("Alexis", 172849503, 23 );

        System.out.printf("El nombre es %s, su cédula es %d, su edad es %d\n",persona1.nombre, persona1.cedula,persona1.edad);
        persona1.saludar();
        System.out.printf("El nombre es %s, su cédula es %d, su edad es %d\n",persona2.nombre, persona2.cedula,persona2.edad);
        persona2.saludar();
        System.out.printf("El nombre es %s, su cédula es %d, su edad es %d\n",persona3.nombre, persona3.cedula,persona3.edad);
        persona3.saludar();

    }
}
