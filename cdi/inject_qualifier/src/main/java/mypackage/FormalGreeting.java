package mypackage;

@Formal
public class FormalGreeting implements GreetingInterface {
    public String greet(String name){
        return "Formal Hello " + name;
    }
}
