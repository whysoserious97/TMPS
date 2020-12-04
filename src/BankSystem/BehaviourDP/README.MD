# Topic: Behavioural DP
## Author: Lesco Andrei
------
## Acomplished Objectives :
__1. I have studied and understood the Behavioural Design Patterns;__

__2. The domain chosen is "IT BankSystem inside a big company".__

__3. In this project I have chosen The next BDP: Memento and Command__
## Introduction:
Behavioural design patterns are concerned with algorithms and the assignment of responsibilities between objects.

## Implementation
> * Memento - I am using this pattern to recover a state of the document during business process.

        
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
 In the code snipet we see that we have implemented Memento, that changes the content of the file
 


> * Command - I have used command to decouple the action from implementation.
        
        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user4);

        for (User user:users) {
            user.work();
        }


* Output:

Originator: Saving to Memento.
Checkpoit 1: Orange SA:Cerere de transfer, Gaz Natural Fenosa , 10000
Originator: Saving to Memento.
Checkpoit 2: Status Cerere: Acceptat
Checkpoit 3: Orange SA:Cerere de transfer, Gaz Natural Fenosa , 10000

Admin is working on new requirements
Client is making a request
Support help the clients right now