//Andrew Yeow
//CS1400
//Assignment 5
//11 November 2021
public class Superhero extends Person{
    private String superheroName, superpower, catchphrase;
    private static int numberOfVilliansCaught;

    public Superhero(String n, int a, String f, String sn, String sp, String c, int nv){
        super.setName(n);
        super.setAge(a);
        super.setFavFood(f);
        superheroName = sn;
        superpower = sp;
        catchphrase = c;
        numberOfVilliansCaught = nv;
    }
    
    public String getSuperheroName(){
        return superheroName;
    }
    public String getSuperpower(){
        return superpower;
    }
    public String getCatchphrase(){
        return catchphrase;
    }
    public static int getNumberOfVillainsCaught(){
        return numberOfVilliansCaught;
    }

    public void setSuperheroNam(String n){
        superheroName = n;
    }
    public void setSuperpower(String s){
        superpower = s;
    }
    public void setCatchphrase(String c){
        catchphrase = c;
    }
    public static void setNumberOfVilliansCaught(int n){
        numberOfVilliansCaught = n;
    }

    public void catchVillian(){
        numberOfVilliansCaught++;
    }

    public void villainsCaught(){
        System.out.println(getNumberOfVillainsCaught());
    }

    public void speak(){
        System.out.println(getCatchphrase());
        System.out.println("VOILA");
    }

    public String toString(){
        String output = "";
        output += super.toString() + 
        "\nSuperhero Name: " + getSuperheroName() + 
        "\nSuperpower: " + getSuperpower() + 
        "\nCatchphrase: " + getCatchphrase() + 
        "\nNumber of Villians Caught: " + getNumberOfVillainsCaught();
        return output;
    }
}
