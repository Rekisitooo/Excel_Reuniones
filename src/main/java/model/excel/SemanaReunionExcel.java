package model.excel;

import model.SemanaReunion;

public class SemanaReunionExcel implements IPintarExcel {
	
	public SemanaReunionExcel(SemanaReunion semanaReunion) {
		super();
		this.semanaReunion = semanaReunion;
	}

	private SemanaReunion semanaReunion;

	public final SemanaReunion getSemanaReunion() {
		return semanaReunion;
	}

	public final void setSemanaReunion(SemanaReunion semanaReunion) {
		this.semanaReunion = semanaReunion;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
