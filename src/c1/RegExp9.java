package c1;

import java.util.regex.Pattern;

public class RegExp9 {
    public static void main(String[] args) {
        //非贪婪匹配
        /*
        * 当?字符紧随任何其他限定符(*+?{n}{n,}{n,m})之后时，匹配模式是非贪婪的，非贪婪模式匹配搜索到尽可能短的字符串(默认的贪心模式匹配尽可能多)
        * */
        String content="hello11111111";
        String regStr="\\d+?";
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
