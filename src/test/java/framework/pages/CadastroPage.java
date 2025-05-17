package framework.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static base.framework.common.BaseTest.driver;

public class CadastroPage {

    private final By campoNomeCompleto = By.id("etInputtextes");

    private final By campoComoQuerSerChamado = By.id("etInputtextes1");

    private final By campoTelefone = By.id("etInputtextes2");

    private final By campoDataNascimento = By.id("etInputtextes3");

    private final By botaoProsseguir = By.id("txtButton");

    private final By campoCEP = By.id("etInputtextes");

    private final By botaoCEP = By.id("btnCep");

    private final By campoRua = By.id("etInputtextes1");

    private final By campoBairro = By.id("etInputtextes2");

    private final By campoCidade = By.id("etInputtextes3");

    private final By selectEstado = By.id("txtTitle");

    private String aguarde = "progressBar5";

    public String getAguarde() {
        return aguarde;
    }

    private final By opcaoSP = By.xpath("//android.widget.TextView[@text='SP']");

    private final By campoEmail = By.id("etInputtextes");

    private final By campoSenha = By.id("etInputtextes1");

    private final By campoConfirmeSenha = By.id("etInputtextes2");

    private final By botaoCriarConta = By.id("btnCriarConta");

    public By getCampoNomeCompleto() {
        return campoNomeCompleto;
    }

    public By getCampoComoQuerSerChamado() {
        return campoComoQuerSerChamado;
    }

    public By getCampoTelefone() {
        return campoTelefone;
    }

    public By getCampoDataNascimento() {
        return campoDataNascimento;
    }

    public By getBotaoProsseguir() {
        return botaoProsseguir;
    }

    public By getCampoCEP() {
        return campoCEP;
    }

    public By getBotaoCEP() {
        return botaoCEP;
    }

    public By getCampoRua() {
        return campoRua;
    }

    public By getCampoBairro() {
        return campoBairro;
    }

    public By getCampoCidade() {
        return campoCidade;
    }

    public By getSelectEstado() {
        return selectEstado;
    }

    public By getOpcaoSP() {
        return opcaoSP;
    }

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getCampoConfirmeSenha() {
        return campoConfirmeSenha;
    }

    public By getBotaoCriarConta() {
        return botaoCriarConta;
    }
}
