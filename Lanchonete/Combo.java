package Lanchonete;

public class Combo {
	
	private Burguer burguer = new Burguer();
	private Bebida bebida = new Bebida();
	private Sobremesa sobremesa = new Sobremesa();	
	int tipo;
	public void CriarCombo(int tipo) {		
		
		//int tipo1 = 0;
		
		switch(tipo) {		
            case 1: System.out.println("Combo 1: ");
            burguer.EscolherBurguer(tipo);
            bebida.PedirBebida(tipo);
            sobremesa.PedirSobremesa(tipo);
            break;
            
            case 2: System.out.println("Combo 2: ");
            burguer.EscolherBurguer(tipo);
            bebida.PedirBebida(tipo);
            sobremesa.PedirSobremesa(tipo);	
            break;	

            default: System.out.println("Opção inválida.");
	    }
    }   		
}

