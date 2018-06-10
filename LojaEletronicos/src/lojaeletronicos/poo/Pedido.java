package lojaeletronicos.poo;

public class Pedido {
    public Cliente cliente;
    public Vendedor vendedor;
    public String numero;
    private double total;
    public ItemProduto item;
    
    public Pedido(){
      cliente = new Cliente();
    }
    public Pedido(Cliente cliente, Vendedor vendedor, String numero, ItemProduto item, double total){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numero = numero;
        this.item = item;
        this.total = total;
   }

    public double getTotal() {
        double t;
        t = item.total();
        return t;
    }

    public void setTotal(double total) {
        this.total = total;
    }   
}
