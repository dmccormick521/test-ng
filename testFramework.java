import org.testng.annotations.Test;
@Test()
public class testFramework {
    //base tests
    @Test(priority = 3)
    void test1(){
        System.out.println("I am test1");
    }
    @Test(priority = 2)
    void test2(){
        System.out.println("I am test2");
    }
    @Test(priority = 1)
    void test3(){
        System.out.println("I am test3");
    }


}
