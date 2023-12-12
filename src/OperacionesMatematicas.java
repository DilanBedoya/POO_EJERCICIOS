public class OperacionesMatematicas {

    public void suma(int num1, int num2){
        int suma;
        suma=num1+num2;
        System.out.println("\nMétodo 1");
        System.out.println("Num 1: "+num1 +", Num 2: "+num2+", Suma: "+suma);
    }
    public void suma(int num1, int num2,int num3){
        int suma;
        suma=num1+num2+num3;
        System.out.println("\nMétodo 2");
        System.out.println("Num 1: "+num1 +", Num 2: "+num2+ ", Num 2: "+num3+", Suma: "+suma);
    }
    public void suma(double num1, double num2){
        double suma;
        suma=num1+num2;
        System.out.println("\nMétodo 3");
        System.out.println("Num 1: "+num1 +", Num 2: "+num2+", Suma: "+suma);
    }

    public static void main(String[] args){
        OperacionesMatematicas operacion1=new OperacionesMatematicas();

        operacion1.suma(2,3);
        operacion1.suma(1,2,3);
        operacion1.suma(2.5,4.5);
    }
}
