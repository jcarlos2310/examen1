
public class Estacionamiento
{
   private int disponible;
   private String placa;
   public Estacionamiento(int disponible,String placa){
      this.disponible=disponible; 
      
   }
   public int disponible(int disp){
       disp=Carros.numerosCarros;
       if (disp<=150){
        return 1;
       }
        return 0;
   }
   public void buscarPlaca(){
        placa=Carro.bucarPlaca();        
   }
}