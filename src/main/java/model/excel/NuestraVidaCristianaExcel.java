package model.excel;

import model.NuestraVidaCristiana;

public class NuestraVidaCristianaExcel implements IPintarExcel {
	
	public NuestraVidaCristianaExcel(NuestraVidaCristiana nuestraVidaCristiana) {
		super();
		this.nuestraVidaCristiana = nuestraVidaCristiana;
	}

	private NuestraVidaCristiana nuestraVidaCristiana;

	public final NuestraVidaCristiana getSemanaReunion() {
		return nuestraVidaCristiana;
	}

	public final void setNuestraVidaCristiana(NuestraVidaCristiana nuestraVidaCristiana) {
		this.nuestraVidaCristiana = nuestraVidaCristiana;
	}

	@Override
	public boolean pintar() {
		return true;
	}
}
