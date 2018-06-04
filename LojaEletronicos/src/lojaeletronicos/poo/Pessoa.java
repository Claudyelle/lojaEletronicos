package lojaeletronicos.poo;

public abstract class Pessoa {
    public String nome;
    public String nasc;
    private String tel;

    
    public abstract String informacoes();
    
    
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
