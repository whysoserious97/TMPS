package BankSystem.client;

import BankSystem.BehaviourDP.memento.FileHandler;
import BankSystem.StructuralDP.flyweight.DocumentFactory;
import BankSystem.StructuralDP.proxy.ProxyClass;
import BankSystem.StructuralDP.decorator.SuperDecorator;
import BankSystem.Creational.Users.abstraction.User;
import BankSystem.Creational.system.ITSystem;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //For test
        String testAccount="testacc";
        String testPassword="testpass";
        ProxyClass prox1=new ProxyClass();

        // First creation of the system
        ITSystem system= ITSystem.getITSystem();
        System.out.println("First system:"+system.hashCode());

        //Creating 2 users 1 internal, 1 external and 1 non-valid
        User user1=system.getNewUser("internal","Admin",testAccount+"1",testPassword);
        User user2=system.getNewUser("external","Client",testAccount+"2",testPassword);

        //Checking prototype Patern
        User user22 = user2.getClone("CloneAcc","ClonePass");
        System.out.println("User cloned has type: "+user22.getUserType());
        User user3 = system.getNewUser("internal","Client",testAccount+"3",testPassword);
        User user4 = system.getNewUser("internal","support",testAccount+"123",testPassword);

        //Trying to loggin for existing ones
        System.out.println(user1.login("user1","pass"));
        System.out.println(user1.getUserType());
        System.out.println(user2.login(testAccount+"2",testPassword));
        System.out.println(user2.getUserType());

        // Because 3rd is not valid he should be null and an exception has been risen.
        try {
            System.out.println(user3.login("abc","123"));
            System.out.println(user3.getUserType());
        }catch (Exception e){
            System.out.println("3rd user could not login");
        }

        // 2nd time we should get the same instance of System.ITSystem
        system= ITSystem.getITSystem();
        System.out.println("Second system:"+system.hashCode());


        // Decorator test - we want to create a super user that will be able to do everything
        User superUser = new SuperDecorator(user1);
        System.out.println(superUser.getUserType());
        System.out.println(superUser.login(testAccount+"1",testPassword));

        //Proxy
        prox1.user=user1;
        System.out.println("Login with proxy "+prox1.login(testAccount+"1",testPassword));
        System.out.println("Login with proxy "+prox1.login(testAccount+"1","testPassword"));

        // Flyweight
        user4.saveDoc("Raport 1","Acest raport este creat cu scopul...","raport-icon","encoding1",".doc","Rap document");
        user2.saveDoc("Raport 2","Acest raport este extensia raportului 1...","raportx-icon","encoding2",".docx","Rap documentX");
        user22.saveDoc("Raport 3","Acest raport este redactarea doc1 ...","raport-icon","encoding1",".doc","Rap document");


        ITSystem.getITSystem().printAllDocs();
        System.out.println(DocumentFactory.docTypes.size());

        //Behavour

        // Memento

        FileHandler fh = new FileHandler();

        System.out.println();
        String content = "Orange SA:Cerere de transfer, Gaz Natural Fenosa , 10000";
        fh.saveCopy(content);
        System.out.println("Checkpoit 1: " + content);
        content = "Status Cerere: Acceptat";
        fh.saveCopy(content);
        System.out.println("Checkpoit 2: " + content);

        content = fh.cancel("Insuficient Cash");

        System.out.println("Checkpoit 3: " + content);
        System.out.println();

        //Command DP  in each class I have added a common command 'work', now users are decoupled from implementation. And they do their job based on defined action

        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user4);

        for (User user:users) {
            user.work();
        }

    }


}
