package staticDefaultInterface;
public class Main {

    public static void main(String[] args) {
        IDefaultStatic.staticMethod();
        DefaultStaticImpl defaultStatic = new DefaultStaticImpl();
        defaultStatic.defaultMethod();
    }

}
