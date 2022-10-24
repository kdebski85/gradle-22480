package reproducer

public class A {
    public void test() {
        var x = 1
        x = 2
        test()
    }
}
