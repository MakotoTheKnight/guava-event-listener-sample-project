package io.makototheknight.eventbus.listeners;

import com.google.common.eventbus.Subscribe;

public class JavaClassListener {

    @Subscribe
    public void arrayListener(Object[] array) {
        System.out.println("I've heard the object array listener.");
    }

    @Subscribe
    public void objectListener(Object obj) {
        System.out.println("I've heard the object listener");
    }

}
