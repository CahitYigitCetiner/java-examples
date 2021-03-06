package designpattern.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static volatile Singleton singleton;

    /**
     * Overcome reflection issue
     */
    private Singleton() {
        if (singleton != null) {
            throw new InstantiationError("Error creating Singleton class");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * Overcome Cloning issue
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * Overcome serialization issue
     * @return
     */
    protected Object readResolve() {
        return Singleton.getInstance();
    }
}
