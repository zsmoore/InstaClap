package com.zachary_moore.instaclap;

import android.text.TextUtils;

public class StringUtils {

    public static String insertClaps(String inputString) {
        inputString = inputString.trim();
        String[] split = inputString.split("\\s+");
        return TextUtils.join(new String(Character.toChars(0x1F44F)), split);
    }
}
