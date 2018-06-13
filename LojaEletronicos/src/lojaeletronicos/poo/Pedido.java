package lojaeletronicos.poo;

public class Pedido {
    public Cliente cliente;
    public Vendedor vendedor;
    public String numero;
    public ItemProduto item;
    

    public Pedido(Cliente cliente, Vendedor vendedor, String numero, ItemProduto item){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numero = numero;
        this.item = item;
   }

    public double getTotal() {
        double t;
        t = item.total();
        return t;
    }   
}
