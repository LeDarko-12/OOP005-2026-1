package constructores;

public class Constructores {
    public static void main(String[] args) {
    Producto p1 = new Producto ("Mouse", 25000);
    Producto p2 = new Producto ("Teclado", 45000);
    Producto p3 = new Producto ("Monitor", 780000);

    System.out.println("Producto 1:");
    p1.mostrar();
    
    System.out.println("\nProducto 2:");
    p2.mostrar();
    
    System.out.println("\nProducto 3:");
    p3.mostrar();
    }
}
