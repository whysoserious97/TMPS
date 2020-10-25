package StructuralDP;

public class Document {
    private DocType type;


    private String filename;
    private String content;
    private String createdBy;

    public Document(DocType type,String content,String createdBy,String filename){
        this.type=type;
        this.filename=filename;
        this.content=content;
        this.createdBy=createdBy;
    }
    public void saveDoc(){
        type.saveDoc(filename,content,createdBy);

    }
    public void printDoc(){
        type.printDoc(filename,content,createdBy);

    }
}
