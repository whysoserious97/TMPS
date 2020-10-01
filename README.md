# TMPS
##### by Lesco Andrei
## Steps to do:
1. Run the class "Main"

Explanation:

> * Singleton - The Company has implemented an IT System and it should be a single instance.

> * Abstract Factory - The system should create 2 trypes of users: Internal and External factories.

> * Factory method - each facotry should create objects based on an interface.
> * Prototype patern - in some cases there is a need to get the copy of a user to make some small modifications

# What we are tring to do in MAIN?

1. We want to create an instance of system
2. We want to create 3 instances of users
> 1-st should be an admin type, 2-nd should be a client and 3-rd an invalid user
3. We want to check the prototype patern, so we are tring to clone the 2nd user.
4. We want to be sure that the factory will not be able to create an Object with an invalid combination.
5. We want to see how "login" method is implemented based on type of users that are accessing this method.
6. Also we need to get again the system instance, then we want to see if is the same instance as 1st one
