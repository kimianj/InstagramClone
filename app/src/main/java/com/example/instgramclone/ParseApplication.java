package com.example.instgramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("l6OlUsq9HSF9s1560sUDte8U0WU5ns3B7c5KF4o8")
                .clientKey("UnVzFwxbKd9eiFTucwQIaG1bO9zsNpUgDRZ80gx5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
