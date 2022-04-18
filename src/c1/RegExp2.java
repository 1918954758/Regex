package c1;

import java.util.regex.Pattern;

public class RegExp2 {
    public static void main(String[] args) {
        //元字符:字符匹配符
        /*
        * 1. [...]      可接受的字符列表                                  [efgh]       匹配efgh中的任意一个字符
        * 2. [^...]     不可接受的字符列表                                [^efgh]      匹配除efgh中的任意一个字符以外的字符
        * 3. -       连字符(范围匹配)                                    [A-Z]        任意单个大写字符
        * 4. .       匹配除\n以外的所有字符                               a..b         匹配a开头b结尾，中间包括两个任意字符的长度为4的字符串
        * 5. \\d     匹配单个数字，相当于[0-9]                            \\d{3}(\\d)? 匹配包含3个或4个数字的字符串
        * 6. \\D     匹配单个非数字字符，相当于[^0-9]                      \\D(\\d)*    匹配非数字开头，以任意多个数字结尾的字符串
        * 7. \\w     匹配单个数字，下划线，大小写字母字符，相当于[0-9a-zA-Z] \\d{3}\\w{4} 以三个数字开头的长度为7的数字字母字符串
        * 8. \\W     匹配非数字，下划线，大小写字母字符，相当于[^0-9a-zA-Z]  \\W+\\d{2}   以至少1个非数字字母字符开头，2个数字结尾的字符串
        * 9. \\s     匹配任何空白字符(空格,制表符)
        * 10.\\S     匹配任何非空白字符
        * */
        String content="1.[] 可接受的字符列表 [efgh] 匹配eaewr中的任意一个字符\n" +
                "        * 2.[^] 不可接受的字符列表 [^esdfasdfh] 匹配除esdffgh中的任意一个字符以外的字符\n" +
                "        * 3.- 连字符(范围匹配) A-Z 任意单个大写字符";
        String regStr="[a-z]{4}";
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到:"+matcher.group(0));
        }
    }
}
