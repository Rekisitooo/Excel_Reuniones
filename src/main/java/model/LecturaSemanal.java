package model;

public class LecturaSemanal {
	private String libroDeLaBiblia;
	private String versiculoInicio;
	private String versiculoFin;
	
	public LecturaSemanal(String libroDeLaBiblia, String versiculoInicio, String versiculoFin) {
		super();
		this.libroDeLaBiblia = libroDeLaBiblia;
		this.versiculoInicio = versiculoInicio;
		this.versiculoFin = versiculoFin;
	}
	
	public final String getLibroDeLaBiblia() {
		return libroDeLaBiblia;
	}
	public final String getVersiculoInicio() {
		return versiculoInicio;
	}
	public final String getVersiculoFin() {
		return versiculoFin;
	}
	public final void setLibroDeLaBiblia(String libroDeLaBiblia) {
		this.libroDeLaBiblia = libroDeLaBiblia;
	}
	public final void setVersiculoInicio(String versiculoInicio) {
		this.versiculoInicio = versiculoInicio;
	}
	public final void setVersiculoFin(String versiculoFin) {
		this.versiculoFin = versiculoFin;
	}
}
