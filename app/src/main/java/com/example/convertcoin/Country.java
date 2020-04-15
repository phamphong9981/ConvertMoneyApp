package com.example.convertcoin;

import android.view.View;

public class Country {
    String name;
    String[] array;

    public Country(String name, String[] array) {
        this.name = name;
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
}
