
public class Estacionamiento
{
   private int disponible;
   private String placa;
   public Estacionamiento(int disponible,String placa){
      this.disponible=disponible; 
      this.placa = placa;
   }
   public int disponible(int disp){
       if (disp!=0){
        return 1;
       }
        return 0;
   }
   public void buscar placa(){
        
   }
}