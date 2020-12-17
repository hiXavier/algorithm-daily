package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/6 16:05
 */
public enum SeasonEnum  {
    SPRING,SUMMER,FALL,WINTER
    ;
}

class EnumTest{
    public static void main(String[] args) {
        Integer integer = Integer.getInteger("123");
        boolean isEumInstance = SeasonEnum.SUMMER instanceof SeasonEnum;
        boolean isObjectInstance = SeasonEnum.SUMMER instanceof  Object;
        boolean isNullObject = null instanceof Object;
        System.out.println(SeasonEnum.SPRING);
    }
}
