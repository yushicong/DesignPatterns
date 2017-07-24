package chain;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger : " + message);
    }
}
