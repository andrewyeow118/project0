//Andrew Yeow
//CS1400
//Assignment 5
//11 November 2021
public class Person{
    
    private String name;
    private int age;
    private String favFood;

    public Person(){
        name = "";
        age = 0;
        favFood = "";
    }
    public Person(String n, int a, String f){
        name = n;
        age = a;
        favFood = f;
    }

    public Person(Person person){
        name = person.getName();
        age = person.getAge();
        favFood = person.getFavFood();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getFavFood(){
        return favFood;
    }

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setFavFood(String f){
        favFood = f;
    }

    public boolean equals(Person p2){
        if(getName() == p2.getName() && getAge() == p2.getAge() && getFavFood() == p2.getFavFood()){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        String output = "";
        output += "Name: " + getName() + "\nAge: " + getAge() + "\nFavorite Food: " + getFavFood();
        return output;
    }
}