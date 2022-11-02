package observer;


import java.util.ArrayList;

public class Channel implements Subject{
    private final ArrayList<String> videos;
    private final ArrayList<Observer> observers;

    public Channel() {
        observers = new ArrayList();
        videos = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) { observers.remove(i); }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update();
        }
    }
    public void addVideo(String videoName){
        videos.add(videoName);
        notifyObservers();
    }
    // You can add some methods like addVideo
}
