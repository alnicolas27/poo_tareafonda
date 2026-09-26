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

    public void setGradosAlcohol(double gradosAlcohol){
        if (gradosAlcohol < 0.5 || gradosAlcohol > 45.0) {
            throw new IllegalArgumentException( " Debe encontrarse en el rango entre 0.5 y 45 grados de alcohol.");
        }
        this.gradosAlcohol = gradosAlcohol;
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

    //Metodos comportamiento

    @Override
    public double calcularPrecio() {
        double precioBase = 3500.0;
        if (!certificada) {
            precioBase = precioBase + precioBase*0.2;
        } return precioBase;
    }

    @Override
    public String obtenerDetalle() {
        String detalle = "";
        detalle = "Tipo: Bebida sin alcohol   | Nombre: " + getNombre() +
                " | Volumen: " + this.getVolumen() +
                " | Stock: " + this.getStock() +
                " | Grados: " + this.getGradosAlcohol() +
                " | Certificada: " + this.isCertificada() +
                " | Venta restrigida:" + this.isVentaRestringida() +
                " | Precio:" + this.calcularPrecio();
        return detalle;
    }

    //Métodos comportamiento interfaces
    @Override
    public boolean tieneVentaRestringida() {
        return this.ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        this.ventaRestringida = true;
    }

    @Override
    public boolean superaLimites(int cantidad) {
        return this.limiteUnidades > 3;
    }
}
