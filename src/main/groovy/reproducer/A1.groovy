package reproducer

public class A1 {
    public void test() {
        var x = 1
        x = 2
        test()
    }
}
