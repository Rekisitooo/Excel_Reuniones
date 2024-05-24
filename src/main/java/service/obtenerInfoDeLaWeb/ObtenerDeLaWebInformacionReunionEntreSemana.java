package service.obtenerInfoDeLaWeb;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import model.ReunionEntreSemana;

public class ObtenerDeLaWebInformacionReunionEntreSemana {
	
	public static final Path URL_JW = Paths.get("https://jw.org/");

	private int id;
	
	public List<ReunionEntreSemana> obtenerInfoReuniones(){
		new ObtenerDeLaWeb(new ChromeDriver()).abrirPaginaWeb(URL_JW);
		return new ArrayList<ReunionEntreSemana>();
	}
	
	private void abrirSeccionBibliotecaJW() {

	}
	
	private void abrirSeccionGuiaDeActividadesJW() {

	}
	
	private void abrirGuiaActividadesMesSeleccionadoPorUsuario(String mes) {

	}
}
