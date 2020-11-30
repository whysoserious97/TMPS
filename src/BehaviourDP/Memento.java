package BehaviourDP;

public class Memento {
    private String content;
    private String error;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public Memento addError(String error){
        this.error = error;
        return this;
    }
}
