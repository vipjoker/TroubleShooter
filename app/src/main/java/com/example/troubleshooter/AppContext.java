package com.example.troubleshooter;

import android.app.Application;

import java.util.ArrayList;

public class AppContext extends Application {
    public static boolean backButtonCantCloseApp = false;
    public static boolean isInitialized = false;
    public static String BROADCAST_ACTION = "com.example.troubleshooter.ACTION";
    public static String LIST_ACTION = "com.example.troubleshooter.LIST_ACTION";
    public static String SCENARIOS_URL ="http://expert-system.internal.shinyshark.com/scenarios/";
    public static String DETAILS_URL = "http://expert-system.internal.shinyshark.com/cases/";
    public static String CASE_ID = "com.example.troubleshooter.CASE_ID";

    public static String BUNDLE_YES = "com.example.troubleshooter.BUNDLE_YES";
    public static String BUNDLE_NO = "com.example.troubleshooter.BUNDLE_NO";
    public static String BUNDLE_YES_TEXT ="com.example.troubleshooter.BUNDLE_YES_TEXT";
    public static String BUNDLE_NO_TEXT ="com.example.troubleshooter.BUNDLE_NO_TEXT";
    public static String BUNDLE_TEXT = "com.example.troubleshooter.BUNDLE_TEXT";
    public static String BUNDLE_URL = "com.example.troubleshooter.BUNDLE_URL";




    public ArrayList<String> data = new ArrayList<String>();

    public ArrayList<String> getData() {
        return data;
    }


}
