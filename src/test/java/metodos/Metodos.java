package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

public class Metodos extends Browsers {

	public void escrever(By elemento, String texto) {

		adriver().findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		adriver().findElement(elemento).click();

	}

	public void screnshot(String nomeSrc) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) adriver());
		File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeSrc + ".png");
		FileUtils.copyFile(scrFile, destFile);

	}

	public void esperar() throws InterruptedException {

		Thread.sleep(10000);

	}

	public void seleciona(By elemento, String pais) {
		Select seleciona = new Select(adriver().findElement(By.name("countryListboxRegisterPage")));
		seleciona.selectByVisibleText("Brazil");

	}

	public String pegarMensagem(By elementos) {

		String mensagem = adriver().findElement(elementos).getText();

		return mensagem;
	}

		
	
}
