package interface_vs_class;

public interface IParent {
    String test = "interface";

    default void testMethod(){
        System.out.println("interface");
    }
}
