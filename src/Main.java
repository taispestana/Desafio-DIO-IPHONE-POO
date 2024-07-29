public class Main {
    public static void main(String[] args) {

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        Iphone iphone = new Iphone(navegadorInternet, reprodutorMusical, aparelhoTelefonico);

        iphone.getNavegadorinternet().exibirPagina(" www.taispestana.com.br");
        iphone.getNavegadorinternet().adicionarNovaAba();
        iphone.getNavegadorinternet().atualizarPagina();

        iphone.getReprodutorMusical().pausar();
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().selecionarMusica(" Baroes da Pisadinha");

        iphone.getAparelhoTelefonico().ligar(912345678);
        iphone.getAparelhoTelefonico().atender();
        iphone.getAparelhoTelefonico().iniciarCorreioVoz();
    }
}