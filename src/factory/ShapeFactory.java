package factory;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

}
