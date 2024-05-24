package model;

public class Parte {

	private String titulo;
	private int duracion;
	
	public Parte(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	public final String getTitulo() {
		return titulo;
	}
	public final int getDuracion() {
		return duracion;
	}
	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public final void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
