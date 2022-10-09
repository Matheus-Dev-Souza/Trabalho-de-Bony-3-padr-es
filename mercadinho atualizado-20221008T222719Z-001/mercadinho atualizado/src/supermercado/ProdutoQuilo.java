
package supermercado;


public class ProdutoQuilo extends Produto{
    private double qtdQuilos;
    
    public ProdutoQuilo(String codigo, String nome, double valor, double qtdQuilos) {
        super(codigo, nome, valor);
        this.qtdQuilos = qtdQuilos;
    }

    public double getQtdQuilos() {
        return qtdQuilos;
    }

    public void setQtdQuilos(double qtdQuilos) {
        if (qtdQuilos < 0) {
            this.qtdQuilos = 0;
        }
        else{
            this.qtdQuilos = qtdQuilos;
        }
    }
    
    @Override
    public double calcularValor(double quilos){
        return quilos * this.getValor();
    }
    
}
