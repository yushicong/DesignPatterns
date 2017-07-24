package Proxy;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class RealImage implements Image {
    @Override
    public void display() {
        System.out.println("RealImage ");
    }
}
