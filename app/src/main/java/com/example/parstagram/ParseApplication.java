package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nbue7nNVMSY4QashNcjaja7zWRAbPfIFcioyc3Tc")
                .clientKey("5Ox7Fjt8iuU3TV3tuxaaja1tXSXRpsh5X4kQ28YZ")
                .server("https://parseapi.back4app.com")
                .build()
        );

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
