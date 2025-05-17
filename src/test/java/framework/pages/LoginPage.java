package framework.pages;

import org.openqa.selenium.By;


public class LoginPage {

    private final By campoEmail = By.id("edtEmail");

    private final By campoSenha = By.id("edtSenha");

    private final By botaoEntrar = By.id("btnLogin");

    private final By botaoCriarConta = By.id("txtCriarConta");

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getBotaoEntrar() {
        return botaoEntrar;
    }

    public By getBotaoCriarConta() {
        return botaoCriarConta;
    }
}
