package model.excel;

import model.ReunionEntreSemana;

public class ReunionEntreSemanaExcel implements IPintarExcel {
	
	private ReunionEntreSemana reunionEntreSemana;
	private CabeceraReunionExcel cabeceraReunion;
	private CuerpoReunionExcel cuerpoReunion;
	private Hoja hoja;
	
	public ReunionEntreSemanaExcel(ReunionEntreSemana reunionEntreSemana, CabeceraReunionExcel cabeceraReunion,
			CuerpoReunionExcel cuerpoReunion, Hoja hoja) {
		super();
		this.reunionEntreSemana = reunionEntreSemana;
		this.cabeceraReunion = cabeceraReunion;
		this.cuerpoReunion = cuerpoReunion;
		this.hoja = hoja;
	}

	public final ReunionEntreSemana getReunionEntreSemana() {
		return reunionEntreSemana;
	}

	public final CabeceraReunionExcel getCabeceraReunion() {
		return cabeceraReunion;
	}

	public final CuerpoReunionExcel getCuerpoReunion() {
		return cuerpoReunion;
	}

	public final Hoja getHoja() {
		return hoja;
	}

	public final void setReunionEntreSemana(ReunionEntreSemana reunionEntreSemana) {
		this.reunionEntreSemana = reunionEntreSemana;
	}

	public final void setCabeceraReunion(CabeceraReunionExcel cabeceraReunion) {
		this.cabeceraReunion = cabeceraReunion;
	}

	public final void setCuerpoReunion(CuerpoReunionExcel cuerpoReunion) {
		this.cuerpoReunion = cuerpoReunion;
	}

	public final void setHoja(Hoja hoja) {
		this.hoja = hoja;
	}
	
	@Override
	public boolean pintar() {
		return true;
	}


}
