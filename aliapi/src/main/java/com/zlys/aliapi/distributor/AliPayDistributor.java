package com.zlys.aliapi.distributor;

import com.zlys.aliapi.dto.AliPayRequest;
import com.zlys.aliapi.dto.AliPayResponse;
import com.zlys.aliapi.util.ParamsValidator;
import com.zlys.aliapi.util.exception.CustomException;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.function.Consumer;

/**
 * @author: Administrator
 * @description:
 * @date: 2018/11/12 0012 15:51
 * @modified:
 */
public class AliPayDistributor extends AliApiDistributor{


    private AliPayDistributor(){}

    public static AliPayResponse aliPay(AliPayRequest aliPayRequest, Consumer<String> failed){
        try {
            ParamsValidator.getInstance().getValidator(aliPayRequest);

        }catch (CustomException ce){

        }catch (Exception e){
            failed.accept("请求阿里支付接口异常");
            logger.error("请求阿里支付接口异常:{}",ExceptionUtils.getStackTrace(e));
        }
    }
}
