package model;

import java.util.List;

public class SeamosMejoresMaestros {
	private List<Parte> listaPartes;

	public SeamosMejoresMaestros(List<Parte> listaPartes) {
		super();
		this.listaPartes = listaPartes;
	}

	public final List<Parte> getListaPartes() {
		return listaPartes;
	}

	public final void setListaPartes(List<Parte> listaPartes) {
		this.listaPartes = listaPartes;
	}
	
}
