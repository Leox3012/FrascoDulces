public class FrascoDulce {
    
    String sabor;
    int cantidad;
    String fechaEnvase;


    public boolean envasarDulce (int cantidad ) {

        if (this.cantidad + cantidad > 200){
            return false;
        }else {
            this.cantidad += cantidad;
            return true;
        }


    }

    public int sacarDulce (int cantidadAsacar){

        int cantidadSacada = 0;

        if (this.consultarCantidad() >= cantidadAsacar ){

            this.cantidad -= cantidadAsacar;
            cantidadSacada = cantidadAsacar;

         } else {

            cantidadSacada = this.cantidad;
            this.cantidad = 0;
  
        }

        return cantidadSacada;

    }


    public int consultarCantidad (){

        return this.cantidad;
    }


}