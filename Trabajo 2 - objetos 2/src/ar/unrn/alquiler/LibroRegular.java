package ar.unrn.alquiler;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre, int priceCode) {
		super(nombre, priceCode);
		// TODO Auto-generated constructor stub
	}

	public double precioTotalLibro(int cantidadDiasAlquilados) {
		double monto = 0;
		monto += 2;

		if (cantidadDiasAlquilados > 2)
			monto += (cantidadDiasAlquilados - 2) * 1.5;

		return monto;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Libro libro = new LibroRegular(this.nombreLibro, this.codigoPrecio);
		return libro;

	}
}
