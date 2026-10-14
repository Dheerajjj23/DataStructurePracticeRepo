package CollectionsInJava.ArrayLists;

public class Bird {
    boolean wings;
    private String colourOfWings;
    String colourOfBird;

    public Bird( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void eat(String name){
        System.out.println("The bird "+name+" is eating");
    }
    public static void getBirdDetails(Bird bird){
        if(bird instanceof  Parrot){
            ((Parrot) bird).speak();
        }
        if(bird instanceof Sparrow){
            ((Sparrow) bird).speak();
        }
    }

    public static void main(String[] args) {
        Bird b1 = new Parrot("Blue", "Shivam");
        Bird b2 = new Sparrow("red","rajneesh");
        getBirdDetails(b1);
        getBirdDetails(b2);

    }

}

class Parrot extends Bird{
    String beakColour;

    public Parrot(String beakColour, String name){
        super(name);
        this.beakColour = beakColour;
    }

    public void speak(){
//        super.getName();
        System.out.println("The parrot is speaking"+beakColour+ " "+ super.getName());
    }
}

class Sparrow extends Bird{
    String beakColour;

    public Sparrow(String beakColour, String name) {
        super(name);
        this.beakColour=beakColour;
    }

    public void speak(){
        System.out.println("Sparrow is speaking"+beakColour+" "+super.getName());
    }
}
