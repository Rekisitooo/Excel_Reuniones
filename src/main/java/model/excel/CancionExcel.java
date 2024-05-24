package model.excel;

import model.Cancion;

public class CancionExcel implements IPintarExcel {
	
	public CancionExcel(Cancion cancion) {
		super();
		this.cancion = cancion;
	}

	private Cancion cancion;

	public final Cancion getSemanaReunion() {
		return cancion;
	}

	public final void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
