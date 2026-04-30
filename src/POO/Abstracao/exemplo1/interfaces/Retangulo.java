package POO.Abstracao.exemplo1.interfaces;

public class Retangulo implements IFormaGeometrica{

    private double altura;
    private double largura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
