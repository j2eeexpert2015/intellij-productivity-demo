package lfe.sample.refactoring;

public class Sample {
    private String field3;
    private String field2;

    public Sample() {
    }

    public Sample(String field3, String field2) {
        this.field3 = field3;
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
