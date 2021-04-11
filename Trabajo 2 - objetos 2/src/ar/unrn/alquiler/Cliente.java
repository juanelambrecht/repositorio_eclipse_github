package ar.unrn.alquiler;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	private String nombreCliente;

	public Cliente(String nombre) {
		this.nombreCliente = nombre;
	}

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		double deudaDeAlquiler = 0;
		int PuntosTotales = 0;

		for (Alquiler alquiler : alquileres) {
			resultado = alquiler.valorDeudaPorAlquiler();
			deudaDeAlquiler += (double) resultado[0];
			PuntosTotales += (int) resultado[1];
		}

		resultado[0] = deudaDeAlquiler;
		resultado[1] = PuntosTotales;
		return resultado;
	}

	public void alquilarLibroCliente(Alquiler rental) {
		alquileres.add(rental);
	}

	public void mostrarDeudaYPuntosObtenidos(Object[] resultado) {
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);
	}

}