package lfe.sample.navigation;

import java.util.ArrayList;

public class Child extends Parent{
    private String field1;
    private int field2;

    @Override
    public void method1() {
        super.method1();

        System.out.println("Overridden method1 !!");

        //ArrayList
    }
}
