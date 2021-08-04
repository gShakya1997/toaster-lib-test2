package com.example.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class ToasterLib {
    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
