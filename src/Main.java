import Generics.com.br.Generics;

public class Main {
    public static void main(String[] args) {

        Generics<String> val = new Generics<>();
        val.setValor("edvanderson");
        System.out.println(val.get());
    }
}