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