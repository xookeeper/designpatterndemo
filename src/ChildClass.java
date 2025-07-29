
public class ChildClass extends ParentClass{

    private static ChildClass instance = null;

    private ChildClass(){
        System.out.println("ChildClass Object created.");
    }

    public static ChildClass getInstance(){
        ParentClass parent = ParentClass.getInstance();

        if(parent == null){
            instance = new ChildClass();
            ParentClass.setInstance(instance);
            return instance;
        }else if (parent instanceof ChildClass){
            return (ChildClass) parent;
        }else{
            throw new IllegalStateException("ParentClass Instance already created, Cannot create ChildClass Instance.");
        }
    }
}
