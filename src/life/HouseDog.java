package life;

public class HouseDog extends Dog {
    public HouseDog(String name){
        this.setName(name);
    }

    public HouseDog(int type){
        if (type == 1) {
            this.setName("yorkshire");
        }else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep(){
        System.out.println(this.name+" zzz in house when you are going out");
    }

    public void sleep(int hour){
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        HouseDog dog2 = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(dog2.name);
    }
}
