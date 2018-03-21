package com.arnavdhamija.roamnet;

import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by nic on 21/3/18.
 */

public class DestinationAck {
    private long timestamp;
    private final static String TAG = "DestAck";

    private ArrayList<String> ackedFiles;

    DestinationAck(long _time, ArrayList<String> _ackedFiles) {
        timestamp = _time;
        ackedFiles = _ackedFiles;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public ArrayList<String> getAckedFiles() {
        return ackedFiles;
    }

    public static DestinationAck fromString(String jsonEncodedDestAck) {
        Gson gson = new Gson();
        return gson.fromJson(jsonEncodedDestAck, DestinationAck.class);
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        Log.d(TAG, "JSON string " + gson.toJson(this));
        return gson.toJson(this);
    }
}