public class Interfaces {
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
}
