package io.zipcoder.polymorphism;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


//Class holding a map of all possible commands.
public enum Command {
    ADD("+"), //Add pet
    INT("P"), //Interact
    ERR("E"), //Error state
    SPK("T"), //Pet Speak
    SEL(">"), //Select Pet
    NAM("N"), //Pet Name
    RET("R"), //Return To Top Menu
    END("Q"), //Quit Program
    ;

    private String name;

    private static final Map<String,Command> ENUM_MAP;

    Command (String name) {
        this.name = name;
    }

    //Per the Calculator example, build a map of String name to enum pairs (key value pairs)

    static {
        Map<String,Command> map = new ConcurrentHashMap<String, Command>();
        for (Command instance : Command.values()) {
            map.put(instance.getDeclaringClass().getName().toLowerCase(), instance); //check, looks different from calculator example.
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Command get (String name) {
        return ENUM_MAP.getOrDefault(name.toLowerCase(), Command.ERR);
    }
}



