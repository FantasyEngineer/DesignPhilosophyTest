package LiskovSubstitutionPrinciple.old;

public class ReadDoc extends ReadFile{
    @Override
    public void read(String fileName) {
        System.out.println("读取doc文件"+fileName);

    }
}
