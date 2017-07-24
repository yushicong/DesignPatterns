package chain;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(" Console : "+message);
    }

}
