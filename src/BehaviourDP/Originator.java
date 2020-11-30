package BehaviourDP;

public class Originator {
    private String state;

    public void setUser(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public Memento save(String content) {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(content);
    }
    public String  restore(Memento m) {
        return m.getContent();
    }
}
