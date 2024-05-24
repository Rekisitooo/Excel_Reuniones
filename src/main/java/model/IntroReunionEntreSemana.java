package model;

public class IntroReunionEntreSemana {

	private String cancion;
	private String palabrasIntro;
	
	public IntroReunionEntreSemana(String cancion, String palabrasIntro) {
		super();
		this.cancion = cancion;
		this.palabrasIntro = palabrasIntro;
	}
	
	public final String getCancion() {
		return cancion;
	}
	public final String getPalabrasIntro() {
		return palabrasIntro;
	}
	public final void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public final void setPalabrasIntro(String palabrasIntro) {
		this.palabrasIntro = palabrasIntro;
	}
	
}
