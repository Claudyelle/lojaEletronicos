package lojaeletronicos.poo;

public class ItemProduto {
    public Produto codigo;
    public double valor;
    public int quant;
    
    public ItemProduto(Produto codigo, double valor, int quant){
        this.codigo = codigo;
        this.valor = valor;
        this.quant = quant;
    }
    public String getQuant(){
        return  Integer.toString(this.quant);
    }
    
    public double total(){
        return this.valor * this.quant;
    }
    
    public double getVal(){
        double v;
        v = this.valor;
        return v;
    }
    
    public String getValor(){
        return Double.toString(valor);
    }
    
}
