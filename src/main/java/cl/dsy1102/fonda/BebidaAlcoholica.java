package cl.dsy1102.fonda;

import java.io.Serializable;

public class BebidaAlcoholica extends Bebida {

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

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }

    //

}
