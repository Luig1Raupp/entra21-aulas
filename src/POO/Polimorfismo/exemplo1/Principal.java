package POO.Polimorfismo.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();
        Animal milk = new Gato();
        Animal generico = new Animal();

        rex.emitirSom();
        milk.emitirSom();
        generico.emitirSom();


    }
}
