package evaluacion;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int idCounter = 1;
        String r = "s";

        while (r.equals("s")){
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.next();

            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.next();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();  // Consumir el salto de línea

            Producto producto = new Producto(idCounter++, nombre, marca, precio);
            productos.add(producto);

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            r = scanner.next().toLowerCase();
        }

        System.out.println("Productos registrados:");
        System.out.println("Id --- Codigo --- Nombre --- Marca --- Precio");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
