package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * logink cloud gateway api demo
 * 人员查询接口
 * 重要提示如下：
 * 代码请从 github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master 下载
 * 对应测试类： /src/test/java/org/logink/cloud/api/gateway/demo/main/CreditPersonQueryDemo.java
 */
public class CreditPersonQueryDemo {
    public static void main(String[] args) {
        String appkey = "您的appkey";
        String appsecret = "您的appsecret";
        String url = "https://gateway.logink.org/credit/personQuery/logink";
        //请求的body,json格式
        String body = "{\"nameOfPerson\":\"******\","   //姓名
                + "\"identityDocumentNumber\":\"******\","//身份证号码
                + "\"qualificationCertificateNumber\":\"******\","//从业资格证号
                + "\"provinceCode\":\"******\"}";//省份行政区划代码
        try {
            // PostUtil封装了header设置和签名计算,然后发送request并获取response
            Response response = PostUtil.postString(url, body, appkey, appsecret);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}