package StructuralDP;


import java.util.HashMap;
import java.util.Map;

public class DocumentFactory {
   public static Map<String, DocType> docTypes = new HashMap<>();

    public static DocType getDocType(String encoding,String icon,String extention,String fullName) {
        DocType result = docTypes.get(extention);
        if (result == null) {
            result = new DocType(encoding, icon, extention, fullName);
            docTypes.put(extention, result);
        }
        return result;
    }

}
