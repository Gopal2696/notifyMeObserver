package org.example;

import java.util.ArrayList;
import java.util.List;

public interface NotifyMeObservable {

    // Create a list of observer
    List<NotifyMeOberserver> listOfObserver = new ArrayList<>();

    public void notifyObservers();
    public void add(NotifyMeOberserver observer);
    public void remove(NotifyMeOberserver observer);
}
