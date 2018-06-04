package lojaeletronicos.poo;

public class Cliente extends Pessoa{   
    public String referencia;
    public String status;
    public int quantDependentes;
    private double limiteCredito;
    public boolean inadimplente;
    
    public Cliente(){
        inadimplente = false;
    }    
    public Cliente(String nome, String tel, String nasc, String referencia,
                   String status, double limiteCredito, int quantDependentes){
        setTel(tel);
        this.nome = nome;    
        this.nasc = nasc;
        this.referencia = referencia;
        this.status = status;
        this.quantDependentes = quantDependentes;
        setLimiteCredito(limiteCredito);
    }
    
    @Override
    public String informacoes(){
        return " " + nome + " | Telefone: " + getTel();
    }
    public String getQuantDependentes(){
        String quant = Integer.toString(quantDependentes);
        return quant;
    }
    public String getLimiteCredito() {
        String limite = Double.toString(limiteCredito);
        return limite;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }    
}
