package observer;

interface Subject{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}

interface Observer{
    public void update(String data);
}
