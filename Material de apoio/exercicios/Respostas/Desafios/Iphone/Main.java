package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //teste aparelho telefônico
        iphone.ligar(890);
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("################################################");

        //teste navegador internet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("################################################");

        //teste reprodutor musical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("Pretty when you cry");
    }
}
