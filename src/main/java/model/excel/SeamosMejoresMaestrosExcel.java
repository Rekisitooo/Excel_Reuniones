package model.excel;

import model.SeamosMejoresMaestros;

public class SeamosMejoresMaestrosExcel implements IPintarExcel {
	
	public SeamosMejoresMaestrosExcel(SeamosMejoresMaestros seamosMejoresMaestros) {
		super();
		this.seamosMejoresMaestros = seamosMejoresMaestros;
	}

	private SeamosMejoresMaestros seamosMejoresMaestros;

	public final SeamosMejoresMaestros getSemanaReunion() {
		return seamosMejoresMaestros;
	}

	public final void setSeamosMejoresMaestros(SeamosMejoresMaestros seamosMejoresMaestros) {
		this.seamosMejoresMaestros = seamosMejoresMaestros;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
