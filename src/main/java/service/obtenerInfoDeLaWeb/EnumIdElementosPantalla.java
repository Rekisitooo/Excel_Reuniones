package service.obtenerInfoDeLaWeb;

public enum EnumIdElementosPantalla {
	ID_ELEMENTO_PANTALLA_TITULO_DISCURSO_TESOROS("p5"),
	ID_ELEMENTO_PANTALLA_BUSQUEMOS_PERLAS_ESCONDIDAS("p11"),
	ID_ELEMENTO_PANTALLA_LECTURA_DE_LA_BIBLIA("p17"),
	ID_ELEMENTO_PANTALLA_ASIGNACION_1_MEJORES_MAESTROS("p20"); 
	
	private String id;
	
	EnumIdElementosPantalla(String id) {
		this.id = id;
	}
}
