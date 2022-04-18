package c1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegExp7 {
    public static void main(String[] args) {
        //常用分组规则
        /*
        * 常用分组构造形式
        * 1. (pattern)          非命名捕获，捕获匹配的子字符串，编号为0的第一个捕获是由整个正则表达式模式匹配的文本，其他捕获结果则是根据左括号书顺序从1开始自动编号
        * 2. (?<name>pattern)   命名捕获，将匹配的子字符串捕获到一个组名称或编号名称中，用于name的字符串不能包含任何标点符号，并且不能以数字开头。可以使用单引号代替尖括号，例如(?'name'pattern)
        * 个人感觉下面这种形式比较实用，注意第二种既可以通过组号调用，也可以用编号调用
        * */
        String content="hanshunping s7798 nn1189han";
        //String regStr="(\\d\\d)(\\d\\d)";
        String regStr="(?<g1>\\d\\d)(?<g2>\\d\\d)";//命名分组
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到:"+matcher.group(0));
            System.out.println("第一组(编号):"+matcher.group(1));
            System.out.println("第二组(编号):"+matcher.group(2));
            System.out.println("第一组(组名):"+matcher.group("g1"));
            System.out.println("第二组(组名):"+matcher.group("g2"));
            //妙啊~
        }
        System.out.println("string123".replaceAll("[0-9]+","."));
        String s="A[]B[]C[]D[]E";
        String[] ss=s.split("\\[\\]");
        System.out.println(Arrays.toString(ss));
    }
}
