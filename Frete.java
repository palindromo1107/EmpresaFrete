public abstract class Frete implements Fretavel{

    protected double distancia;
    protected double valorPorKm;

    public Frete(double distancia, double valorPorKm){
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }
    /*
    Implemente a classe concreta FretePadrao que será usada para representar fretes realizados sem nenhuma urgência. O cálculo do FretePadrao é realizado com a seguinte fórmula: distancia * valorPorKm;
    Implemente a classe concreta FreteExpresso que será usada para representar fretes realizados com algum nível de urgência. O cálculo do FreteExpresso é realizado com a seguinte fórmula: (distancia * valorPorKm) + (nívelUrgencia * 100);
    Implemente a classe concreta FreteSuperExpresso que será usada para representar fretes realizados com um valor de seguro. O cálculo do FreteSuperExpresso é realizado com a seguinte fórmula: (distancia * valorPorKm) + (nívelUrgencia * 100) + valorDoSeguro;
    Crie uma classe chamada CadastroFrete que será utilizada para cadastrar vários fretes. Além disso, esta classe deve possuir dois métodos: um método para adicionar frete, e outro para calcular o valor total dos fretes cadastrados.
    Implemente uma classe chamada Principal com os seguintes códigos:
    Crie um objeto da classe CadastroFrete;
    Adicione vários objetos de fretes diferentes (no mínimo um para cada tipo de frete);
    Apresentar o valor total de todos os fretes cadastrados;
    Explique onde está acontecendo o polimorfismo.
 */
}