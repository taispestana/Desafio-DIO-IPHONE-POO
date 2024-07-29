public class Iphone {
    private NavegadorInternet navegadorinternet;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;

    public Iphone(NavegadorInternet navegadorinternet, ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico) {
        this.navegadorinternet = navegadorinternet;
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorinternet() {
        return navegadorinternet;
    }

    public void setNavegadorinternet(NavegadorInternet navegadorinternet) {
        this.navegadorinternet = navegadorinternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }
}
