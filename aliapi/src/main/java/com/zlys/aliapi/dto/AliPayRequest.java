package com.zlys.aliapi.dto;

import com.zlys.aliapi.util.DateTimeUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

/**
 * @author: wq
 * @description: 统一收单下单并支付页面接口
 * @date: Create in 2018/10/21 0021 上午 11:28
 * @modified:
 */
public class AliPayRequest {

    //公共请求参数
    //参数	类型	是否必填	最大长度	描述	示例值
    /**
     * String	是	32	支付宝分配给开发者的应用ID	2014072300007148
     */
    private String app_id;
    /**
     * 	String	是	128	接口名称	alipay.trade.page.pay
     */
    private String method = "alipay.trade.page.pay";
    /**
     *	String	否	40	仅支持JSON	JSON
     */
    private String format = "JSON";
    /**
     *	String	否	256	HTTP/HTTPS开头字符串	https://m.alipay.com/Gk8NF23
     */
    private String return_url;
    /**
     *	String	是	10	请求使用的编码格式，如utf-8,gbk,gb2312等	utf-8
     */
    private String charset = "utf-8";
    /**
     *	String	是	10	商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2	RSA2
     */
    private String sign_type = "RSA2";
    /**
     *	String	是	344	商户请求参数的签名串，详见签名	详见示例
     */
    private String sign;
    /**
     *	String	是	19	发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"	2014-07-24 03:07:50
     */
    private String timestamp;
    {
        try {
            timestamp = DateTimeUtils.getInstance().getYMDHMSDate(new Date());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     *	String	是	3	调用的接口版本，固定为：1.0	1.0
     */
    private String version = "1.0";
    /**
     *	String	否	256	支付宝服务器主动通知商户服务器里指定的页面http/https路径。	http://api.test.alipay.net/atinterface/receive_notify.htm
     */
    private String notify_url;
    /**
     *	String	否	40	详见应用授权概述
     */
    private String app_auth_token;
    /**
     *	String	是		请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     */
    private String biz_content;

    //参数	类型	是否必填	最大长度	描述	示例值

    /**
     *	String	必选	64	商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复	20150320010101001
     */
    private String out_trade_no;
    /**
     *	String	必选	64	销售产品码，与支付宝签约的产品码名称。
     *  注：目前仅支持FAST_INSTANT_TRADE_PAY	FAST_INSTANT_TRADE_PAY
     */
    private String product_code;
    /**
     *	Price	必选	11	订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。	88.88
     */
    private BigDecimal total_amount = BigDecimal.ZERO;
    /**
     *	String	必选	256	订单标题	Iphone6 16G
     */
    private String subject;
    /**
     *	String	可选	128	订单描述	Iphone6 16G
     */
    private String body;
    /**
     *	String	可选	32	绝对超时时间，格式为yyyy-MM-dd HH:mm	2016-12-31 10:05
     */
    private String time_expire;
    /**
     *	String	可选	2	商品主类型 :0-虚拟类商品,1-实物类商品
     *  注：虚拟类商品不支持使用花呗渠道	0
     */
    private String goods_type;
    /**
     *	String	可选	128	可用渠道,用户只能在指定渠道范围内支付，多个渠道以逗号分割
     *  注，与disable_pay_channels互斥
     *  渠道列表：https://docs.open.alipay.com/common/wifww7	pcredit,moneyFund,debitCardExpress
     */
    private String enable_pay_channels;
    /**
     *	String	可选	32	商户门店编号	NJ_001
     */
    private String store_id;
    /**
     *	String	可选	128	禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割
     *  注，与enable_pay_channels互斥
     *  渠道列表：https://docs.open.alipay.com/common/wifww7	pcredit,moneyFund,debitCardExpress
     */
    private String disable_pay_channels;
    /**
     *	String	可选	2	PC扫码支付的方式，支持前置模式和
     *
     *     跳转模式。
     *     前置模式是将二维码前置到商户
     *     的订单确认页的模式。需要商户在
     *     自己的页面中以 iframe 方式请求
     *     支付宝页面。具体分为以下几种：
     *             0：订单码-简约前置模式，对应 iframe 宽度不能小于600px，高度不能小于300px；
     *             1：订单码-前置模式，对应iframe 宽度不能小于 300px，高度不能小于600px；
     *             3：订单码-迷你前置模式，对应 iframe 宽度不能小于 75px，高度不能小于75px；
     *             4：订单码-可定义宽度的嵌入式二维码，商户可根据需要设定二维码的大小。
     *
     *     跳转模式下，用户的扫码界面是由支付宝生成的，不在商户的域名下。
     *             2：订单码-跳转模式
     *             1
     */
    private String qr_pay_mode;
    /**
     *	Number	可选	4	商户自定义二维码宽度
     *     注：qr_pay_mode=4时该参数生效
     */
    private String qrcode_width;

    public String getApp_id() {
        return app_id;
    }

    public AliPayRequest setApp_id(String app_id) {
        this.app_id = app_id;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public AliPayRequest setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AliPayRequest setFormat(String format) {
        this.format = format;
        return this;
    }

    public String getReturn_url() {
        return return_url;
    }

    public AliPayRequest setReturn_url(String return_url) {
        this.return_url = return_url;
        return this;
    }

    public String getCharset() {
        return charset;
    }

    public AliPayRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getSign_type() {
        return sign_type;
    }

    public AliPayRequest setSign_type(String sign_type) {
        this.sign_type = sign_type;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public AliPayRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public AliPayRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public AliPayRequest setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public AliPayRequest setNotify_url(String notify_url) {
        this.notify_url = notify_url;
        return this;
    }

    public String getApp_auth_token() {
        return app_auth_token;
    }

    public AliPayRequest setApp_auth_token(String app_auth_token) {
        this.app_auth_token = app_auth_token;
        return this;
    }

    public String getBiz_content() {
        return biz_content;
    }

    public AliPayRequest setBiz_content(String biz_content) {
        this.biz_content = biz_content;
        return this;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public AliPayRequest setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
        return this;
    }

    public String getProduct_code() {
        return product_code;
    }

    public AliPayRequest setProduct_code(String product_code) {
        this.product_code = product_code;
        return this;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public AliPayRequest setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public AliPayRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getBody() {
        return body;
    }

    public AliPayRequest setBody(String body) {
        this.body = body;
        return this;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public AliPayRequest setTime_expire(String time_expire) {
        this.time_expire = time_expire;
        return this;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public AliPayRequest setGoods_type(String goods_type) {
        this.goods_type = goods_type;
        return this;
    }

    public String getEnable_pay_channels() {
        return enable_pay_channels;
    }

    public AliPayRequest setEnable_pay_channels(String enable_pay_channels) {
        this.enable_pay_channels = enable_pay_channels;
        return this;
    }

    public String getStore_id() {
        return store_id;
    }

    public AliPayRequest setStore_id(String store_id) {
        this.store_id = store_id;
        return this;
    }

    public String getDisable_pay_channels() {
        return disable_pay_channels;
    }

    public AliPayRequest setDisable_pay_channels(String disable_pay_channels) {
        this.disable_pay_channels = disable_pay_channels;
        return this;
    }

    public String getQr_pay_mode() {
        return qr_pay_mode;
    }

    public AliPayRequest setQr_pay_mode(String qr_pay_mode) {
        this.qr_pay_mode = qr_pay_mode;
        return this;
    }

    public String getQrcode_width() {
        return qrcode_width;
    }

    public AliPayRequest setQrcode_width(String qrcode_width) {
        this.qrcode_width = qrcode_width;
        return this;
    }

    @Override
    public String toString() {
        return "AliPayDto{" +
                "app_id='" + app_id + '\'' +
                ", method='" + method + '\'' +
                ", format='" + format + '\'' +
                ", return_url='" + return_url + '\'' +
                ", charset='" + charset + '\'' +
                ", sign_type='" + sign_type + '\'' +
                ", sign='" + sign + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", version='" + version + '\'' +
                ", notify_url='" + notify_url + '\'' +
                ", app_auth_token='" + app_auth_token + '\'' +
                ", biz_content='" + biz_content + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", product_code='" + product_code + '\'' +
                ", total_amount=" + total_amount +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", time_expire='" + time_expire + '\'' +
                ", goods_type='" + goods_type + '\'' +
                ", enable_pay_channels='" + enable_pay_channels + '\'' +
                ", store_id='" + store_id + '\'' +
                ", disable_pay_channels='" + disable_pay_channels + '\'' +
                ", qr_pay_mode='" + qr_pay_mode + '\'' +
                ", qrcode_width='" + qrcode_width + '\'' +
                '}';
    }
}
