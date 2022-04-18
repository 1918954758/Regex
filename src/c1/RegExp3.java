package c1;

import java.util.regex.Pattern;

public class RegExp3 {
    public static void main(String[] args) {
        //演示字符匹配符的使用
        String content="";
        String regStr="abc";//注意是默认区分大小写的
        //那么如何做到不区分大小写匹配呢
        //String regStr="((?i)str)" str代表不区分大小写的串,不写外层括号的话，默认后面不区分大小写
        var pattern= Pattern.compile(regStr);
        //还有一种方法Pattern.compile(regStr,Pattern.CASE_INSENSITIVE)
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到:"+matcher.group(0));
        }
    }
}
