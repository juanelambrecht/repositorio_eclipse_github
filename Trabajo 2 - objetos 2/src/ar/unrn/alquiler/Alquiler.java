package ar.unrn.alquiler;

public class Alquiler {
	// Cambie nombre de CopiaLibro por Libro
	private Libro copiaLibro;
	private int diasAlquilados;

	public Alquiler(Libro copia, int diasAlquilados) throws CloneNotSupportedException {
		this.copiaLibro = (Libro) copia.clone();
		this.diasAlquilados = diasAlquilados;
	}

	public int diasAlquilados() {
		return this.diasAlquilados;
	}

	public Libro copia() {
		return this.copiaLibro;
	}

	// Agregue metodo para devolver el codigo de precio
	public int CodigoPrecioLibro() {
		return this.copiaLibro.codigoPrecio();
	}

	// Metodo para verificar cantidad de dias alquilados
	public boolean verificarCantidadDiasAlquilados(int dias) {
		return this.diasAlquilados() > dias;
	}

	public Object[] valorDeudaPorAlquiler() {
		Object[] resultado = new Object[2];

		resultado[0] = (double) this.copiaLibro.precioTotalLibro(this.diasAlquilados);
		resultado[1] = this.copiaLibro.tieneBonusPorDiaAlquiler(this.diasAlquilados);
		
		return resultado;
	}

}
