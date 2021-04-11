package ar.unrn.alquiler;

public class Libro implements Cloneable {
	public static final int INFANTILES = 2;
	public static final int REGULARES = 0;
	public static final int NUEVO_LANZAMIENTO = 1;

	protected String nombreLibro;

	protected int codigoPrecio;

	public Libro(String nombre, int priceCode) {
		this.nombreLibro = nombre;
		this.codigoPrecio = priceCode;
	}

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public String nombre() {
		return nombreLibro;
	}

	public double precioTotalLibro(int cantidadDiasAlquilados) {
		return 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Libro libro = new Libro(this.nombreLibro, this.codigoPrecio);
		return libro;

	}
	
	public int tieneBonusPorDiaAlquiler(int diasDeAlquiler) {
		return 1;
	}
}