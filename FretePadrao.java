public class FretePadrao extends Frete {

    public FretePadrao(double distancia, double valorPorKm) {
        super(distancia, valorPorKm);
    }

    public double calcularFrete() {
        return distancia * valorPorKm;
    }

}