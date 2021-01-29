package com.nowcoder.community.utils;

public class StringUtils {
    public static Boolean isBlank(String a){
        if(a != "" || a != null || a != " "){
            return false;
        }
        return true;
    }
}
