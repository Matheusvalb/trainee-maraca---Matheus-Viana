package fatorial;

public class fatoriaal {

	public static void main(String[] args) {
	int x=10,i;
	int multiplicador=1;
	
	for(i=0;i<10;i++) {
		
		multiplicador = (x-i)*multiplicador;
		
	}
	System.out.print(multiplicador);
	
	
	}
	}
