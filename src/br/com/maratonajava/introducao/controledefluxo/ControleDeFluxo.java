package br.com.maratonajava.introducao.controledefluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade <= 18 juvenil
        // idade >=18 adulto
        int idade = 18;
        String categoria;

        if(idade < 15 ){
            categoria = "infantil";
        }else if(idade >=15 && idade <18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
