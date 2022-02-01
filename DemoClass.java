public class DemoClass {
    public static void main(String [] args){
        Person person1 = new Person("Jessica", 21, "white rice");
        Person person2 = new Person("Andrew", 18, "poke");

        Superhero superhero1 = new Superhero("Clark Kent", 25, "beef bourguignon", "Superman", 
        "super strength", "Truth, justice, and the American way.", 1234);
        Superhero superhero2 = new Superhero("Peter Parker", 18, "cherry pie", "Spiderman",
        "spidey-sense", "with great power comes great responsibility", 218);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(superhero1);
        System.out.println(superhero2);

        superhero1.catchVillian();
        superhero1.villainsCaught();

        System.out.println(person1.equals(person2));
        System.out.println(superhero1.equals(superhero2));

        superhero1.speak();
        superhero2.speak();

    }
}
