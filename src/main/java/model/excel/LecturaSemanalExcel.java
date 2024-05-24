package model.excel;

import model.LecturaSemanal;

public class LecturaSemanalExcel implements IPintarExcel {
	
	public LecturaSemanalExcel(LecturaSemanal lecturaSemanal) {
		super();
		this.lecturaSemanal = lecturaSemanal;
	}

	private LecturaSemanal lecturaSemanal;

	public final LecturaSemanal getSemanaReunion() {
		return lecturaSemanal;
	}

	public final void setLecturaSemanal(LecturaSemanal lecturaSemanal) {
		this.lecturaSemanal = lecturaSemanal;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
