package org.example;

public class IphoneNotifyMeObserver implements NotifyMeOberserver {

    final NotifyMeObservable observable;
    final String email;
    public IphoneNotifyMeObserver(NotifyMeObservable iphoneObservable, final String userEmail) {
       this.observable = iphoneObservable;
       this.email = userEmail;
    }


    @Override
    public void update() {
        // when update method is called, we can send email notification to the user that iphone is available
        System.out.println("IphoneNotifyMeObserver update");
    }
}
