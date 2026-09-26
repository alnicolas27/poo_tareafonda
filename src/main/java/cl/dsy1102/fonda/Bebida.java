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
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no es válido.");
        }
        this.nombre = nombre;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen < 100 || volumen > 3000) {
            throw new IllegalArgumentException("El volumen tiene que estar entre 100ml y 3000ml.");
        }
        this.volumen = volumen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Debe ser un valor mayor que cero.");
        }
        this.stock = stock;
    }

    //comportamiento
    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();

    public String toString() {
        return "Nombre: " + getNombre() + "| Volumen: " + getVolumen();
    }
}
