public abstract class Produto implements Vendavel {
    private String codigo;
    private double preco;
    
    public Produto(String codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public double getPreco() {
        return preco;
    }
    
}