
public class Test {
    private String str = "外部类中的字符串";

    public class InnerClass {
        private String inStr = "内部类中的字符串";
    }

    //外部类可以随意调用内部类成员变量
    public void print() {
        InnerClass innerClass = new InnerClass();
    }

    //
    public static void main(String[] args) {
        Test test = new Test();
        InnerClass innerClass = test.new InnerClass();
        System.out.println(innerClass.inStr);

        ThreadLocal threadLocal;
        new Thread();
    }
}
