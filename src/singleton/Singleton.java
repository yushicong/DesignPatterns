package singleton;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class Singleton {

    private static Singleton intance = new Singleton();

    private Singleton(){}

    public static Singleton getIntance(){
        return intance;
    }

}
