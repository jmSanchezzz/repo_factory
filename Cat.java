public class Cat implements Pet {
    private int noOfLives;
    
    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
    @Override
    public String play(){
        return "Pouncing";
    }
    @Override
    public String makeSound(){
        return "Meow, meow!";
    }
    public Integer getNoOfLives(){
        return noOfLives;
    }
    public void setBreed(int noOfLives){
        this.noOfLives = noOfLives;
    }
}