import java.util.Scanner;


//clase padre
class Auto{
    //Atributos
    public String Color;
    //Métodos
    public String Marca;

    public void Acelerar(){
        System.out.println("Ei Coche está acelerando");
    }
    public void Frenar(){
        System.out.println("El Coche está frenando");
    }

}
//clase hija
class CocheDeportivo extends Auto{
    float torque;
}




public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        CocheDeportivo Coche1=new CocheDeportivo(); //Instancia clase hija(creación de objeto)
        Coche1.torque=20;
        Coche1.Color="Negro";
        Coche1.Marca="Ferrari";
        Coche1.Acelerar();
        System.out.println("Torque del coche1: " +Coche1.torque);

    }
}