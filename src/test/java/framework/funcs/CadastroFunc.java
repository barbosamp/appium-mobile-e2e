package framework.funcs;

import base.framework.common.BaseTest;
import framework.pages.CadastroPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class CadastroFunc extends BaseTest {

    CadastroPage cadastroPage = new CadastroPage();

    Faker faker = new Faker(new Locale("pt-BR"));

    public void preencherDadosUsuario() {
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
        String data = formate.format(faker.date().birthday());
        String nomeCompleto = faker.name().fullName();
        String nome = faker.name().firstName();
        String telefone = faker.phoneNumber().cellPhone();

        driver.findElement(cadastroPage.getCampoNomeCompleto()).sendKeys(nomeCompleto);
        driver.findElement(cadastroPage.getCampoComoQuerSerChamado()).sendKeys(nome);
        driver.findElement(cadastroPage.getCampoTelefone()).sendKeys(telefone);
        driver.findElement(cadastroPage.getCampoDataNascimento()).sendKeys(data);
        driver.findElement(cadastroPage.getBotaoProsseguir()).click();
    }

    public void preencherEnderecoUsuario() {
        driver.findElement(cadastroPage.getCampoCEP()).sendKeys("01001001");
        driver.findElement(cadastroPage.getBotaoCEP()).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(cadastroPage.getAguarde())));
        driver.findElement(cadastroPage.getBotaoProsseguir()).click();
    }

    public void preencherLoginUsuario() {
        String email = faker.internet().emailAddress();
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys(email);
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("Teste@123");
        driver.findElement(cadastroPage.getCampoConfirmeSenha()).sendKeys("Teste@123");
        driver.findElement(cadastroPage.getBotaoCriarConta()).click();
    }
}
