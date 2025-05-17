package framework.steps;

import framework.funcs.IntroducaoFunc;
import io.cucumber.java.pt.Dado;

public class IntroducaoStep {
    IntroducaoFunc introducaoFunc = new IntroducaoFunc();

    @Dado("acessar a tela de login")
    public void acessarATelaDeLogin() {
        introducaoFunc.pularIntroducao();
    }
}
