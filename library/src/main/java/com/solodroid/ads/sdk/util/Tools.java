package com.solodroid.ads.sdk.util;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Tools {

    public static String decode(String code) {
        return decodeBase64(decodeBase64(decodeBase64(code)));
    }

    public static String decodeBase64(String code) {
        byte[] valueDecoded = Base64.decode(code.getBytes(StandardCharsets.UTF_8), Base64.DEFAULT);
        return new String(valueDecoded);
    }

}
