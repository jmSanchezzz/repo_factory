public class Dog implements Pet{
    private String breed;

    @Override
    public String play(){
        return "Play Catch and Fetch";
    }
    @Override
    public String makeSound(){
        return "Aw, aw!";
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}