package framework.steps;

import framework.funcs.LoginFunc;
import io.cucumber.java.pt.Então;
import org.junit.jupiter.api.Assertions;

public class LoginStep {
    LoginFunc loginFunc = new LoginFunc();

    @Então("deve realizar o cadastro com sucesso")
    public void deveRealizarOCadastroComSucesso() {
        Assertions.assertEquals("Quero criar uma conta", loginFunc.getCriarConta());
    }
}
