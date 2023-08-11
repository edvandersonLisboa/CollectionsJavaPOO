package Generics.com.br;

public class Generics <T>{

    private T valor;
    public void setValor(T valor){ this.valor = valor; }

    public T get(){return this.valor; }
}
