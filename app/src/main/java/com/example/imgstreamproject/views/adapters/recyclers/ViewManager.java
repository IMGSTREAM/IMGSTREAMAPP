package com.example.imgstreamproject.views.adapters.recyclers;

import java.util.Arrays;

public enum ViewManager {
    GRID, FLOW, LINE;

    public String toLowerCase(){
        return toString().toLowerCase();
    }

    public String toUpperCase(){
        return toString().toUpperCase();
    }

    public String[] toStringArray() {
        String[] names = Arrays.stream(this.values()).map(e -> e.toString()).toArray(String[]::new);
        return names;
    }

    public String[] toLowerCaseArray() {
        String[] names = Arrays.stream(this.values()).map(e -> e.toLowerCase()).toArray(String[]::new);
        return names;
    }

    public String[] toUpperCaseArray() {
        String[] names = Arrays.stream(this.values()).map(e -> e.toUpperCase()).toArray(String[]::new);
        return names;
    }
}
