package br.com.maratonajava.java.core.modificadorestatico06.test;

import br.com.maratonajava.java.core.modificadorestatico06.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println( "exibindo a quantidade de parcelas possiveis" );
//        for (int parcelas : c.getParcelas()){
//            System.out.print( parcelas + " ");
//        }

        System.out.println("tamanho "+ Cliente.getParcelas().length);
        System.out.println("tamanho "+ Cliente.getParcelas().length);
        System.out.println("tamanho "+ Cliente.getParcelas().length);
    }

}


