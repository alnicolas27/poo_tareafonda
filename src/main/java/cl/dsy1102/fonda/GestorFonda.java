package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    private List<Bebida> bebidas = new ArrayList<>();


    public void registrar(Bebida labebida){
        bebidas.add(labebida);
        System.out.println(labebida.getNombre() + " registrada correctamente.");
    }


    public List<Bebida> getBebidas() {
        return bebidas;
    }
    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }


    public List<Bebida> buscarPorNombre(String nombreBuscarBebida) {
        List<Bebida> bebidasEncontradas = new ArrayList<>();
        for (Bebida bebida : this.getBebidas()) {
            if (bebida.getNombre().equals(nombreBuscarBebida)) {
                bebidasEncontradas.add(bebida);
            }
        }
        return bebidasEncontradas;

    }

    public void vender (String nombreBuscarBebida, int unidades){
        List<Bebida> bebidasParaVender = this.buscarPorNombre(nombreBuscarBebida);
        for (Bebida bebida : bebidasParaVender) {
            if (bebida.getStock() >= unidades){
                if (bebida instanceof ConsumoResponsable){

                }
            }
        }
    }


}
