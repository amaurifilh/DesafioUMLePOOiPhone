package smartphone.apple;

import smartphone.apple.iphone.Iphone;
import smartphone.apple.iphone.app.AparelhoTelefonico;
import smartphone.apple.iphone.app.NavegadorInternet;
import smartphone.apple.iphone.app.ReprodutorMusical;

public class SmartphoneApple {
    public static void main(String[] args) {
        Iphone smartApple = new Iphone();
        AparelhoTelefonico tel = smartApple;
        NavegadorInternet nav = smartApple;
        ReprodutorMusical musc = smartApple;

        tel.atender();
        tel.ligar();
        tel.iniciarCorreioVoz();

        nav.exibirPagina();
        nav.adicionarNovaAba();
        nav.atualizarPagina();
        
        musc.tocar();
        musc.pausar();
        musc.selecionarMusicar();
    }
}
