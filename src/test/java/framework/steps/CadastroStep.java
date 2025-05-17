package framework.steps;

import framework.funcs.CadastroFunc;
import framework.funcs.LoginFunc;
import io.cucumber.java.pt.Quando;

public class CadastroStep {

    LoginFunc loginFunc = new LoginFunc();
    CadastroFunc cadastroFunc = new CadastroFunc();

    @Quando("realizar o cadastro de um novo usuário")
    public void realizarCadastroUsuario(){
        loginFunc.acessarCadastroUsuario();
        cadastroFunc.preencherDadosUsuario();
        cadastroFunc.preencherEnderecoUsuario();
        cadastroFunc.preencherLoginUsuario();
    }
}
