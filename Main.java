public class Main {
    public static void main(String[] args) {

        CadastroFrete cadastro = new CadastroFrete();

        cadastro.adicionarFrete(new FretePadrao(100, 2.5));
        cadastro.adicionarFrete(new FreteExpresso(80, 3.0, 2));
        cadastro.adicionarFrete(new FreteSuperExpresso(50, 4.0, 3, 500));

        System.out.println("Valor total dos fretes: R$ " + cadastro.valorTotal());
    }
}