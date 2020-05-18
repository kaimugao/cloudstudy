package com.atguigu.springcloud.common.exception;

/**
 * @auther: lanxin
 * @date： 2020-05-13 21:38
 * @description：
 * 维护错误码后需要维护错误描述，将t他们定义为枚举形式
 * 错误码列表:
 *  10: 通用
 *      001: 参数格式校验
 *  11:商品
 *  12:订单
 *  13:购物车
 *  14:物流
 *  15:支付
 **/
public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数格式校验失败");

    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}









