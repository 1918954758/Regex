package c1;

import java.util.regex.Pattern;

public class RegExp4 {
    public static void main(String[] args) {
        //元字符-选择匹配符号
        // | 匹配“|”之前或之后的表达式 ab|cd
        String content="1231351234 1234 123";
        String regStr="123|135";
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
