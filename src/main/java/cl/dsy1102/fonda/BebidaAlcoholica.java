package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

    private int limiteUnidades;
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumen, int stock, int limiteUnidades, double gradosAlcohol, boolean certificada, boolean ventaRestringida) {
        super(nombre, volumen, stock);
        this.limiteUnidades = limiteUnidades;
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
    }

// GETTERS Y SETTERS
    public int getLimiteUnidades() {
        return limiteUnidades;
    }
    public void setLimiteUnidades(int limiteUnidades) {
        this.limiteUnidades = limiteUnidades;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }
    public void setGradosAlcohol(double gradosAlcohol) throws IllegalArgumentException {
       if (0.5 <= gradosAlcohol && gradosAlcohol <= 45)
           this.gradosAlcohol = gradosAlcohol;
       else {
           throw new IllegalArgumentException("Los grados de alcohol tienen que estar entre 0.5% y 45%.");
       }
    }

    public boolean isCertificada() {
        return certificada;
    }
    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }
    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    //comportamiento
    @Override
    public double calcularPrecio() {
        double precioBase = 3500;
        if (isCertificada() == false) {
            precioBase =precioBase + precioBase *0.2;
        }
        return precioBase;
    }

    @Override
    public String obtenerDetalle() {
        String esCertificada = this.isCertificada() ? "Sí" : "No";
        String esVentaRestringida = this.isVentaRestringida() ? "Sí" : "No";
        String detalle = "";
        detalle = "Tipo: Bebida sin alcohol  " + " | Nombre: " + getNombre() + " | Volumen: " + getVolumen() +
                " | Stock: " + getStock() + "| Grados: "+ getGradosAlcohol() + "| Certificada: " + isCertificada() +
                "| Venta restrigida:"+ isVentaRestringida() + "| Precio:" + calcularPrecio();
        return detalle;
    }

    // comportaiento de interfaces
    @Override
    public boolean tieneVentaRestringida() {
        return this.ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        this.ventaRestringida = true;

    }

    @Override
    public boolean superaLimites() {
        return limiteUnidades > 3;
    }
}
