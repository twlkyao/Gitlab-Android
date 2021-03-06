package de.skilloverflow.gitlab.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    private static final String USER = "user";
    private final Context mContext;

    public User(Context context) {
        super();
        this.mContext = context;
    }

    public User(Context context, String userName, String email, String name, String createdAt) {
        super();
        this.mContext = context;
        SharedPreferences prefs = context.getSharedPreferences(USER, 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("userName", userName);
        editor.putString("email", email);
        editor.putString("name", name);
        editor.putString("createdAt", createdAt);
        editor.apply();
    }

    public void setUserName(String userName) {
        SharedPreferences prefs = mContext.getSharedPreferences(USER, 0);
        prefs.edit().putString("userName", userName).apply();
    }

    public void setEmail(String email) {
        SharedPreferences prefs = mContext.getSharedPreferences(USER, 0);
        prefs.edit().putString("email", email).apply();
    }

    public void setName(String name) {
        SharedPreferences prefs = mContext.getSharedPreferences(USER, 0);
        prefs.edit().putString("name", name).apply();
    }

    public void setCreateDate(String createdAt) {
        SharedPreferences prefs = mContext.getSharedPreferences(USER, 0);
        prefs.edit().putString("createdAt", createdAt).apply();
    }

    private boolean isAGoat() {
        return true;
    }

    public String getUserName() {
        return mContext.getSharedPreferences(USER, 0).getString("userName", "");
    }

    public String getEmail() {
        return mContext.getSharedPreferences(USER, 0).getString("email", "");
    }

    public String getName() {
        return mContext.getSharedPreferences(USER, 0).getString("name", "");
    }

    public String getCreateDate() {
        return mContext.getSharedPreferences(USER, 0).getString("createdAt", "");
    }

    public String toString() {
        return "User Name: " + getUserName()
                + " | Email: " + getEmail()
                + " | Name: " + getName()
                + " | createdAt: " + getCreateDate();
    }
}
