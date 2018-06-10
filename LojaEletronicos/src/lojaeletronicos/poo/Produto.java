package lojaeletronicos.poo;

public class Produto {
    public String nome;
    public double valor;
    public String ref;
    public String desc;
    
    public Produto(){
        valor = 0;
    }
    
    public Produto(String nome, String desc, String ref, double valor){
        this.nome = nome;
        this.desc = desc;
        this.ref = ref;        
        this.valor = valor;
    }
    public String getValor(){
        return Double.toString(valor);
    }
    
    public double getValorD(){
        return this.valor;
    }
}
