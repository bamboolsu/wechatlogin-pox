package com.leo.entity;

/**
 * @ClassName: wechatinfo
 * @Description: wechat 相关
 * @author: leo
 * @date: 2016年4月1日 下午1:53:30
 */
public class WechatInfo {
	public static Integer ISUSING = 0;
	
	public static final String WECHATQRCONNECT = "https://open.weixin.qq.com/connect/qrconnect";
	public static final String APPID = "wxd5766a6d882dab7e";
	//"http%3A%2F%2Fmaidehao.com%3A8080%2FwechatCallback"
	public static final String REDIRECTURIOLD = "http://wxdev.maidehao.com/wechatlogin-pox/wechatCallback";
	public static final String REDIRECTURI = "http%3A%2F%2Fwxdev.maidehao.com%2Fwechatlogin-pox%2FwechatCallback";

	public static final String STATE = "3d6be0a4035d839573b04816624a4leo";
	
	public static final String ACCESSTOKENURI = "https://api.weixin.qq.com/sns/oauth2/access_token";
	public static final String ACCESSTOKENREFRESHURI = "https://api.weixin.qq.com/sns/oauth2/refresh_token";
	public static final String SECRET = "5eef2ada77d6fff8c869a78653a5e943";
	public static String ACCESSCODE = "";
	//https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	
	
	public static String ACCESSTOKEN = "";
	public static String OPENID = "";
	public static String UNIONID = "";
	public static String SCOPE = "";
	public static String REFRESHTOKEN = "";
	public static Integer EXPIRES = 0;
	
	
	//userinfo
	/* { 
"openid":"OPENID",
"nickname":"NICKNAME",
"sex":1,
"province":"PROVINCE",
"city":"CITY",
"country":"COUNTRY",
"headimgurl": "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0",
"privilege":[
"PRIVILEGE1", 
"PRIVILEGE2"
],
"unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"

} */
	public static String nickname = "";
	public static Integer sex = 0;
	public static String province = "";
	public static String city = "";
	public static String country = "";
	public static String headimgurl = "";
	public static String privilege1 = "";
	public static String privilege2 = "";	
	
}
