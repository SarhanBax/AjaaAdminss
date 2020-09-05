package com.example.ajaaadmin;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPreference
{


    private static final String PREF_NAME = "userPreference";
    private static final int MODE = Context.MODE_PRIVATE;
    public static final String Token="token";
    public static final String Userid="userid";

    Context context;

    UserPreference(Context context) {
        this.context = context;
    }
    public void saveLoginDetails(String contact, String password) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("contact", contact);
        editor.putString("Password", password);
        editor.commit();
    }

    public String getEmail() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("contact", "");
    }

    public boolean isUserLogedOut() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean isEmailEmpty = sharedPreferences.getString("contact", "").isEmpty();
        boolean isPasswordEmpty = sharedPreferences.getString("Password", "").isEmpty();
        return isEmailEmpty || isPasswordEmpty;
    }


    public static void writeBoolean(Context context, String key, boolean value) {
        getEditor(context).putBoolean(key, value).commit();
    }
    public static boolean readBoolean(Context context, String key,
                                      boolean defValue) {
        return getPreferences(context).getBoolean(key, defValue);
    }
    public static void writeInteger(Context context, String key, int value) {
        getEditor(context).putInt(key, value).commit();
    }
    public static int readInteger(Context context, String key, int defValue) {
        return getPreferences(context).getInt(key, defValue);
    }
    public static void writeString(Context context, String key, String value) {
        getEditor(context).putString(key, value).commit();
    }
    public static String readString(Context context, String key, String defValue) {
        return getPreferences(context).getString(key, defValue);
    }
    public static void writeLong(Context context, String key, long value) {
        getEditor(context).putLong(key, value).commit();
    }
    public static long readLong(Context context, String key, long defValue) {
        return getPreferences(context).getLong(key, defValue);
    }
    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, MODE);
    }
    public static SharedPreferences.Editor getEditor(Context context) {
        return getPreferences(context).edit();
    }
    public static void removeAllSharedPreferences(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}
