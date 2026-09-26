package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumen, int stock, int azucarPorLitro) {
        super(nombre, volumen, stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return this.azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    public double calcularPrecio() {
        double precioBase = (double)2000.0F;
        if (this.getAzucarPorLitro() > 80) {
            precioBase += precioBase * 0.1;
        }

        return precioBase;
    }

    public String obtenerDetalle() {
        String detalle = "";
        String var10000 = this.getNombre();
        detalle = "Tipo: Bebida sin alcohol   | Nombre: " + var10000 + " | Volumen: " + this.getVolumen() + " | Stock: " + this.getStock() + "| Azúcar: " + this.getAzucarPorLitro() + "| Precio: " + this.calcularPrecio();
        return detalle;
    }
}