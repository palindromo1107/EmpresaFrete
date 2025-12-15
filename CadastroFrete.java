import java.util.ArrayList;
import java.util.List;

public class CadastroFrete {

    private List<Frete> fretes = new ArrayList<>();

    public void adicionarFrete(Frete frete){
        fretes.add(frete);
    }

    public double valorTotal() {
        double total = 0;

        //POLIMORFISMO
        for (Frete frete : fretes) {
            total += frete.calcularFrete();
        }

        return total;
    }


}
