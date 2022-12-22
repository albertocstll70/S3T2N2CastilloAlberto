package tienda;

import tienda.pasarela.ICallback;
import tienda.pasarela.MetodoDePago;

public class TiendaZapatos implements ICallback{
	
	MetodoDePago pasarela;
	
	public TiendaZapatos(MetodoDePago pasarela) {
		this.pasarela = pasarela;
		
		
	}
	
	
	public void cobrar(double cantidad) {
		pasarela.pagos(this, cantidad);	
	
	}
	

	@Override
	public void llamada(boolean respuesta) {
		
		if(respuesta) {
			System.out.println("Opreracion correcta");
		}else {
			System.out.println("Opreracion denegada");
		}
				
		
		
	}

}
