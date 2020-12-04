# Topic: Creational DP
## Author: Lesco Andrei
------
## Acomplished Objectives :
__1. I have studied and understood the Creational Design Patterns;__

__2. The domain chosen is "IT BankSystem inside a big company", in the next lab I will implement the logic for a bank system__

__3. In this project I have chosen The next CDP: Singleton,Factory Method,Abstract factory and Prototype__
## Introduction:
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or in added complexity to the design.

## Implementation
> * Singleton - The Company has implemented an IT BankSystem and it should be a single instance.
        
     public class ITSystem {
    
        private static ITSystem system;
    
    
    
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
    
        public User getNewUser(String FactoryType, String UserType){
            return UserFactory.getUserFactory(FactoryType).getUser(UserType);
    
        }
    
    }
 In the code snipet we see that we have implemented singleton by making an instance of the class, making the constructor private to avoid another objects to be created, and have created a Thread-safe instantiation of the instance


> * Factory method - Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
        
    public class InternalUserFactory extends UserFactory {
    
        @Override
        public User getUser(String userType) {
    
            User user = null;
            String factoryType = "Internal";
    
            if (userType.toLowerCase().equals("admin")) {
                user = new AdminUser(factoryType);
            } else if (userType.toLowerCase().equals("support")) {
                user = new SupportUser(factoryType);
            }
            return user;
        }
    
    }
In this snipet we can see that we are using Interface instead of concrete implementation.
And the factory will create the object at Run-Time.

> * Abstract Factory - The system should create 2 trypes of users: Internal and External factories.
    
    public abstract class UserFactory {
    
        public abstract User getUser(String userType);
    
    
        public static UserFactory getUserFactory(String factoryType){
    
            UserFactory userFactory = null;
            if (factoryType.toLowerCase().equals("internal")){
    
                userFactory= new InternalUserFactory();
            }
            else if(factoryType.toLowerCase().equals("external")){
    
                userFactory= new ExternalUserFactory();
            }
    
            return userFactory;
        }
    }
In this snipet we see that our class creates another factory that will create our objects.
>* Prototype patern - in some cases there is a need to get the copy of a user to make some small modifications

As we see the user has to implement a clone method
    
    public interface User {
         String getUserType();
         String login();
         User getClone();
    }

For example the client can also clone an instance of himself
    
    @Override
        public User getClone() {
            return new ClientUser(userType);
        }



# What we are tring to do in MAIN?

1. We want to create an instance of system
2. We want to create 3 instances of users
> 1-st should be an admin type, 2-nd should be a client and 3-rd an invalid user
3. We want to check the prototype patern, so we are tring to clone the 2nd user.
4. We want to be sure that the factory will not be able to create an Object with an invalid combination.
5. We want to see how "login" method is implemented based on type of users that are accessing this method.
6. Also we need to get again the system instance, then we want to see if is the same instance as 1st one
