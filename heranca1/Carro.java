package heranca1;

public class Carro {
    private static final Integer VELOCIDADE_MAXIMA = 200;
    public int velocidadeAtual;

    public void acelerar() {
        if(this.velocidadeAtual >= VELOCIDADE_MAXIMA){
          System.out.println("Limite de velocidade atingido");
        }else{
         velocidadeAtual += 5;
        }
    }

    public void frear() {
        if (velocidadeAtual <= 0) {
            System.out.println("Carro parado");
        }
        else {
            velocidadeAtual -= 5;
        }
    }

}
