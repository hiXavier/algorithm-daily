package com.offer.str;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/9/1 19:47
 */
public class VersionCompare {
    public int compareVersion(String version1, String version2) {
        if (version1 == null || version1 == "" || version1 == " ") {
            return -1;
        }
        if (version2 == null || version2 == "" || version2 == " ") {
            return 1;
        }
        String[] versionParts1 = version1.split("\\.");
        String[] versionParts2 = version2.split("\\.");
        int minLen = versionParts1.length >= versionParts2.length ? versionParts2.length : versionParts1.length;
        int cursor = 0;
        for (; cursor < minLen; cursor++) {
            int num1 = Integer.parseInt(versionParts1[cursor]);
            int num2 = Integer.parseInt(versionParts2[cursor]);
            if (num1 == num2) {
                continue;
            }
            return num1 > num2 ? 1 : -1;
        }
        if (cursor < versionParts1.length) {
            for (; cursor < versionParts1.length; cursor++) {
                int num1 = Integer.parseInt(versionParts1[cursor]);
                if (num1 > 0) {
                    return 1;
                } else {
                    continue;
                }
            }
            return 0;
        } else if (cursor < versionParts2.length) {
            for (; cursor < versionParts2.length; cursor++) {
                int num1 = Integer.parseInt(versionParts2[cursor]);
                if (num1 > 0) {
                    return -1;
                } else {
                    continue;
                }
            }
            return 0;
        } else {
            return 0;
        }

    }


    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";
        int ans = new VersionCompare().compareVersion(version1, version2);
    }
}
