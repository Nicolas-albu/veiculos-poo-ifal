public abstract class Veiculo {
    private int numeroPlaca;
    private double litroTanqueCombustivel;
    private double quilometrosRodados;
    private double quilometroPorLitro;

    public abstract void rodar(double quantidadeQuilometro);

    public void abastecer(double quantidadeLitroCombustivel){
        if(quantidadeLitroCombustivel < 0)
            throw new IllegalArgumentException();
        this.litroTanqueCombustivel += quantidadeLitroCombustivel;
    }

    public void consumir(double quantidadeLitroCombustivel){
        if(quantidadeLitroCombustivel > this.litroTanqueCombustivel)
            throw new IllegalArgumentException();
        this.litroTanqueCombustivel -= quantidadeLitroCombustivel;
    }

    public int getNumeroPlaca() { return this.numeroPlaca; }
    
    public double getLitroTanqueCombustivel() { return this.litroTanqueCombustivel; }

    public double getQuilometrosRodados() { return this.quilometrosRodados; }

    public double getQuilometroPorLitro() { return this.quilometroPorLitro; }

    public void setQuilometrosRodados(double novoQuilometrosRodados){
        if(novoQuilometrosRodados <= 0)
            throw new IllegalArgumentException();
        this.quilometrosRodados += novoQuilometrosRodados;
    }

    public void setNumeroPlaca(int novoNumeroPlaca){
        if(novoNumeroPlaca <= 0 || numeroPlaca == novoNumeroPlaca)
            throw new IllegalArgumentException();
        this.numeroPlaca = novoNumeroPlaca;
    }

    public String toString(){
        return "Número da Placa: " + getNumeroPlaca()
                + "\nLitro do tanque de combustível: " + getLitroTanqueCombustivel()
                + "\nQuilômetros rodados: " + getQuilometrosRodados()
                + "\nQuilômetros por Litro: " + getQuilometroPorLitro();
    }

    public Veiculo(int numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);       
    }
}