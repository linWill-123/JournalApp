package util;

import android.app.Application;

public class JournalUser extends Application {
    private String username;
    private String userid;

    private static JournalUser instance;

    public static JournalUser getInstance() {
        if (instance == null) {
            instance = new JournalUser();
        }
        return instance;
    }

    public JournalUser() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
