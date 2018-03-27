package com.imooc.mail;

public class TestMail {

	public static void main(String[] args) {
		  //这个类主要是设置邮件   
	      MailSenderInfo mailInfo = new MailSenderInfo();    
	      mailInfo.setMailServerHost("smtp.163.com");    
	      mailInfo.setMailServerPort("25");    
	      mailInfo.setValidate(true);    
	      mailInfo.setUserName("yp15101599@163.com");
	      mailInfo.setPassword("djf_520yp0514");//您的邮箱密码
	      mailInfo.setFromAddress("yp15101599@163.com");

	      mailInfo.setToAddress("1248068987@qq.com");
	      mailInfo.setSubject("邮件测试22222xml");
	      mailInfo.setContent("这是邮件测试22222。。。。。。。xml");
	         //这个类主要来发送邮件
	      SimpleMailSender sms = new SimpleMailSender();
	         // sms.sendTextMail(mailInfo);//发送文体格式
				sms.sendHtmlMail(mailInfo);//发送html格式

	}
}
