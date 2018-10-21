package com.zlys.aliapi.dto;

/**
 * @author: Administrator
 * @description: 统一收单下单并支付页面接口
 * @date: Create in 2018/10/21 0021 上午 11:28
 * @modified:
 */
public class AliPayDto {

    //公共请求参数
    //参数	类型	是否必填	最大长度	描述	示例值
    private String app_id;	String	是	32	支付宝分配给开发者的应用ID	2014072300007148
    private String method;	String	是	128	接口名称	alipay.trade.page.pay
    private String format;	String	否	40	仅支持JSON	JSON
    private String return_url;	String	否	256	HTTP/HTTPS开头字符串	https://m.alipay.com/Gk8NF23
    private String charset;	String	是	10	请求使用的编码格式，如utf-8,gbk,gb2312等	utf-8
    private String sign_type;	String	是	10	商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2	RSA2
    private String sign;	String	是	344	商户请求参数的签名串，详见签名	详见示例
    private String timestamp;	String	是	19	发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"	2014-07-24 03:07:50
    private String version;	String	是	3	调用的接口版本，固定为：1.0	1.0
    private String notify_url;	String	否	256	支付宝服务器主动通知商户服务器里指定的页面http/https路径。	http://api.test.alipay.net/atinterface/receive_notify.htm
    private String app_auth_token;	String	否	40	详见应用授权概述
    private String biz_content;	String	是		请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档

}
