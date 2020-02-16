package com.heav.photographic.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 验证短信发送功能实体
 * 
 * @author stone
 * @version 1.0.0
 * @date 2019-06-11 11:16:32
 */
 public class SysSmsSend implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 手机号码
    */
    private String phone;

    /**
    * 发送时间
    */
    private Date sendTime;

    /**
    * 发送信息
    */
    private String content;

    /**
    * 响应时间
    */
    private Date respTime;

    /**
    * 响应信息
    */
    private String resp;

    /**
    * 短信类型
    */
    private String smsType;

    /**
    * 验证码
    */
    private String code;

    /**
    * 短信是否被使用 10-已使用 20-未使用
    */
    private String state;

    /**
    * 短信验证次数
    */
    private Integer verifyTime;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public Long getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @param 要设置的主键Id
    */
    public void setId(Long id){
        this.id = id;
    }

    /**
    * 获取手机号码
    *
    * @return 手机号码
    */
    public String getPhone(){
        return phone;
    }

    /**
    * 设置手机号码
    * 
    * @param phone 要设置的手机号码
    */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
    * 获取发送时间
    *
    * @return 发送时间
    */
    public Date getSendTime(){
        return sendTime;
    }

    /**
    * 设置发送时间
    * 
    * @param sendTime 要设置的发送时间
    */
    public void setSendTime(Date sendTime){
        this.sendTime = sendTime;
    }

    /**
    * 获取发送信息
    *
    * @return 发送信息
    */
    public String getContent(){
        return content;
    }

    /**
    * 设置发送信息
    * 
    * @param content 要设置的发送信息
    */
    public void setContent(String content){
        this.content = content;
    }

    /**
    * 获取响应时间
    *
    * @return 响应时间
    */
    public Date getRespTime(){
        return respTime;
    }

    /**
    * 设置响应时间
    * 
    * @param respTime 要设置的响应时间
    */
    public void setRespTime(Date respTime){
        this.respTime = respTime;
    }

    /**
    * 获取响应信息
    *
    * @return 响应信息
    */
    public String getResp(){
        return resp;
    }

    /**
    * 设置响应信息
    * 
    * @param resp 要设置的响应信息
    */
    public void setResp(String resp){
        this.resp = resp;
    }

    /**
    * 获取短信类型
    *
    * @return 短信类型
    */
    public String getSmsType(){
        return smsType;
    }

    /**
    * 设置短信类型
    * 
    * @param smsType 要设置的短信类型
    */
    public void setSmsType(String smsType){
        this.smsType = smsType;
    }

    /**
    * 获取验证码
    *
    * @return 验证码
    */
    public String getCode(){
        return code;
    }

    /**
    * 设置验证码
    * 
    * @param code 要设置的验证码
    */
    public void setCode(String code){
        this.code = code;
    }

    /**
    * 获取短信是否被使用 10-已使用 20-未使用
    *
    * @return 短信是否被使用 10-已使用 20-未使用
    */
    public String getState(){
        return state;
    }

    /**
    * 设置短信是否被使用 10-已使用 20-未使用
    * 
    * @param state 要设置的短信是否被使用 10-已使用 20-未使用
    */
    public void setState(String state){
        this.state = state;
    }

    /**
    * 获取短信验证次数
    *
    * @return 短信验证次数
    */
    public Integer getVerifyTime(){
        return verifyTime;
    }

    /**
    * 设置短信验证次数
    * 
    * @param verifyTime 要设置的短信验证次数
    */
    public void setVerifyTime(Integer verifyTime){
        this.verifyTime = verifyTime;
    }

}