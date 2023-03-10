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