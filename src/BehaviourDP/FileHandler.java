package BehaviourDP;

public class FileHandler {
    Caretaker caretaker;
    Originator originator;
    public FileHandler() {
        this.caretaker = new Caretaker();
        this.originator = new Originator();
    }
    public void setEmployee(String user){
        originator.setUser(user);
    }
    public void saveCopy(String content){
        caretaker.addMemento(originator.save(content));
    }
    public String cancel(String reason){
        caretaker.deleteLastMemento();
        return originator.restore(caretaker.getMemento().addError(reason));
    }
}
