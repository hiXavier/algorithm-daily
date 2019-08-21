package com.xavier.fifty;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author wuyanfeng
 * @Description
 * @Date 2019/8/21 20:33
 */
public class _13_RomanToIntTest {

    @Before
    public void setUp() throws Exception {
        _13_RomanToInt romanToInt = new _13_RomanToInt();
    }

    @Test
    public void romanToInt() {
        _13_RomanToInt romanToInt = new _13_RomanToInt();
       int result =  romanToInt.romanToInt("LX");
        System.out.println(result);
    }
}
