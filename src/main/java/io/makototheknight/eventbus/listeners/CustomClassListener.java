package io.makototheknight.eventbus.listeners;

import com.google.common.eventbus.Subscribe;
import io.makototheknight.eventbus.eventobjects.BoundedCustomClass;
import io.makototheknight.eventbus.eventobjects.CustomClass;
import io.makototheknight.eventbus.eventobjects.UnboundedCustomClass;

public class CustomClassListener {

    @Subscribe
    public void listenForCustomClass(final CustomClass customClass) {
        System.out.println("I've heard the custom class.");
    }

    @Subscribe
    public void listenForSpecificUnboundedCustomClass(final UnboundedCustomClass<Boolean> unboundedCustomClass) {
        System.out.println("I've heard the unbounded custom class, which is bound to booleans.");
    }

    @Subscribe
    public void listenForSpecificUnboundedCustomClass2(final UnboundedCustomClass<Object> objectUnboundedCustomClass) {
        System.out.println("I've heard the unbounded custom class, which is bound to Object.");
    }

    @Subscribe
    public <T> void listenForTypeInferredUnboundedCustomClass(final UnboundedCustomClass<T> typeUnboundedCustomClass) {
        System.out.println("I've heard the unbounded custom class, which is bound to a type determined on invocation.");
    }

    @Subscribe
    public void listenForBoundedCustomClass(final BoundedCustomClass<Double> doubleBoundedCustomClass) {
        System.out.println("I've heard the bounded custom class, which is bound to Double.");
    }

    @Subscribe
    public <T extends Number> void listenForTypeInferredBoundedCustomClass(final BoundedCustomClass<T> typeBoundedCustomClass) {
        System.out.println("I've heard the bounded custom class, which is bound to a type determined on invocation.");
    }

}
