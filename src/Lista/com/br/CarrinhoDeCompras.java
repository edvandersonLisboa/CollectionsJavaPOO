package Lista.com.br;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listItem;

    public CarrinhoDeCompras() {
        this.listItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
       listItem.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> list = new ArrayList<>();
        for(Item item: this.listItem){
            if(item.getNome().equalsIgnoreCase(nome)){
                list.add(item);
            }
        }
        listItem.removeAll(list);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item item: this.listItem){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total -> R$: "+ valorTotal);
    }

    public void exibirItens(){
        System.out.println(listItem);
    }

    public void exibiTotalDeItens(){
        System.out.println("Quantidade de produtos adicionado no carrinho: "+listItem.size());
    }

    public static  void main(String[] args){

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Bola de futebol", 20, 2);
        carrinho.adicionarItem("raquete", 20, 5);
        carrinho.removerItem("Bola de futebol");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.exibiTotalDeItens();
    }


}
