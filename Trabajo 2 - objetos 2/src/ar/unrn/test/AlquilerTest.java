package ar.unrn.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unrn.alquiler.Alquiler;
import ar.unrn.alquiler.Cliente;
import ar.unrn.alquiler.Libro;
import ar.unrn.alquiler.LibroRegular;

class AlquilerTest {

	@Test
	void CalcularDeudasyPuntosCliente() {
		
				Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
				Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);
								
				try {
					
				int diasAlquilerElTunel = 5;
				int diasAlquilerAntesDelFin = 3;
				String nombreCliente = "Javier";
				
				Alquiler alquilerElTunel = new Alquiler(elTunel, diasAlquilerElTunel);
				Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, diasAlquilerAntesDelFin);
				
				Cliente cliente = new Cliente(nombreCliente);
				
				cliente.alquilarLibroCliente(alquilerElTunel);
				cliente.alquilarLibroCliente(alquilerAntesDelFin);
				
				Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
				
				cliente.mostrarDeudaYPuntosObtenidos(resultado);
				
				assertEquals(10.0,resultado[0]);
				assertEquals(2,resultado[1]);
				
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			
	}

}
