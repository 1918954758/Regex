package c1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
    public static void main(String[] args) {
        //演示转义字符的使用
        String content="abc&(abc(123(";
        //需求:匹配(
        String regStr="\\(";//在java中，两个\\代表一个其他语言中的\，这一点比较特殊
        var pattern= Pattern.compile(regStr);
        var matcher= pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }
        //需要用到转义字符的符号如下:.*+()$/\?[]^{}
    }
}
