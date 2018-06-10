package lojaeletronicos.poo;

public class Vendedor extends Pessoa implements Trabalhista{
    private double comissao;
    private double salario;
    public String setor;
    public double inss;
    
    public Vendedor(){
        this.comissao = 0;
        this.salario = 0;
        this.inss = 0;
    }
    public Vendedor(String nome, String tel, String nasc, String setor, double comissao, double salario){
        this.setor = setor;
        this.nasc = nasc;
        this.nome = nome;
        setTel(tel);
        setComissao(comissao);
        this.salario = salario;
    }
    @Override
    public double calculaInss(){
        if(this.salario <= 1693.72){
            this.inss = this.salario * 0.08;
        }
       if(this.salario >= 1693.73 && this.salario <= 2822.91){
            this.inss = this.salario * 0.09;
       }
       if(this.salario > 2822.91){
           this.inss = this.salario * 0.11;
       }
       return this.inss;
    }
    @Override
    public double salarioFinal(){
        double sal = 0;
       double inssCalc = this.calculaInss();
       
        sal = (this.salario - inssCalc) + this.getComissao();
        return sal;

    }

    public double getComissao(){
        return this.comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public String informacoes(){
        return " " + this.nome + " | Setor - " + this.setor;
    }
    
    public String getSalario(){
        return Double.toString(this.salario);
    }
    
}
