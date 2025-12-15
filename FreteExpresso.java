public class FreteExpresso extends Frete{

    private int nivelUrgencia;

    public FreteExpresso(double distancia, double valorPorKm, int nivelUrgencia) {
        super(distancia, valorPorKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    public double calcularFrete() {
        return (distancia * valorPorKm) + (nivelUrgencia * 100);
    }
}