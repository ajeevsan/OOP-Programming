public class Dog {

    String name;

    public void bark() {
        System.out.println(name+" dog is barking.");
    }

    public void eat() {
        System.out.println(name+" dog is now eating.");
    }

    public void chaseCat() {
        System.out.println(name+" is chasing the cat.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.println("Last dog name is ");
        System.out.println(myDogs[2].name);

        int x =0;
        while(x<myDogs.length) {
            myDogs[x].bark();
            x+=1;
        }
    }
}