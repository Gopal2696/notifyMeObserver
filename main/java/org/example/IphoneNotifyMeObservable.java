package org.example;

public class IphoneNotifyMeObservable implements NotifyMeObservable {
    @Override
    public void notifyObservers() {
        // if something changes, it will notify all the observers
        for (NotifyMeOberserver observer : this.listOfObserver) {
            observer.update();
        }
    }

    @Override
    public void add(NotifyMeOberserver observer) {
        this.listOfObserver.add(observer);
    }

    @Override
    public void remove(NotifyMeOberserver observer) {
        if (this.listOfObserver.contains(observer)) {
            this.listOfObserver.remove(observer);
        }
    }
}
