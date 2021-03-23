package interfaceSegregation;

/**
 * 老师就可以增删改查
 */
public class TeacherA implements PrintImp, InsertImp, SearchImp, DeleteImp {
    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void insert() {

    }

    @Override
    public void print() {

    }

    @Override
    public void search() {

    }
}
