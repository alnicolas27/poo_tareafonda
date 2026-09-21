package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida {
    protected int limiteUnidades;
    protected double gradosAlcohol;
    protected boolean certificada;
    protected boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumen, int stock, int limiteUnidades, double gradosAlcohol, boolean certificada, boolean ventaRestringida) {
        super(nombre, volumen, stock);
        this.limiteUnidades = limiteUnidades;
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
    }

    public int getLimiteUnidades() {
        return limiteUnidades;
    }

    public void setLimiteUnidades(int limiteUnidades) {
        this.limiteUnidades = limiteUnidades;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
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

    @Override
    double calcularPrecio() {
        return calcularPrecio();
    }
}
