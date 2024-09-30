package lfe.sample.refactoring;

public class SafeDeleteSample
{
    private String field1;

    public SafeDeleteSample(String field1)
    {
        this.field1 = field1;
    }

    private void method1(int i)
    {
        method2(i);
    }
    private void method2(int i)
    {
        method3(i);
    }
    private void method3(int i) { }
}
