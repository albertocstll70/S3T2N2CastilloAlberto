package tienda.pasarela;

public class MetodoDePago {

	private String identificador;
	private double saldo;

	public MetodoDePago(String identificador, double saldo) {
		this.identificador = identificador;
		this.saldo = saldo;
	}

	public String getIdentificador() {
		return identificador;
	}

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void pagos(ICallback callback, double cantidadPagar) {

		if (cantidadPagar > this.saldo) {
			callback.llamada(false);

		} else if (cantidadPagar <= this.saldo) {
			this.setSaldo(this.saldo - cantidadPagar);
			callback.llamada(true);
		}
	}
}
