package br.com.digitalhouse;

public class Exercicio2{
    public static void main(String[] args) {

        JogadorDeFutebol player1=new JogadorDeFutebol("Neymar",100,100,3,5);
        JogadorDeFutebol player2=new JogadorDeFutebol("Messi",100,100,8,7);

        SessaoDeTreinamento benning=new SessaoDeTreinamento(player1,"pacambu");
        SessaoDeTreinamento medium=new SessaoDeTreinamento(player2,"Itaquerão");

        benning.training(player1);
        medium.training(player2);

        System.out.println(player1);


    }
}
