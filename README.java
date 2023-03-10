// Interfaces
public interface Vendavel {
    public double getPreco();
    public String getDescricao();
}

public interface Eletrico {
    public int getVoltagem();
    public int getPotencia();
}

public interface Ferramenta {
    public String getTipo();
    public String getMaterial();
}

// Classes Abstratas
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

public abstract class Iluminacao extends Eletrodomestico {

   private boolean led;

   public Iluminacao(String codigo, double preco, int voltagem,
                     int potencia, boolean led) {

       super(codigo, preco, voltagem,potencia);
       this.led = led;

   }

   public boolean isLed() {

       return led;

   }

}

public abstract class Parafuso extends Produto implements Ferramenta {

  private double comprimento;

  private double diametro;

  private String tipoRosca;

  private String tipoCabeca;


  // Construtor

  Parafuso(String codigo,double preco,double comprimento,

           double diametro,String tipoRosca,String tipoCabeca){

      super(codigo ,preco);

      this.comprimento=comprimento;

      this.diametro=diametro;

      this.tipoRosca=tipoRosca;

      this.tipoCabeca=tipoCabeca;


  }


  // Getters

  @Override

  public String getTipo(){

      return "Parafuso";

  }


  @Override

  public String getMaterial(){

      return "Metal";

  }


  @Override

  // Descrição do produto

  // Exemplo: Parafuso de metal com rosca soberba e cabeça chata.

  // Comprimento: x cm; Diâmetro: y cm; Preço: R$ z.