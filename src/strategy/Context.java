package strategy;

/**
 * Created by bjyushicong on 2017/7/24.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executStrategy(int num1,int num2){
        return strategy.doOperaton(num1,num2);
    }

}
