package chain;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);

        error.setNexLogger(file);
        file.setNexLogger(console);

        return error;
    }
}
