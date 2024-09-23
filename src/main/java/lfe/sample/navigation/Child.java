package lfe.sample.navigation;

public class Child extends Parent{
    private String field1;
    private String field2;

    @Override
    public void method1() {
        super.method1();
        System.out.println("Overridden method1 !!");
    }
}
