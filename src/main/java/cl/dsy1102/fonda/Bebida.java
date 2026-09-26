package cl.dsy1102.fonda;

public abstract class Bebida {
    protected String nombre;
    protected int volumen;
    protected int stock;

    public Bebida(String nombre, int volumen, int stock) {
        this.nombre = nombre;
        this.volumen = volumen;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    abstract double calcularPrecio();
    public String obtenerDetalle() {
        String detalle = "";
        detalle += "Nombre: " + this.nombre + "\n";
        detalle += "Volumen: " + this.volumen + "\n";
        detalle += "Stock: " + this.stock + "\n";
        return detalle;
    }
}
