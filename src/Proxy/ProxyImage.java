package Proxy;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage();
        }
        realImage.display();
    }
}
