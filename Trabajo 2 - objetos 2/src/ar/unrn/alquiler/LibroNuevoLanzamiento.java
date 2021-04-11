package ar.unrn.alquiler;

public class LibroNuevoLanzamiento extends Libro {

	public LibroNuevoLanzamiento(String nombre, int priceCode) {
		super(nombre, priceCode);
		// TODO Auto-generated constructor stub
	}

	public double precioTotalLibro(int cantidadDiasAlquilados) {
		double monto = 0;
		return monto += cantidadDiasAlquilados * 3;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Libro libro = new LibroNuevoLanzamiento(this.nombreLibro, this.codigoPrecio);
		return libro;

	}
	
	public int tieneBonusPorDiaAlquiler(int diasDeAlquiler) {
		if(diasDeAlquiler > 1)
			return 2;
		
		return 1;
	}
}
