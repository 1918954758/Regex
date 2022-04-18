package c4;

import java.util.regex.Pattern;

public class RegExp12 {
    public static void main(String[] args) {
        /*
        * 正则表达式实战:结巴去重案例
        * */
        String content="我.......我要........学学学学学学.......编程java";
        //1.去掉所用的.
        String regStr1="\\.";
        var pattern= Pattern.compile(regStr1);
        var matcher=pattern.matcher(content);
        content=matcher.replaceAll("");
        System.out.println(content);
        //2.去重
        //  2.1 使用(.)\\1+去匹配所有的重复字(注意是重复字！！！)
        //  2.2 使用反向引用来替换匹配到的内容
        String regStr2="(.)\\1+";
//        pattern= Pattern.compile(regStr2);
//        matcher=pattern.matcher(content);
//        while(matcher.find()){
//            System.out.println(matcher.group(0));
//        }
//        content = matcher.replaceAll("$1");
//        System.out.println(content);
        // 3.其实可以使用一条语句去掉重复内容
        content=Pattern.compile(regStr2).matcher(content).replaceAll("$1");
        System.out.println(content);//NB!
    }
}
