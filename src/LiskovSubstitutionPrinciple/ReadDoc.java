package LiskovSubstitutionPrinciple;

public class ReadDoc implements Readable{
    @Override
    public void readFile(String fileName) {
        System.out.println("读取doc文件");
    }
}
