package com.Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.Ecommerce.Entity.User;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailSenderService {
	
	
	@Autowired
	JavaMailSender  sender;
	
	
	public String sendMessage(User user) throws MessagingException
	{
		
	//	SimpleMailMessage message=new SimpleMailMessage();
		
		
		
		System.out.println("sending mail");
		MimeMessage mime=sender.createMimeMessage();
		
		
		MimeMessageHelper helper=new MimeMessageHelper(mime,true, "UTF-8");
		
		
		String htmlCard = """
			    <div style="font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;">
			        <div style="max-width: 400px; margin: auto; background: white; border-radius: 10px; border: 1px solid #ddd; overflow: hidden;">
			            <div style="background: #007bff; color: white; padding: 15px; text-align: center;">
			                <h2 style="margin: 0;">Status Update</h2>
			            </div>
			            <div style="padding: 20px; color: #333; line-height: 1.5;">
			                <p>Hello,user_name</p>
			                <p>Your request has been processed successfully. You can view the details by clicking the button below.</p>
			                <div style="text-align: center; margin-top: 20px;">
			                    <a href="https://yourwebsite.com" style="background: #007bff; color: white; padding: 10px 20px; text-decoration: none; border-radius: 5px; font-weight: bold;">Check Status</a>
			                </div>
			            </div>
			            <div style="background: #eee; padding: 10px; text-align: center; font-size: 12px; color: #777;">
			                Sent via JavaMailSender
			            </div>
			        </div>
			    </div>
			    """;
		String html2=htmlCard.replace("user_name", user.getName());
		
	helper.setTo(user.getEmail());
		helper.setFrom("maheshgavale.uss@gmail.com");
		helper.setText(html2, true);
		helper.setSubject("demo");
		sender.send(mime);
		
		
//		message.setTo(useremail);
//		message.setFrom("maheshgavale.uss@gmail.com");
//		message.setSubject("Placement Update");
//		message.setText("Hi, Please find attached !");
//		
//		System.out.println("Sending the mail to:"+useremail);
//		sender.send(message);
//		
		System.out.println("mail sent");
		return "mail sent:";
	}

}
