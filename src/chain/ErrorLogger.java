package chain;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error : " + message);
    }
}
