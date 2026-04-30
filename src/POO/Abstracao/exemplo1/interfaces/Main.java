package POO.Abstracao.exemplo1.interfaces;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(2, 5);

        System.out.println("A área do circulo é " + circulo.calcularArea());
        System.out.println("A área do retangulo é " +  retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometrica = new Circulo(2);
        interfaceFormaGeometrica.calcularArea();
        System.out.println("A área do circulo é "+ interfaceFormaGeometrica.calcularArea());
    }
}
