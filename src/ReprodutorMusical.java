import java.util.Objects;

public class ReprodutorMusical {

    private String musica;
    void tocar (){
        if (Objects.isNull(musica) || musica.isEmpty()){
            System.out.println("SELECIONE UMA MUSICA PARA TOCAR");
        }else{
            System.out.println("TOCANDO MUSICA DE " + musica);
        }
    }

    void pausar(){
        if (Objects.isNull(musica) || musica.isEmpty()){
            System.out.println("SELECIONE UMA MUSICA PARA PAUSAR");
        }else{
            System.out.println("PAUSANDO MUSICA DE " + musica);
        }
    }

    void selecionarMusica (String musica){
        this.musica = musica;
        System.out.println("SELECIONANDO MUSICA " + musica);
    }
}
