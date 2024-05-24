package model;

public enum EnumTituloReunion {
	REUNION_VIDA_Y_MINSTERIO("Vida y Ministerio Cristianos"), REUNION_PUBLICA("Pública y Estudio de la Atalaya");
	
	private String titulo;
	
	public String getTitulo() {
		return this.titulo;
	}
	
	private EnumTituloReunion(String titulo) {
		this.titulo = titulo;
	}
}
