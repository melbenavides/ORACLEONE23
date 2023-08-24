package def;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo=300;
		System.out.println(miCuenta.saldo);
		miCuenta.depositar(50);
		System.out.println(miCuenta.saldo);
	}
}
