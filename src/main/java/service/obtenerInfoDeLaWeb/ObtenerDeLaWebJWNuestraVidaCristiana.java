package service.obtenerInfoDeLaWeb;

import model.SeamosMejoresMaestros;

public class ObtenerDeLaWebJWNuestraVidaCristiana {
	private int indiceId;
	
	public ObtenerDeLaWebJWNuestraVidaCristiana(int indiceId) {
		super();
		this.indiceId = indiceId;
	}

	public final int getIndiceId() {
		return indiceId;
	}

	public final void setIndiceId(int indiceId) {
		this.indiceId = indiceId;
	}

	public SeamosMejoresMaestros obtenerSeamosMejoresMaestros() {
		return null;
	}
}
