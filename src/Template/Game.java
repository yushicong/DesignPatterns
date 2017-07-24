package Template;

/**
 * Created by bjyushicong on 2017/7/24.
 */
public abstract class Game {
    abstract void initPlay();
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        initPlay();
        startPlay();
        endPlay();
    }
}
