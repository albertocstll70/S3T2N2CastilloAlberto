package tienda;

import tienda.pasarela.DeudaBancaria;
import tienda.pasarela.PayPal;
import tienda.pasarela.TarjetaCredito;

public class Main {

	public static void main(String[] args) {
		
		//pasarelas de pago
	TarjetaCredito t1 = new TarjetaCredito("321321321321",500);
	DeudaBancaria d1 = new DeudaBancaria("2468101214",1500);
	PayPal p1 = new PayPal ("2530406012",7000);
		
	
	
	//produtos
	
	
	Producto pro1 = new Producto("Zapatillas Mujer", 65.95);
	Producto pro2 = new Producto("Zapatillas Hombre", 50.95);
	Producto pro3 = new Producto("Zapatos Hombre", 105.95);
	Producto pro4 = new Producto("Zapatos Mujer", 95.95);
	Producto pro5 = new Producto("Zapatos infatil", 35.95);
	
	
     System.out.println(t1.getSaldo());
     
     TiendaZapatos cobro = new TiendaZapatos(t1);
     
     cobro.cobrar(pro1.getPrecio()+pro5.getPrecio());
     System.out.println(t1.getSaldo());
     
     
     
     TiendaZapatos cobro2 = new TiendaZapatos(d1);
     cobro2.cobrar(pro3.getPrecio()+pro4.getPrecio());
     System.out.println(d1.getSaldo());
     
     
     
     TiendaZapatos cobro3 = new TiendaZapatos(p1);
     cobro3.cobrar(pro3.getPrecio()+pro4.getPrecio()+pro1.getPrecio()+pro2.getPrecio());
     System.out.println(p1.getSaldo());
     
     
     
     //prueba operacion denegada
     
     cobro.cobrar(625);
     System.out.println(t1.getSaldo());
     
     
      
	}

}
