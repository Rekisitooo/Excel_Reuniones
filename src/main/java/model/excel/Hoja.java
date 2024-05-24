package model.excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Hoja implements IPintarExcel {
	private XSSFSheet hoja;
	private int reunionesPintadas;
	private CabeceraHojaExcel cabeceraHoja;
	
	public Hoja(XSSFSheet hoja, int reunionesPintadas, CabeceraHojaExcel cabeceraHoja) {
		super();
		this.hoja = hoja;
		this.reunionesPintadas = reunionesPintadas;
		this.cabeceraHoja = cabeceraHoja;
	}

	public final XSSFSheet getHoja() {
		return hoja;
	}

	public final int getReunionesPintadas() {
		return reunionesPintadas;
	}

	public final CabeceraHojaExcel getCabeceraHoja() {
		return cabeceraHoja;
	}

	public final void setHoja(XSSFSheet hoja) {
		this.hoja = hoja;
	}

	public final void setReunionesPintadas(int reunionesPintadas) {
		this.reunionesPintadas = reunionesPintadas;
	}

	public final void setCabeceraHoja(CabeceraHojaExcel cabeceraHoja) {
		this.cabeceraHoja = cabeceraHoja;
	}
	
	@Override
	public boolean pintar() {
		return true;
	}
}
