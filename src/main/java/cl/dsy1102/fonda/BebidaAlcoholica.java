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

    public int getLimiteUnidades() {
        return this.limiteUnidades;
    }

    public void setLimiteUnidades(int limiteUnidades) {
        this.limiteUnidades = limiteUnidades;
    }

    public double getGradosAlcohol() {
        return this.gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) throws IllegalArgumentException {
        if ((double)0.5F <= gradosAlcohol && gradosAlcohol <= (double)45.0F) {
            this.gradosAlcohol = gradosAlcohol;
        } else {
            throw new IllegalArgumentException("Los grados de alcohol tienen que estar entre 0.5% y 45%.");
        }
    }

    public boolean isCertificada() {
        return this.certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return this.ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    public double calcularPrecio() {
        String cert = "No";
        double precioBase = (double)3500.0F;
        if (this.isCertificada()) {
            cert = "sí";
            return precioBase;
        } else {
            if (!this.isCertificada()) {
                precioBase += precioBase * 0.2;
            }

            return precioBase;
        }
    }

    public String obtenerDetalle() {
        String detalle = "";
        String var10000 = this.getNombre();
        detalle = "Tipo: Bebida sin alcohol   | Nombre: " + var10000 + " | Volumen: " + this.getVolumen() + " | Stock: " + this.getStock() + "| Grados: " + this.getGradosAlcohol() + "| Certificada: " + this.isCertificada() + "| Venta restrigida:" + this.isVentaRestringida() + "| Precio:" + this.calcularPrecio();
        return detalle;
    }

    public boolean tieneVentaRestringida() {
        return this.ventaRestringida;
    }

    public void restringirVenta() {
        this.ventaRestringida = true;
    }

    public boolean superaLimites() {
        return this.limiteUnidades > 3;
    }
}
