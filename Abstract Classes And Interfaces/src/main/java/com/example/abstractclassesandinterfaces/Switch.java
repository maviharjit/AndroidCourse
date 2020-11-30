package com.example.abstractclassesandinterfaces;

import java.util.ArrayList;
import java.util.List;

/* created by learnovate */
public class Switch {

    private List<Switchable> switchableItems = new ArrayList<Switchable>();

    public void wireUP(Switchable thing) {
        switchableItems.add(thing);
    }

    public void wireDown(Switchable thing) {
        switchableItems.remove(thing);
    }

    public void flipSwitchUp() {
        for(Switchable thing:switchableItems) {
            thing.turnOn();
        }
    }

    public void flipSwitchDown() {
        for(Switchable thing:switchableItems) {
            thing.turnOff();
        }
    }
}
