package smartphone.apple.iphone;

import smartphone.apple.iphone.app.AparelhoTelefonico;
import smartphone.apple.iphone.app.NavegadorInternet;
import smartphone.apple.iphone.app.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
       System.out.println("Tocando música");
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
    @Override
  
    public void selecionarMusicar() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}