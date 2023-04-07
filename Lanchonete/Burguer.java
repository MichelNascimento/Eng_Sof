package Lanchonete;

public class Burguer extends Produto {
	
	private int Gramas;
	
	public void  EscolherBurguer(int x) { 
        if(x==1){
            System.out.println("Burguer 300 gramas");
        } 
        else if(x==2){
            System.out.println("Burguer 200 gramas");
        }    			
	}
		
}