package Lanchonete;

	public class Sobremesa extends Produto {
		
		private String Tamanho;
		
		public void  PedirSobremesa(int x) {
            if(x==1){
                System.out.println("Sobremesa grande");
            } 
            else if(x==2){
                System.out.println("Sobremesa pequena");
            }   
			
		}
	}