package LiskovSubstitutionPrinciple.old;

public class FileManager {

    public static void readFile(ReadFile a, String fileName) {
        a.read(fileName);
    }

    public static void main(String[] args) {
        readFile(new ReadFile(), "a.xsl");
        readFile(new ReadDoc(), "a.xsl");
    }


}
