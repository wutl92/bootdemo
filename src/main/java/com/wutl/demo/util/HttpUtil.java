package com.wutl.demo.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.MediaType;

import java.io.Closeable;
import java.util.Map;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: http请求工具类
 *
 * @date 2021-3-8 14:03
 */
public class HttpUtil {

    public static String doPost(String url, Map<String, Object> head, String body) {
        // 定义httpClient和response
        String responseContent = null;
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();;
        CloseableHttpResponse response = null;
        try {
            // 创建默认的httpClient实例
            httpClient = HttpClients.createDefault();
            // 定义Post请求
            HttpPost httpPost = new HttpPost(url);
            // 设置配置
            RequestConfig.Builder builder = createBuilder();
            RequestConfig config = builder.build();
            httpPost.setConfig(config);
            // 设置请求头
            httpPost.setHeader("Accept", MediaType.APPLICATION_JSON_VALUE);
            httpPost.setHeader("Wutl","wutl20210308");
            //根据请求头来设置是Body内容，还是表单形式。 APPLICATION_JSON_UTF8_VALUE：body是json或者txt格式
            httpPost.setHeader("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
            // 发送请求得到返回数据
            httpPost.setEntity(new StringEntity(body, "UTF-8"));
            response = httpClient.execute(httpPost);
            // 状态码
            // 响应内容
            HttpEntity entity = response.getEntity();
            // 响应内容
            responseContent = EntityUtils.toString(entity);
        } catch (Exception e) {
        } finally {
            // 关闭流
            closeStream(response);
            closeStream(httpClient);
        }
        return responseContent;
    }

    /**
     *
     * 功能描述: <br>
     * 创建默认Builder
     *
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    private static RequestConfig.Builder createBuilder() {
        // init Builder and init TIME_OUT
        return RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000)
                .setConnectionRequestTimeout(5000);
    }


    public static void closeStream(Closeable c) {
        // 流不为空
        if (c != null) {
            try {
                // 流关闭
                c.close();
            } catch (Exception ex) {
                System.out.println("closeStream failed");
            }
        }
    }
}
