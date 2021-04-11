package ar.unrn.alquiler;

public class LibroInfantil extends Libro {

	public LibroInfantil(String nombre, int priceCode) {
		super(nombre, priceCode);
		// TODO Auto-generated constructor stub
	}

	public double precioTotalLibro(int cantidadDiasAlquilados) {
		double monto = 0;
		monto += 1.5;
		if (cantidadDiasAlquilados > 3)

			monto += (cantidadDiasAlquilados - 3) * 1.5;

		return monto;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Libro libro = new LibroInfantil(this.nombreLibro, this.codigoPrecio);
		return libro;

	}
}
