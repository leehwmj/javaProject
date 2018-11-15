package methodExample;

public class VarTest {
    int a;

    public void vartest(VarTest test){
        test.a++;
    }

    public static void main(String[] args) {
        VarTest myTest = new VarTest();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}
