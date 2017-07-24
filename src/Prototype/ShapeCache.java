package Prototype;

import factory.*;

import java.util.Hashtable;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ShapeCache {

    private static Hashtable<String , Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape =shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        shapeMap.put("1",circle);
        Rectangle rectangle = new Rectangle();
        shapeMap.put("2",rectangle);
        Square square = new Square();
        shapeMap.put("3",square);

    }
}
