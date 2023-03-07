package singleton;

class SingletonLoggerLazyInstantiation {

    private String name;
    private String level;
    private static SingletonLoggerLazyInstantiation instance;

    private SingletonLoggerLazyInstantiation(){
        this.name = "Default Logger";
        this.level = "Error";
    }

    // Lazy Instantiation - only create the instance when it is needed (when the getInstance method is called)
    public static SingletonLoggerLazyInstantiation getInstance(){
        if(instance == null){
            instance = new SingletonLoggerLazyInstantiation();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMessage(String message){
        System.out.println("Log Level: "+this.level+", "+message);
    }

    public void setLevel(String level){
        this.level = level;
    }

}

class SingletonLoggerEagerInstantiation {

    private String name;
    private String level;
    private static final SingletonLoggerEagerInstantiation instance = new SingletonLoggerEagerInstantiation();

    // Eager Instantiation - create the instance when the class is loaded (when the class is first used)
    private SingletonLoggerEagerInstantiation(){
        this.name = "Default Logger";
        this.level = "Error";
    }

    public static SingletonLoggerEagerInstantiation getInstance(){
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMessage(String message){
        System.out.println("Log Level: "+this.level+", "+message);
    }

    public void setLevel(String level){
        this.level = level;
    }



}