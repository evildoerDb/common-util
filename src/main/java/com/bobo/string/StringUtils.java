package com.bobo.string;

/**
 * Created by evildoerdb_ on 2019/3/12
 */
public class StringUtils {

    /**
     *  subString from start to
     * @param str
     * @param start include index of start
     * @param end not include index of end
     * @return
     */
    public static String subString(String str, int start, int end){
        if (start < end){
            return "";
        }else {
            StringBuilder sb = new StringBuilder();

            for (int i = start; i < end; i++){
                sb.append(str.charAt(i));
            }

            return sb.toString();
        }
    }
}
