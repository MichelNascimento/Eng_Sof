package Lanchonete;

public class Bebida extends Produto {
	
	private int ML;
	
	public void  PedirBebida(int x) {
		if(x==1){
			System.out.println("Bebida 500 ML");
		} 
		else if(x==2){
			System.out.println("Bebida 300 ML");
		}  		
	}
}