package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida{
    protected int azucarPorLitro;

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
}
