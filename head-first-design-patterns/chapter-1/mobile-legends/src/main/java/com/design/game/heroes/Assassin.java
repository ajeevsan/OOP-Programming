public class Assassin extends Hero {

    @Override 
    public void fight() {
        System.out.println("Assasin deals burst damage.");
    }

    @Override 
    public void display() {
        System.out.println("I am an Assassin.");
    }
}