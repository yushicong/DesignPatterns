package factory;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
