package Template;

/**
 * Created by bjyushicong on 2017/7/24.
 */
public class Cricket extends Game {
    @Override
    void initPlay() {
        System.out.println("init");
    }

    @Override
    void startPlay() {
        System.out.println("start");
    }

    @Override
    void endPlay() {
        System.out.println("end");
    }
}
