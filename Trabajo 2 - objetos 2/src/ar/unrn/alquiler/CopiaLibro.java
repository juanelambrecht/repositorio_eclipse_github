package ar.unrn.alquiler;

public class CopiaLibro {
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Libro libro() {
		return libro;
	}

	public int codigoPrecio() {
		return this.libro.codigoPrecio();
	}

}