public class Moto extends Veiculo {
    public void rodar(double quantidadeQuilometro){
        super.setQuilometrosRodados(quantidadeQuilometro);
        double combustivelGasto = super.getQuilometroPorLitro() * quantidadeQuilometro;
        super.consumir(combustivelGasto);
    }

    @Override
    public String toString() {
        return "";
    }
    
    public Moto(int numeroPlaca){
        super(numeroPlaca);
    }
}
