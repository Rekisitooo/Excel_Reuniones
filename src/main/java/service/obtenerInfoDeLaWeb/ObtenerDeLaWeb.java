package service.obtenerInfoDeLaWeb;

import java.nio.file.Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObtenerDeLaWeb {
	
	private final WebDriver driver;
	
	public ObtenerDeLaWeb(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement obtenerPorId(String id, Path url) {
		abrirPaginaWeb(url);
		return driver.findElement(By.id(id));
	}
	
	public void abrirPaginaWeb(Path url) {
		driver.get(url.toString());
	}
}
