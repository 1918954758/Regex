package c3;

import java.util.regex.Pattern;

public class RegExpReverse1 {
    public static void main(String[] args) {
        /*
        * 1.要匹配两个连续的相同数字
        * 2.要匹配五个连续的相同数字
        * 3.要匹配4位回文序列
        * 5.5位数-九位数(连续三位要相同)
        * */
        String content="1238418723426478377271231423-111222333777324723173432231-566538471278879710-000999222993993-3332321-12331331";
        String[] regStr={"(\\d)\\1","(\\d)\\1{4}","(\\d)(\\d)\\2\\1","\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}"};
        for(String i:regStr){
            var pattern=Pattern.compile(i);
            var matcher=pattern.matcher(content);
            while(matcher.find()){
                System.out.println("匹配到:"+matcher.group(0));
            }
        }
    }
}
