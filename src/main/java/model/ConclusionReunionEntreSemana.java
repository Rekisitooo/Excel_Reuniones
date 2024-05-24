package model;

public class ConclusionReunionEntreSemana {
	private Cancion cancion;
	private Parte palabrasDeConclusion;
	
	public ConclusionReunionEntreSemana(Cancion cancion, Parte palabrasDeConclusion) {
		super();
		this.cancion = cancion;
		this.palabrasDeConclusion = palabrasDeConclusion;
	}

	public final Parte getPalabrasDeConclusion() {
		return palabrasDeConclusion;
	}

	public final void setPalabrasDeConclusion(Parte palabrasDeConclusion) {
		this.palabrasDeConclusion = palabrasDeConclusion;
	}

	public final Cancion getCancion() {
		return cancion;
	}

	public final void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

}
