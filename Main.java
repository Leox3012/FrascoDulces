/** 
@author Leo V 
@version 1.0 
@since 2024
@param argumentos de la linea de comandos 
 */

public class Main {

    String sabor;
    int cantidad;
    String fechaEnvase;

    public static void main(String[] args) {
        
        // Crear un frasco de dulce con una cantidad inicial de 200 gramos
        FrascoDulce frasco = new FrascoDulce();
        frasco.cantidad = 200;

        // Tratar de envasar 250 gramos de dulce
        boolean envasadoExitoso = frasco.envasarDulce(250);
        if (envasadoExitoso) {
            System.out.println("Se envasaron 250 gramos de dulce.");
        } else {
            System.out.println("No se pudieron envasar 250 gramos de dulce. Solo se envasaron 200 gramos.");
        }

        // Intentar sacar 150 gramos de dulce
        int cantidadSacada1 = frasco.sacarDulce(150);
        System.out.println("Se sacaron " + cantidadSacada1 + " gramos de dulce.");

        // Intentar sacar 60 gramos de dulce
        int cantidadSacada2 = frasco.sacarDulce(60);
        System.out.println("Se sacaron " + cantidadSacada2 + " gramos de dulce.");

        // Mostrar la cantidad de dulce que queda en el frasco
        int cantidadRestante = frasco.consultarCantidad();
        System.out.println("Quedan " + cantidadRestante + " gramos de dulce en el frasco.");
    }
}
