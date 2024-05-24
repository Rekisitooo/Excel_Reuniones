package service.obtenerInfoDeLaWeb;

import model.ConclusionReunionEntreSemana;

public class ObtenerDeLaWebJWConclusionReunionEntreSemana {
	private int indiceId;
	
	public ObtenerDeLaWebJWConclusionReunionEntreSemana(int indiceId) {
		super();
		this.indiceId = indiceId;
	}

	public final int getIndiceId() {
		return indiceId;
	}

	public final void setIndiceId(int indiceId) {
		this.indiceId = indiceId;
	}

	public ConclusionReunionEntreSemana obtenerConclusionReunionEntreSemana() {
		return null;
	}
}
