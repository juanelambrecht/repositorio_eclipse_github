package ar.unrn.alquiler;

public class Main {

	public static void main(String args[]) {
		// aplique herencia
		Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
		Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);

		try {

			// Nombres de Variables
			int diasAlquilerElTunel = 5;
			int diasAlquilerAntesDelFin = 3;
			String nombreCliente = "Javier";

			Alquiler alquilerElTunel = new Alquiler(elTunel, diasAlquilerElTunel);
			Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, diasAlquilerAntesDelFin);

			Cliente cliente = new Cliente(nombreCliente);

			// No ser generico
			cliente.alquilarLibroCliente(alquilerElTunel);
			cliente.alquilarLibroCliente(alquilerAntesDelFin);

			Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

			// empujar a la clase el comportamiento
			cliente.mostrarDeudaYPuntosObtenidos(resultado);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
