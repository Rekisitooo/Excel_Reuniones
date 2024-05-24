package model.excel;

import model.IntroReunionEntreSemana;

public class IntroReunionEntreSemanaExcel implements IPintarExcel {
	
	public IntroReunionEntreSemanaExcel(IntroReunionEntreSemana introReunionEntreSemana) {
		super();
		this.introReunionEntreSemana = introReunionEntreSemana;
	}

	private IntroReunionEntreSemana introReunionEntreSemana;

	public final IntroReunionEntreSemana getSemanaReunion() {
		return introReunionEntreSemana;
	}

	public final void setIntroReunionEntreSemana(IntroReunionEntreSemana introReunionEntreSemana) {
		this.introReunionEntreSemana = introReunionEntreSemana;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
