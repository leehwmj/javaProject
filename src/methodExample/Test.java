package methodExample;

public class Test {
    public int sum(int a, int b){
        return a+b;
    }

    public String say() {
        return "hi";
    }

    public void sum2 (int a, int b) {
        System.out.println(a + "과 " + b + "의 합은 " + (a+b) +"입니다.");

    }

    public void vartest(int v) {
        v++;
    }

    public static void main(String[] args) {
        //int a = 3;
        //int b = 4;

        //Test myTest = new Test();
        //int c = myTest.sum(a, b);

        //Test myTestHi = new Test();
        //String d = myTestHi.say();

        //Test sum2 = new Test();
        //sum2.sum2(5,6);

        int v = 7;
        Test myTest2 = new Test();
        myTest2.vartest(v);
        System.out.println(v);

        //System.out.println(d);
        //System.out.println(c);
    }
}
