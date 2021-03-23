package interfaceSegregation.old;


//学生只能查询自己的成绩，不能进行插入或者其他的功能，这里接口都写了。 接口没有隔离
public class Student implements HandleScroe {


    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void updata() {

    }

    @Override
    public void print() {

        System.out.println("输出当前学生的成绩");

    }
}
