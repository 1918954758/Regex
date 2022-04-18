package c1;

import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {
        //正则表达式验证URL(爬虫中非常常用)
        String[] content={"https://www.bilibili.com/",
                "https://www.bilibili.com/video/BV1QS4y1G7KU?spm_id_from=333.851.b_7265636f6d6d656e64.1",
                "https://www.bilibili.com/video/BV1sJ411a7dG/?spm_id_from=333.788.recommend_more_video.2",
                "https://www.bilibili.com/video/BV16m4y1R7Q2?spm_id_from=333.851.b_62696c695f7265706f72745f646f756761.12",
                "https://www.bilibili.com/video/BV1nL411N7FV?spm_id_from=333.851.b_62696c695f7265706f72745f646f756761.42"};
        String regStr="^(http)s?://www.bilibili.com/[\\w=?./&%-]*$";//[]中的内容是不需要转移的
        //String regStr="^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\w-?=&%.#)?$"//这是一个老师写的一个比较通用的写法
        var pattern= Pattern.compile(regStr);
        for(var url:content){
            var matcher=pattern.matcher(url);
            System.out.println("匹配"+(matcher.find()?"成功":"失败"));
        }

    }
}
