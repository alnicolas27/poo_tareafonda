package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida{
    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumen, int stock, int azucarPorLitro){
        super(nombre,volumen,stock);
        this.azucarPorLitro=azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }
    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    //comportamiento

    @Override
    public double calcularPrecio() {
        double precioBase = 2000.0;
        if (getAzucarPorLitro()>80){
            precioBase =precioBase + precioBase *0.1;
        }
        return precioBase;
    }

    @Override
    public String obtenerDetalle() {
        String detalle = "";
        detalle = "Tipo: Bebida sin alcohol  " + " | Nombre: " + getNombre() + " | Volumen: " + getVolumen() +
                " | Stock: " + getStock() + "| Azúcar: " + getAzucarPorLitro() + "| Precio: " + calcularPrecio();
        return detalle;
    }
}
