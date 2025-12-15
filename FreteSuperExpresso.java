public class FreteSuperExpresso extends Frete {

    private double valorDoSeguro;
    private int nivelUrgencia;

    public FreteSuperExpresso(double distancia, double valorPorKm, double valorDoSeguro, int nivelUrgencia) {
        super(distancia, valorPorKm);
        this.valorDoSeguro = valorDoSeguro;
        this.nivelUrgencia = nivelUrgencia;
    }

    public double calcularFrete() {
        return (distancia * valorPorKm) + (nivelUrgencia * 100) + valorDoSeguro;
    }
}