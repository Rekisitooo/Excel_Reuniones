package model.excel;

import model.LecturaSemanal;
import model.SemanaReunion;

public class CabeceraReunionExcel implements IPintarExcel {

	private LecturaSemanal lecturaSemanal;
	private SemanaReunion semanaReunion;
	
	public CabeceraReunionExcel(LecturaSemanal lecturaSemanal, SemanaReunion semanaReunion) {
		super();
		this.lecturaSemanal = lecturaSemanal;
		this.semanaReunion = semanaReunion;
	}

	public final LecturaSemanal getLecturaSemanal() {
		return lecturaSemanal;
	}

	public final SemanaReunion getSemanaReunion() {
		return semanaReunion;
	}

	public final void setLecturaSemanal(LecturaSemanal lecturaSemanal) {
		this.lecturaSemanal = lecturaSemanal;
	}

	public final void setSemanaReunion(SemanaReunion semanaReunion) {
		this.semanaReunion = semanaReunion;
	}

	@Override
	public boolean pintar() {
		return false;
	}
}
