package c1;

import java.util.regex.Pattern;

public class RegExp6 {
    public static void main(String[] args) {
        //元字符-定位符
        //定位符:规定匹配的字符串出现的位置，比如是在字符串的开始还是在结束的位置
        /*
        * 1. ^      指定起始字符          ^[0-9]+[a-z]        以至少1个数字开头，后接人一个小写字母的字符串
        * 2. $      指定结束字符          ^[0-9]\\-[a-z]+$    以1个数字开头，后接-，再以至少一个小写字母结尾的字符串
        * 3. \\b    匹配目标字符串的边界   han\\b              (首位边界不会匹配)这里说的字符串的边界是值的字串之间有空格，或者是目标字符串的结束位置
        * 4. \\B    匹配目标字符串的非边界 han\\B             和上面的正好相反
        * 5. 
        * */
        //下面演示定位符的使用
//        String content="a123abc12";
//        String regStr="^[a-z]*[0-9]+$";
        String content="wwt123 12wwt44  241wwt";
        String regStr="wwt\\B";
        var pattern= Pattern.compile(regStr);
        var matcher=pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到:"+matcher.group(0));
        }
    }
}
