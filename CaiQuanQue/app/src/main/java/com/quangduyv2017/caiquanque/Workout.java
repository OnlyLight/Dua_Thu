package com.quangduyv2017.caiquanque;

import java.util.ArrayList;

/**
 * Created by a on 6/9/2017.
 */

public class Workout {
    public ArrayList<String> getWork (String workpress) {
        ArrayList<String> work = new ArrayList<>();
        if (workpress.equals("Cai")) {
            work.add("1");
        }
        else if (workpress.equals("Quan")) {
            work.add("2");
            work.add("3");
        }
        else if (workpress.equals("Que")) {
            work.add("5");
        }
        return work;
    }
}
