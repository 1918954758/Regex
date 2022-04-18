package c1;

import java.util.regex.Pattern;

public class RegExp8 {
    public static void main(String[] args) {
        //特殊分组
        /*
        * 1. (?:pattern)        匹配pattern但是不捕获该匹配的子表达式，即它是一个非捕获匹配，不存储供以后使用的匹配，这对于用"|"组合的表达式由优化效果，比如industr(?:y|ies)比industry|industries更加经济
        * 2. (?=pattern)        非捕获匹配(之间看下面的案例理解)
        * 3. (?!pattern)        非捕获匹配,匹配不处于匹配的字符串的起点的搜索字符串(与2相反)
        * 直接上案例来感受一下(注意上面三者都是非捕获匹配)
        * 非捕获匹配貌似不能放在开头???
        * */
        //要求1:获取wwtnb,wwtnB,wwtNb,wwtNB四种子字符串
        //要求2:获取wwt这个关键字，但是要求只查找wwtNB和wwtnb中包含的wwt
        //要求3:获取wwt这个关键字，但是要求只查找不是(wwtNB,wwtnb)中包含的wwt
        String content="wwtNB asdfhaslkd asdfwwtnb wwtnB as2431wwtNb";
        //String regStr="wwt(?:nb|NB|nB|Nb)";
        //String regStr="wwt(?=NB|nb)";
        String regStr="wwt(?!NB|nb)";
        System.out.println(content);
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(0));//NB
            //System.out.println(matcher.group(1));非捕获匹配无捕获分组
        }
    }
}
