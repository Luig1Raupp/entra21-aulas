package POO.Abstracao.exemplo1.classeAbstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(5, 4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("Á area do circulo é " + areaCirculo);
        System.out.println("Á area do retangulo é "+ areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2,2);
        System.out.println("Á area do quadrado é "+ quadrado.calcularArea());

    }
}
