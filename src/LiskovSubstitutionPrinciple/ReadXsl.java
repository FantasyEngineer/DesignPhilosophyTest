package LiskovSubstitutionPrinciple;

public class ReadXsl implements Readable {
    @Override
    public void readFile(String fileName) {
        System.out.println("读取xsl文件");
    }
}
