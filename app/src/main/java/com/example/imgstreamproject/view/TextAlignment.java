package com.example.imgstreamproject.view;

public enum TextAlignment {
    INHERIT(0),
    GRAVITY(1),
    TEXT_START(2),
    TEXT_END(3),
    CENTER(4),
    VIEW_START(5),
    VIEW_END(6);

    public final int value;

    TextAlignment(int value) {
        this.value = value;
    }
}
