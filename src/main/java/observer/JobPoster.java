package observer;

import java.util.ArrayList;

public class JobPoster implements Subject{

    private ArrayList observers;

    public JobPoster(){
        observers = new ArrayList();
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }
    }


    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Observer notifiedObserver = (Observer) observers.get(i);
            notifiedObserver.update("There is a Data Change");
        }
    }
}

class JobSearcher implements Observer{

    private String name;

    public JobSearcher(String name){
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(data+" for "+this.name);
    }
}