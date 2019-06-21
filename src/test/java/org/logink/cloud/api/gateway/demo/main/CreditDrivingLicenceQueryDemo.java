package org.logink.cloud.api.gateway.demo.main;

import com.alibaba.fastjson.JSON;
import org.logink.cloud.api.gateway.demo.Response;
import org.logink.cloud.api.gateway.demo.util.PostUtil;

/**
 * logink cloud gateway api demo
 * ��ʻ֤��ѯ�ӿ�
 * ��Ҫ��ʾ���£�
 * ������� github path:https://github.com/loginkhub/api-gateway-demo-sign-java-master ����
 * ��Ӧ�����ࣺ /src/test/java/org/logink/cloud/api/gateway/demo/main/CreditDrivingLicenceQueryDemo.java
 */
public class CreditDrivingLicenceQueryDemo {
    public static void main(String[] args) {
        String appkey = "����appkey";
        String appsecret = "����appsecret";
        String url = "https://gateway.logink.org/credit/drivingLicence/logink";
        //�����body,json��ʽ
        String body = "{\"vehicleNumber\":\"*********\","   //�������պ�
                + "\"vehicleClassification\":\"*********\","//��������
                + "\"owner\":\"*********\"}";//����������
        try {
            // PostUtil��װ��header���ú�ǩ������,Ȼ����request����ȡresponse
            Response response = PostUtil.postString(url, body, appkey, appsecret);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
