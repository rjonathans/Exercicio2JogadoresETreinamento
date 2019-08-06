package br.com.digitalhouse;

public class SessaoDeTreinamento extends JogadorDeFutebol{

    //atributes
    private JogadorDeFutebol experience;
    private String localDoTreino;

    //constructor
   /* public SessaoDeTreinamento(JogadorDeFutebol pontoExperience,String novoLocalDoTreino){
        setExperience(pontoExperience);
        setLocalDoTreino(novoLocalDoTreino);

    }*/
    public  SessaoDeTreinamento(JogadorDeFutebol pontoExperience,String novoLocalDoTreino){
        setExperience(pontoExperience);
        localDoTreino=novoLocalDoTreino;
    }

    //gett
    public JogadorDeFutebol getExpirence(){
        return experience;
    }

    public String getLocalDoTreino(){
        return localDoTreino;
    }

    //sett
    public void setExperience(JogadorDeFutebol pointExperience){
        experience=pointExperience;
    }

    public void setLocalDoTreino(String novoLocalDoTreino){
        localDoTreino=novoLocalDoTreino;
    }



    public void training(JogadorDeFutebol player1){
        player1.run();
        player1.makeGoal();
        player1.run();
        System.out.println("Olá "+player1.getName()+" Seja bem vindo ao Jogo.\n"+"Você começou com "+player1.getExperience()+" Pontos de experiência e acaba de aganhar 1 ponto de experiência.");
        player1.setExperience(+1);
        System.out.println("Parabens! Agora você tem: "+player1.getExperience()+" pontos de experiência!\n");

    }



}
