package interfaceSegregation;

public class StudentA implements PrintImp {
    @Override
    public void print() {
        System.out.println("我的成绩是77");
    }
}
