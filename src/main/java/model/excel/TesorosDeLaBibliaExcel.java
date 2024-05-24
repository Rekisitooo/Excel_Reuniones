package model.excel;

import model.TesorosDeLaBiblia;

public class TesorosDeLaBibliaExcel implements IPintarExcel {
	
	public TesorosDeLaBibliaExcel(TesorosDeLaBiblia tesorosDeLaBiblia) {
		super();
		this.tesorosDeLaBiblia = tesorosDeLaBiblia;
	}

	private TesorosDeLaBiblia tesorosDeLaBiblia;

	public final TesorosDeLaBiblia getSemanaReunion() {
		return tesorosDeLaBiblia;
	}

	public final void setTesorosDeLaBiblia(TesorosDeLaBiblia tesorosDeLaBiblia) {
		this.tesorosDeLaBiblia = tesorosDeLaBiblia;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
