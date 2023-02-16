package singleton;

public class SingletonSimulator {
    public static void main(String[] args){
        SingletonLoggerLazyInstantiation lazyLogger1 = SingletonLoggerLazyInstantiation.getInstance();
        lazyLogger1.setLevel("Debug");

        SingletonLoggerLazyInstantiation lazyLogger2 = SingletonLoggerLazyInstantiation.getInstance();
        lazyLogger2.setLevel("Info");

        lazyLogger1.printMessage("Test Lazy Logger 1");
        lazyLogger2.printMessage("Test Lazy Logger 2");

        SingletonLoggerEagerInstantiation lazyLogger3 = SingletonLoggerEagerInstantiation.getInstance();
        lazyLogger3.setLevel("Critical");

        SingletonLoggerEagerInstantiation lazyLogger4 = SingletonLoggerEagerInstantiation.getInstance();
        lazyLogger4.setLevel("Fatal");

        lazyLogger3.printMessage("Test Lazy Logger 3");
        lazyLogger4.printMessage("Test Lazy Logger 4");
    }
}
