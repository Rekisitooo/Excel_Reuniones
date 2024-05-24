package model;

import java.util.List;

public class NuestraVidaCristiana {
	private List<Parte> listaPartes;
	private Cancion cancion;

	public NuestraVidaCristiana(List<Parte> listaPartes, Cancion cancion) {
		super();
		this.listaPartes = listaPartes;
		this.cancion = cancion;
	}

	public final Cancion getCancion() {
		return cancion;
	}

	public final void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	public final List<Parte> getListaPartes() {
		return listaPartes;
	}

	public final void setListaPartes(List<Parte> listaPartes) {
		this.listaPartes = listaPartes;
	}
}
