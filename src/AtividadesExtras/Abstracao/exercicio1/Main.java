package AtividadesExtras.Abstracao.exercicio1;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Maria");
        Animal gato = new Gato("Milk");

        System.out.println(cachorro.getNome() + " : " + cachorro.emitirSom());
        System.out.println(gato.getNome() + " : " + gato.emitirSom());

    }
}
