package framework.funcs;

import base.framework.common.BaseTest;
import framework.pages.LoginPage;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public void realizarLogin(String email, String senha){
        driver.findElement(loginPage.getCampoEmail()).sendKeys(email);
        driver.findElement(loginPage.getCampoSenha()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoEntrar()).click();
    }
    public void acessarCadastroUsuario(){
        driver.findElement(loginPage.getBotaoCriarConta()).click();
    }

    public String getCriarConta(){
        return driver.findElement(loginPage.getBotaoCriarConta()).getText();
    }

}
