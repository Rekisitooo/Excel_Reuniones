package model;

public class Cancion {

	private String titulo;
	private String numero;
	private boolean esCancionConOracion;
	
	public Cancion(String titulo, String numero, boolean esCancionConOracion) {
		super();
		this.titulo = titulo;
		this.numero = numero;
		this.esCancionConOracion = esCancionConOracion;
	}
	
	public final String getTitulo() {
		return titulo;
	}
	public final String getNumero() {
		return numero;
	}
	public final boolean isEsCancionConOracion() {
		return esCancionConOracion;
	}
	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public final void setNumero(String numero) {
		this.numero = numero;
	}
	public final void setEsCancionConOracion(boolean esCancionConOracion) {
		this.esCancionConOracion = esCancionConOracion;
	}
	
}
