package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    private List<Bebida> bebidas = new ArrayList<>();

    // Registrar bebidas
    public void registrar(Bebida bebidaRegistrar){
        bebidas.add(bebidaRegistrar);
        System.out.println(bebidaRegistrar.getNombre() + " registrada correctamente.");
    }

    // Buscar bebidas por nombre
    public List<Bebida> buscarPorNombre(String nombreDeBusqueda) {
        System.out.println("=== BUSQUEDA POR NOMBRE : " + nombreDeBusqueda + " ===");
        List<Bebida> bebidasEncontradas = new ArrayList<>();
        for (Bebida bebidaBuscada : bebidas) {
            if (bebidaBuscada.getNombre().equalsIgnoreCase(nombreDeBusqueda)) {
                System.out.println(bebidaBuscada.obtenerDetalle());
                System.out.println ("---");
            }
        }
        return bebidasEncontradas;
    }

    // Vender bebidas

    public void vender(String bebidaRegistrar, int cantidad) {
        for (Bebida bebidaBuscada : bebidas) {
            if (bebidaBuscada.getNombre().equalsIgnoreCase(bebidaRegistrar)) {
                if (bebidaBuscada instanceof ConsumoResponsable) {
                    ConsumoResponsable control = (ConsumoResponsable) bebidaBuscada;
                    if (control.tieneVentaRestringida()) {
                        System.out.println("Venta rechazada: " + bebidaRegistrar + " tiene la venta restringida.");
                        return;
                    }

                    if (control.superaLimites(cantidad)) {
                        int limite;
                        if (bebidaBuscada instanceof BebidaAlcoholica)
                            limite = ((BebidaAlcoholica) bebidaBuscada).getLimiteUnidades();
                        else limite = cantidad;

                        System.out.println("Venta rechazada: " + cantidad +
                                " unidades de " + bebidaRegistrar + "supera límite permitido.");
                        return;
                    }
                }

                bebidaBuscada.setStock(bebidaBuscada.getStock() - cantidad);
                double total = bebidaBuscada.calcularPrecio() * cantidad;
                System.out.println("Venta autorizada: " + cantidad + " x " + bebidaRegistrar + " | Total: " + total);
                return;
            }
        }
        System.out.println("Bebida no encontrada: " + bebidaRegistrar);
    }


}
