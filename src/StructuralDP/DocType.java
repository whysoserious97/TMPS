package StructuralDP;

public class DocType {

    private String encoding;
    private String icon;
    private String extention;
    private String fullName;

    public DocType(String encoding,String icon,String extention,String fullName){
        this.encoding=encoding;
        this.icon=icon;
        this.extention=extention;
        this.fullName=fullName;

    }
    public void saveDoc(String filename, String content, String createdBy){
        System.out.println("Saved document:"+filename+" the content is:"+content+"created by:"+createdBy);
    }
    public void printDoc(String filename, String content, String createdBy){
        System.out.println("Document:"+filename+" the content is:"+content+"created by:"+createdBy);
    }

}
