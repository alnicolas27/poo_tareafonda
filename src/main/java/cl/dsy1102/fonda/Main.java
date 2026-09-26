package cl.dsy1102.fonda;

public class Main {

    public static void main(String[] args) {
        Bebida chicha = new BebidaAlcoholica("Chicha",1000,40,12,5 ,false,false);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour",500,25,18,5, true, false);
        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha",1000,60,95);
        Bebida moteConHuesillo = new BebidaSinAlcohol("Mote Con Huesillo",400,50,70);


       // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        ((BebidaAlcoholica)chicha).restringirVenta();

        // TODO 3: registrarlas todas en el gestor.
        GestorFonda miguelito = new GestorFonda();

        miguelito.registrar(chicha);
        miguelito.registrar(piscoSour);
        miguelito.registrar(chichaSinAlcohol);
        miguelito.registrar(moteConHuesillo);

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.


        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

    }
}
