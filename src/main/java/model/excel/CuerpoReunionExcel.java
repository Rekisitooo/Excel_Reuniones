package model.excel;

public class CuerpoReunionExcel implements IPintarExcel {

	private IntroReunionEntreSemanaExcel introReunionEntreSemanaExcel;
	private TesorosDeLaBibliaExcel tesorosDeLaBibliaExcel;
	private SeamosMejoresMaestrosExcel seamosMejoresMaestrosExcel;
	private NuestraVidaCristianaExcel nuestraVidaCristianaExcel;
	
	public CuerpoReunionExcel(IntroReunionEntreSemanaExcel introReunionEntreSemanaExcel,
			TesorosDeLaBibliaExcel tesorosDeLaBibliaExcel, SeamosMejoresMaestrosExcel seamosMejoresMaestrosExcel,
			NuestraVidaCristianaExcel nuestraVidaCristianaExcel) {
		super();
		this.introReunionEntreSemanaExcel = introReunionEntreSemanaExcel;
		this.tesorosDeLaBibliaExcel = tesorosDeLaBibliaExcel;
		this.seamosMejoresMaestrosExcel = seamosMejoresMaestrosExcel;
		this.nuestraVidaCristianaExcel = nuestraVidaCristianaExcel;
	}

	public final IntroReunionEntreSemanaExcel getIntroReunionEntreSemanaExcel() {
		return introReunionEntreSemanaExcel;
	}

	public final TesorosDeLaBibliaExcel getTesorosDeLaBibliaExcel() {
		return tesorosDeLaBibliaExcel;
	}

	public final SeamosMejoresMaestrosExcel getSeamosMejoresMaestrosExcel() {
		return seamosMejoresMaestrosExcel;
	}


	public final NuestraVidaCristianaExcel getNuestraVidaCristianaExcel() {
		return nuestraVidaCristianaExcel;
	}

	public final void setIntroReunionEntreSemanaExcel(IntroReunionEntreSemanaExcel introReunionEntreSemanaExcel) {
		this.introReunionEntreSemanaExcel = introReunionEntreSemanaExcel;
	}


	public final void setTesorosDeLaBibliaExcel(TesorosDeLaBibliaExcel tesorosDeLaBibliaExcel) {
		this.tesorosDeLaBibliaExcel = tesorosDeLaBibliaExcel;
	}

	public final void setSeamosMejoresMaestrosExcel(SeamosMejoresMaestrosExcel seamosMejoresMaestrosExcel) {
		this.seamosMejoresMaestrosExcel = seamosMejoresMaestrosExcel;
	}

	public final void setNuestraVidaCristianaExcel(NuestraVidaCristianaExcel nuestraVidaCristianaExcel) {
		this.nuestraVidaCristianaExcel = nuestraVidaCristianaExcel;
	}
	
	@Override
	public boolean pintar() {
		return false;
	}
}
