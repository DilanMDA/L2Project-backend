package com.grokonez.jwtauthentication.services;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class EmailService {

    public void sendmail(String email) throws AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.debug", "true");
        props.put("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("YOUR_GMAIL@gmail.com", "PASSWORD");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("YOUR_GMAIL@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
        msg.setSubject("SUBJECT");
        msg.setContent("YOUR CONTENT", "text/html");
        msg.setSentDate(new Date());

        Transport.send(msg);
    }
}
