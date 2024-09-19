package lfe.sample.codeediting;

import java.util.Arrays;
import java.util.List;

public class MovingCode
{
    private int dummyValue  = 100;
    public void sampleMethod1()
    {
        List<String> items = Arrays.asList("One","Two","Three");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void sampleMethod2(String parameter,int parameter2)
    {
        List<String> items = Arrays.asList("One","Two","Three");
        for (String item : items) {
            System.out.println(item);
        }
    }

}
