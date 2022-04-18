package c2;

import java.util.regex.Pattern;

public class PatternMethod {
    public static void main(String[] args) {
        //演示matches方法，用于整体匹配，在验证输入的字符串是否满足条件使用
        //用于验证手机号、邮箱啥的整体匹配的时候，直接用matches方法就行
        String content="hello abc hello";
        String regStr="^(hello).*(hello)$";//整体匹配相当于不加定位符=和加定位符

        boolean matches= Pattern.matches(regStr,content);
        System.out.println("整体匹配:"+matches);
    }
}
