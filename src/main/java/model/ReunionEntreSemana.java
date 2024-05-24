package model;

public class ReunionEntreSemana {
	
	private boolean esReunionConSalas;
	private IntroReunionEntreSemana introReunionEntreSemana;
	private TesorosDeLaBiblia tesorosDeLaBiblia;
	private SeamosMejoresMaestros seamosMejoresMaestros;
	
	public ReunionEntreSemana(boolean esReunionConSalas, IntroReunionEntreSemana introReunionEntreSemana,
			TesorosDeLaBiblia tesorosDeLaBiblia, SeamosMejoresMaestros seamosMejoresMaestros,
			NuestraVidaCristiana nuestraVidaCristiana, ConclusionReunionEntreSemana conclusionReunion) {
		super();
		this.esReunionConSalas = esReunionConSalas;
		this.introReunionEntreSemana = introReunionEntreSemana;
		this.tesorosDeLaBiblia = tesorosDeLaBiblia;
		this.seamosMejoresMaestros = seamosMejoresMaestros;
		this.nuestraVidaCristiana = nuestraVidaCristiana;
		this.conclusionReunion = conclusionReunion;
	}
	
	public final boolean isEsReunionConSalas() {
		return esReunionConSalas;
	}
	public final IntroReunionEntreSemana getIntroReunionEntreSemana() {
		return introReunionEntreSemana;
	}
	public final TesorosDeLaBiblia getTesorosDeLaBiblia() {
		return tesorosDeLaBiblia;
	}
	public final SeamosMejoresMaestros getSeamosMejoresMaestros() {
		return seamosMejoresMaestros;
	}
	public final NuestraVidaCristiana getNuestraVidaCristiana() {
		return nuestraVidaCristiana;
	}
	public final ConclusionReunionEntreSemana getConclusionReunion() {
		return conclusionReunion;
	}
	public final void setEsReunionConSalas(boolean esReunionConSalas) {
		this.esReunionConSalas = esReunionConSalas;
	}
	public final void setIntroReunionEntreSemana(IntroReunionEntreSemana introReunionEntreSemana) {
		this.introReunionEntreSemana = introReunionEntreSemana;
	}
	public final void setTesorosDeLaBiblia(TesorosDeLaBiblia tesorosDeLaBiblia) {
		this.tesorosDeLaBiblia = tesorosDeLaBiblia;
	}
	public final void setSeamosMejoresMaestros(SeamosMejoresMaestros seamosMejoresMaestros) {
		this.seamosMejoresMaestros = seamosMejoresMaestros;
	}
	public final void setNuestraVidaCristiana(NuestraVidaCristiana nuestraVidaCristiana) {
		this.nuestraVidaCristiana = nuestraVidaCristiana;
	}
	public final void setConclusionReunion(ConclusionReunionEntreSemana conclusionReunion) {
		this.conclusionReunion = conclusionReunion;
	}
	private NuestraVidaCristiana nuestraVidaCristiana;
	private ConclusionReunionEntreSemana conclusionReunion;
}
