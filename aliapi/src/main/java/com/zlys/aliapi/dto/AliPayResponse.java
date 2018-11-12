package com.zlys.aliapi.dto;

/**
 * @author: Administrator
 * @description:
 * @date: 2018/11/12 0012 15:21
 * @modified:
 */
public class AliPayResponse {

    //参数	类型	是否必填	最大长度	描述	示例值
    /**
     * 	String	是	-	网关返回码,详见文档	40004
     */
    private String code;
    /**
     * 	String	是	-	网关返回码描述,详见文档	Business Failed
     */
    private String msg;
    /**
     *	String	否	-	业务返回码，参见具体的API接口文档	ACQ.TRADE_HAS_SUCCESS
     */
    private String sub_code;
    /**
     *	String	否	-	业务返回码描述，参见具体的API接口文档	交易已被支付
     */
    private String sub_msg;
    /**
     *	String	是	-	签名,详见文档
     */
    private String sign;

    //参数	类型	是否必填	最大长度	描述	示例值
    /**
     *	String	必填	64	支付宝交易号	2013112011001004330000121536
     */
    private String trade_no;
    /**
     *	String	必填	64	商户订单号	6823789339978248
     */
    private String out_trade_no;
    /**
     * String	必填	16	收款支付宝账号对应的支付宝唯一用户号。
     * 以2088开头的纯16位数字	2088111111116894
     */
    private String seller_id;
    /**
     *	Price	必填	11	交易金额	128.00
     */
    private String total_amount;
}
