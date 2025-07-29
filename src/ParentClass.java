public class ParentClass {
    private static ParentClass instance = null;

    protected ParentClass(){
        System.out.println("ParentClass instance created.");
    }

    public static ParentClass createParentInstance(){
        if(instance == null){
            instance = new ParentClass();
        }
        return instance;
    }

    public static ParentClass getInstance(){
        return instance;
    }

    protected static void setInstance(ParentClass parent){
        instance = parent;
    }



}
