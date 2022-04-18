package c2;

import java.util.regex.Pattern;

public class MatherMethod {
    public static void main(String[] args) {
        String content="hello edu jack tom hello smith hello";
        String regStr="hello";
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("------------");
            System.out.println(matcher.start());//匹配字符串初始索引
            System.out.println(matcher.end());//匹配字符串末尾索引+1
            System.out.println(content.substring(matcher.start(),matcher.end()));
        }//matcher自带替换方法replaceAll:注意不是在原来的String上修改而是返回一个新的String
        String newContent=matcher.replaceAll("Replacement");
        System.out.println("整体匹配:"+matcher.matches());
        System.out.println("newContent:"+newContent);
    }
}
