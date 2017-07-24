package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by bjyushicong on 2017/7/24.
 */
public class Subject {

    private List<Object> objectList = new ArrayList<Object>();

    public void add(Observer observer){
        objectList.add(observer);
    }

    public void uppdate(Object observer){

    }

}
