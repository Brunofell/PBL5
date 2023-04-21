public class Moto extends Veiculo {
    public int velocidade;

    Moto(int velocidade){
        this.velocidade = velocidade;
    }

    @Override
    public int acelerar(int aceleramento){
        velocidade += aceleramento;
        System.out.println("Sua moto acelerou: " + velocidade);
        return velocidade;
    }

}
