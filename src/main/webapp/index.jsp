<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.leo.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微信支付</title>
</head>
<body>

<li>
<span>
<%
String rediecturi = java.net.URLEncoder.encode(WechatInfo.REDIRECTURIOLD, "utf-8");
String url = WechatInfo.WECHATQRCONNECT + "?appid=" + WechatInfo.APPID
             + "&redirect_uri=" + rediecturi
             + "&response_type=code&scope=snsapi_login" 
             + "&state=" + WechatInfo.STATE
             + "#wechat_redirect";
%>
<a href=<%=url%> > 微信登陆</a>


<!--  a href="https://open.weixin.qq.com/connect/qrconnect?appid=wxd5766a6d882dab7e&redirect_uri=https%3A%2F%2Fmaidehao.com%2Fwechatcallback&response_type=code&scope=snsapi_login&state=3d6be0a4035d839573b04816624a415e#wechat_redirect"> 微信登陆</a -->
</span>
</li>

<li>
<span>
leo test
REDIECTURI IS: <%=rediecturi%>
</span>
</li>

<li>
<span>
<%=url%>
</span>
</li>

</body>
</html>