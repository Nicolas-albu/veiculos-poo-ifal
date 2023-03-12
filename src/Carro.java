public class Carro extends Veiculo {
    public void rodar(double quantidadeQuilometro){
        super.setQuilometrosRodados(quantidadeQuilometro);
        double combustivelGasto = super.getQuilometroPorLitro() * quantidadeQuilometro;
        super.consumir(combustivelGasto);
    }

    @Override
    public String toString() {
        return "";
    }
    
    public Carro(int numeroPlaca){
        super(numeroPlaca);
    }
}
