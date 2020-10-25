package BankSystem;

import StructuralDP.DocType;
import StructuralDP.Document;
import StructuralDP.DocumentFactory;
import BankSystem.Users.User;

import java.util.ArrayList;
import java.util.List;

public class ITSystem {

    private static ITSystem system;
    private static final List<Document> documents = new ArrayList<>();


    private ITSystem(){

    }

    public static ITSystem getITSystem(){
        if (system == null){
            synchronized(ITSystem.class){
                if (system == null){
                    system = new ITSystem();
                }
            }
        }
        return system;
    }

    public User getNewUser(String FactoryType, String UserType,String account,String password){
        return UserFactory.getUserFactory(FactoryType).getUser(UserType,account,password);

    }
    public void saveIntoSystem(String filename,String content,String createdBy,String icon, String encoding,String extension,String fullname){
        DocType type = DocumentFactory.getDocType(encoding, icon, extension,fullname);
        Document doc = new Document(type,content,createdBy,filename);
        documents.add(doc);
    }
    public void printAllDocs(){
        for (Document doc:documents){
            doc.printDoc();
        }
    }

}
