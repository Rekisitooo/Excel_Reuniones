package model;

public class SemanaReunion {
	private String diaDelMesFinalSemana;
	private String diaDelMesInicioSemana;
	private String mesDiaInicio;
	private String mesDiaFinalSemana;
	
	public SemanaReunion(String diaDelMesFinalSemana, String diaDelMesInicioSemana, String mesDiaInicio,
			String mesDiaFinalSemana) {
		super();
		this.diaDelMesFinalSemana = diaDelMesFinalSemana;
		this.diaDelMesInicioSemana = diaDelMesInicioSemana;
		this.mesDiaInicio = mesDiaInicio;
		this.mesDiaFinalSemana = mesDiaFinalSemana;
	}

	public final String getDiaDelMesFinalSemana() {
		return diaDelMesFinalSemana;
	}

	public final String getDiaDelMesInicioSemana() {
		return diaDelMesInicioSemana;
	}

	public final String getMesDiaInicio() {
		return mesDiaInicio;
	}

	public final String getMesDiaFinalSemana() {
		return mesDiaFinalSemana;
	}

	public final void setDiaDelMesFinalSemana(String diaDelMesFinalSemana) {
		this.diaDelMesFinalSemana = diaDelMesFinalSemana;
	}

	public final void setDiaDelMesInicioSemana(String diaDelMesInicioSemana) {
		this.diaDelMesInicioSemana = diaDelMesInicioSemana;
	}

	public final void setMesDiaInicio(String mesDiaInicio) {
		this.mesDiaInicio = mesDiaInicio;
	}

	public final void setMesDiaFinalSemana(String mesDiaFinalSemana) {
		this.mesDiaFinalSemana = mesDiaFinalSemana;
	}
}
