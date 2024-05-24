package model.excel;

import model.ConclusionReunionEntreSemana;

public class ConclusionReunionEntreSemanaExcel implements IPintarExcel {
	
	public ConclusionReunionEntreSemanaExcel(ConclusionReunionEntreSemana conclusionReunionEntreSemana) {
		super();
		this.conclusionReunionEntreSemana = conclusionReunionEntreSemana;
	}

	private ConclusionReunionEntreSemana conclusionReunionEntreSemana;

	public final ConclusionReunionEntreSemana getSemanaReunion() {
		return conclusionReunionEntreSemana;
	}

	public final void setConclusionReunionEntreSemana(ConclusionReunionEntreSemana conclusionReunionEntreSemana) {
		this.conclusionReunionEntreSemana = conclusionReunionEntreSemana;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
