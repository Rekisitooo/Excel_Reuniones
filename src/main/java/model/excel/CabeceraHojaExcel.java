package model.excel;

public class CabeceraHojaExcel {
	
	private String tituloReunion;
	private String mes;
	private String anno;
	private String congregacion;
	
	public CabeceraHojaExcel(String tituloReunion, String mes, String anno, String congregacion) {
		super();
		this.tituloReunion = tituloReunion;
		this.mes = mes;
		this.anno = anno;
		this.congregacion = congregacion;
	}
	
	public final String getTituloReunion() {
		return tituloReunion;
	}
	public final String getMes() {
		return mes;
	}
	public final String getAnno() {
		return anno;
	}
	public final String getCongregacion() {
		return congregacion;
	}
	public final void setTituloReunion(String tituloReunion) {
		this.tituloReunion = tituloReunion;
	}
	public final void setMes(String mes) {
		this.mes = mes;
	}
	public final void setAnno(String anno) {
		this.anno = anno;
	}
	public final void setCongregacion(String congregacion) {
		this.congregacion = congregacion;
	}
}
