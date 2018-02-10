package com.eveningoutpost.dexdrip.Models;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

class HistoricBg {

    public int quality;
    public int time;
    public double bg;
}

public class OOPResults {
    double currentBg;
    int currentTime;
    int currenTrend;
    HistoricBg [] historicBg;
    long timestamp;
    String serialNumber;

    String toGson() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(this);
    }
}