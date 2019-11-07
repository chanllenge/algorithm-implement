package com.chan.internet.algorithm;

/**
 * Created by chan
 * Date: 2019/11/7 5:05 下午
 * Description: Excel表格里列排列分别是A...ZAZ...ZZ，假设对应数字0...2526....51,现在给一个字符串ZBA对应数字是多少
 */
public class KuaiShou {
    public static int BASE = 26;
    public int ExcelColumnParse(String column) {
        if (column == null) return -1;
        int result = 0;
        for (int i = column.length() - 1; i >= 0; i--) {
            if (i == column.length() -1) {
                result += column.charAt(i) - 'A';
            } else {
                result += (column.charAt(i) - 'A' + 1) * (BASE * (column.length() - 1 - i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "BB";
        System.out.println(new KuaiShou().ExcelColumnParse(str));
    }
}
