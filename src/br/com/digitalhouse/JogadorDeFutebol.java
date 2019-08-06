package br.com.digitalhouse;

public class JogadorDeFutebol {

    //Attributes
    private String name;
    private Integer energy;
    private Integer happy;
    private Integer goals;
    private Integer experience;

    //Constructors
    public JogadorDeFutebol() {
    }

    public JogadorDeFutebol(String newName, Integer pointHappy, Integer pointEnergy, Integer makeGoals, Integer pointExperience) {
        name = newName;
        energy = pointEnergy;
        happy = pointHappy;
        goals = makeGoals;
        experience = pointExperience;

    }

    //Methods Specials  -  Get and set

    //getters
    public String getName() {
        return name;
    }

    public Integer getEnergy() {
        return energy;
    }

    public Integer getHappy() {
        return happy;
    }

    public Integer getGoals() {
        return goals;
    }

    public Integer getExperience() {
        return experience;
    }

    //setters
    public void setName(String newName) {
        name = newName;
    }

    public void setEnergy(Integer pointEnergy) {
        energy = pointEnergy;
    }

    public void setHappy(Integer pointHappy) {
        happy = pointHappy;
    }

    public void setGoals(Integer makeGoals) {
        goals = makeGoals;
    }

    public void setExperience(Integer pointExperience) {
        experience = pointExperience;
    }


    //Methods
    public void makeGoal(){
        setEnergy(getEnergy()+5);
        setHappy(getHappy()+10);
        setGoals(getGoals()+1);
        System.out.println("GOOOOOOOL minha energia aumentou para "+getEnergy()+" minha alegria esta em "+getHappy()+", Tudo porque eu Fiz 1 Gol e agora estou com "+getGoals()+" gols");
    }

    public void run(){
        setEnergy(getEnergy()-10);
        System.out.println("Corrend...  ... ufa! Cansei! Minha energia caiu para :"+getEnergy());
    }

    @Override
    public String toString() {
        return "JogadorDeFutebol{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", happy=" + happy +
                ", goals=" + goals +
                ", experience=" + experience +
                '}';
    }


}
