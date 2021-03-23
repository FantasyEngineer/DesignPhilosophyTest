package interfaceSegregation;


/**
 * 接口隔离的概念：
 * 客户端不应该以来他不需要的接口
 * 类之间的以来关系应该建立在最小的接口上
 * 接口隔离原则是对接口使用进行约束的一个原则
 */
public class ExcuteMain {

    public static void main(String[] args) {

        //学生只有自己打印自己成绩的功能
        StudentA studentA = new StudentA();
        studentA.print();

        //老师是有所有的功能
        TeacherA teacherA = new TeacherA();
        teacherA.delete();
        teacherA.insert();
        teacherA.print();
        teacherA.search();

    }
}
