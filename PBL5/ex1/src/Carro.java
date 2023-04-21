public class Carro extends Veiculo{
    public int velocidade;

    Carro(int velocidade){
        this.velocidade = velocidade;
    }
    @Override
    public int acelerar(int aceleramento){
        velocidade += velocidade;
        System.out.println("O seu carro acelerou: " + velocidade);
        return velocidade;
    }

}
