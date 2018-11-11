package life;

public class Animal {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Animal cat = new Animal();
        cat.setName("boby");

        Animal cat2 = new Animal();
        cat2.setName("moodng");

        System.out.println(cat.name);
        System.out.println(cat2.name);

    }
}
