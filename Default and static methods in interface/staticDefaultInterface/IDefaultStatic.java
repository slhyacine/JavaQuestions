package staticDefaultInterface;

public interface IDefaultStatic {

    // Can be overridden by the implementing classes
    // called by the instance of the implementing classes
    default void defaultMethod() {
        System.out.println(
                "This is a default interface method, called by the class object that implement this interface"
        );
    }

    // Cannot be overridden by the implementing classes
    // Called by the interface name
    static void staticMethod() {
        System.out.println("This is a static interface method called by the interface name");
    }

}
