public class Espada {
    //atributos
    public double damage;
    public String nombre;
    public String color;
    public String material;
    //metodo constructor
    public Espada(double damage,String nombre, String color, String material){
        this.damage=damage;
        this.nombre=nombre;
        this.color=color;
        this.material=material;
    }

    //metodo
    public void guardar_espada(){
        System.out.println(this.nombre + " ha sido guardada");
    }

    public void sacar_espada(){
        System.out.println(this.nombre + " ha sido equipada");
    }

    public static void main(String[] args){
    Espada espada1=new Espada(20.5,"God","negro","Diamante");
    Espada espada2=new Espada(15.4,"Sword","café","Madera");
    Espada espada3=new Espada(18.5,"Swordigo","Blanco","Oro");

    System.out.printf("La espada %s, tiene: %.2f de daño, su color es: %s, hecha de %s\n",espada1.nombre, espada1.damage,espada1.color,espada1.material);
    System.out.printf("La espada %s, tiene: %.2f de daño, su color es: %s, hecha de %s\n",espada2.nombre, espada2.damage,espada2.color,espada2.material);
    System.out.printf("La espada %s, tiene: %.2f de daño, su color es: %s, hecha de %s\n",espada3.nombre, espada3.damage,espada3.color,espada3.material);

    espada1.sacar_espada();
    espada2.guardar_espada();


    }


}
