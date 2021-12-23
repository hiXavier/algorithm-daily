package com.offer.array;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/8/21 14:41
 */
public class StringCompression {
    public int compress(char[] chars) {
        if(chars == null || chars.length == 0){
            return 0;
        }
        StringBuilder sbu = new StringBuilder();
        int cn = 1;
        char localCh = chars[0];
        for(int i = 1; i < chars.length; i++){
            if(localCh == chars[i]){
                cn++;
            }else{
                sbu.append(localCh).append(cn);
                localCh = chars[i];
                cn = 1;
            }
        }
        return sbu.append(localCh).append(cn).length();
    }


    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = new StringCompression().compress(chars);
        System.out.println(len);
    }
}
