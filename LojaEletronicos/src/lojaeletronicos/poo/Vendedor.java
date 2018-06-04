package lojaeletronicos.poo;

public class Vendedor extends Pessoa implements Trabalhista{
    private double comissao;
    private double salario;
    public String setor;
    public double inss;
    
    public Vendedor(){
        comissao = 0;
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
    public void calculaInss(){
        if(salario <= 1693.72)
            inss = salario * 0.08;
       if(salario >= 1693.73 && salario <= 2822.91)
            inss = salario * 0.09;
       if(salario > 2822.91)
           inss = salario * 0.11;       
    }
    @Override
    public double salarioFinal(){
        if(salario <= 1693.72)
            inss = salario * 0.08;
       if(salario >= 1693.73 && salario <= 2822.91)
            inss = salario * 0.09;
       if(salario > 2822.91)
           inss = salario * 0.11;
       
        salario = salario - inss + comissao;
        return salario;
    }

    public String getComissao(){
        return Double.toString(comissao);
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public String informacoes(){
        return " " + nome + " | Setor - " + setor;
    }
    
}
