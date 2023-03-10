public abstract class Acessorio extends Produto {
    private String marca;
    
    public Acessorio(String codigo, double preco, String marca) {
        super(codigo, preco);
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
}