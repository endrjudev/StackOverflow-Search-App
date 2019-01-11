package com.endrjudev.stackoverflowsearchapp.utils;

import com.endrjudev.stackoverflowsearchapp.model.StackResponse;

public class SystemUtils {

    private SystemUtils(){
        // Empty construction to assure this class is encapsulated
    }

    public static boolean isResponseOK(StackResponse response) {
        return response != null;
    }
}
