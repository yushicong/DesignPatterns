package chain;

/**
 * Created by bjyushicong on 2017/7/21.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR =3;

    protected int level;

    protected AbstractLogger nexLogger;

    public void setNexLogger(AbstractLogger nexLogger){
        this.nexLogger = nexLogger;
    }

    public void logMessage(int level ,String message){
        if (this.level <= level){
            write(message);
        }
        if (nexLogger == null){
            nexLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
