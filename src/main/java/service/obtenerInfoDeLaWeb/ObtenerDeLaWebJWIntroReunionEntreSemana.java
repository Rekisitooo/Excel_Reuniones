package service.obtenerInfoDeLaWeb;

import model.NuestraVidaCristiana;

public class ObtenerDeLaWebJWIntroReunionEntreSemana {
	private int indiceId;
	
	public ObtenerDeLaWebJWIntroReunionEntreSemana(int indiceId) {
		super();
		this.indiceId = indiceId;
	}

	public final int getIndiceId() {
		return indiceId;
	}

	public final void setIndiceId(int indiceId) {
		this.indiceId = indiceId;
	}

	public NuestraVidaCristiana obtenerNuestraVidaCristiana() {
		return null;
	}
}
