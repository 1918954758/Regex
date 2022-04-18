package c1;

import java.util.regex.Pattern;

public class RegExp10 {
    public static void main(String[] args) {
        //基本会使用到的东西都已经学完了，接下来是一下案例实践相关的东西
        //案例:模式验证
        //1.汉字
        //2.邮政编码:要求是1-9开头的一个六位数
        //3.QQ号码:要求是1-9开头的一个(5-10)位数
        //4.手机号码:必须是13、14、15、18开头的11位数
        String[] content={"吴文韬","102629","1270414897","18858968426"};
        String[] regStr={"^[\u0391-\uffe5]+$","^[1-9]\\d{5}$","^[1-9]\\d{4,9}$","^(?:18|14|15|13)\\d{9}$"};
        //使用定位符限定范围(验证全都是....需要用到)
        //汉字编码范围\u0391-\uffe5
        for(int i=0;i<content.length;i++){
            var pattern= Pattern.compile(regStr[i]);
            var matcher=pattern.matcher(content[i]);
            System.out.println("验证"+(matcher.find()?"成功":"失败"));
        }
    }
}
