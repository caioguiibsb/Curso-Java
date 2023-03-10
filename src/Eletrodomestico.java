public abstract class Eletrodomestico extends Produto implements Eletrico {
    private int voltagem;
    private int potencia;
 
    public Eletrodomestico(String codigo, double preco, int voltagem, int potencia) {
        super(codigo, preco);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }
 
    public int getVoltagem() {
        return voltagem;
    }
 
    public int getPotencia() {
        return potencia;
    }
 } 
    

