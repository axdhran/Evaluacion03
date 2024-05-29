package evaluacion;
import java.util.Random;
public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    public Producto(){}

    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String generarCodigo() {
        Random random = new Random();
        int numeroAleatorio = Math.round(random.nextFloat() * 1000);
        return nombre.substring(0, 2).toUpperCase() + marca.substring(0, 3).toUpperCase() + numeroAleatorio;
    }

    @Override
    public String toString() {
        return id + " --- " + codigo + " --- " + nombre + " --- " + marca + " --- $" + precio;
    }
}
