package strategy;

/**
 * Created by bjyushicong on 2017/7/24.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperaton(int num1, int num2) {
        return num1 - num2;
    }
}
