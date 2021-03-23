package LiskovSubstitutionPrinciple;

public enum ReadMangager {

    INSTANCE;

    /**
     * 读取文件,这里的输入条件要宽松
     *
     * @param readable
     * @param name
     */
    public void readFile(Readable readable, String name) {
        readable.readFile(name);
    }


    public static void main(String[] args) {
        ReadMangager.INSTANCE.readFile(new ReadDoc(), "1.doc");
        ReadMangager.INSTANCE.readFile(new ReadXsl(), "1.xsl");
    }
}
