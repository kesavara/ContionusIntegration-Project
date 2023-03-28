package steps;

import com.aspose.email.MailAddress;
import com.aspose.email.MailMessage;
import com.aspose.email.SmtpClient;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class test {
//    public static void main(String[]arg){
//        sendMail();
//    }
    public static void sendMail() {
        try {
            String to = "hackathontest1@outlook.com";
            String from = "hackathontest1@outlook.com";

            Properties props = new Properties();
//            props.put("mail.smtp.socketFactory.port", "587");
//            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//            props.put("mail.smtp.socketFactory.fallback", "true");
            props.put("mail.smtp.host", "smtp-mail.outlook.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("hackathontest1@outlook.com", "amazon@1234");
                        }
                    });

//            Session emailSession = Session.getDefaultInstance(props, null);

            String msgBody = "UI Automation resilience report ";

            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, "NoReply"));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to, "UI Automation script identifiers verification report "));
            msg.setSubject("UI Automation resilience report ");
            msg.setText(msgBody);
//new attachment
            BodyPart messageBodyPart = new MimeBodyPart();
            // Now set the actual message
            messageBodyPart.setText("Please find the attachment below");

            Multipart multipart = new MimeMultipart();
            // Set text message part
            multipart.addBodyPart(messageBodyPart);
            // Part two is attachment
            messageBodyPart = new MimeBodyPart();

            //file
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            Date curDate = new Date();
            String strDate = sdf.format(curDate);
            String filename = System.getProperty("user.dir")+"/target/Extent_Reports/" + strDate+".html";
            //
           // String filename = "/Users/kragi/Documents/office/AWS/hackathon22/hackathon-23/ContionusIntegration-Project/target/positive/cucumber.html/index.html";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            // Send the complete message parts
            msg.setContent(multipart);
            Transport.send(msg);
            System.out.println("Email sent successfully...");
            System.out.println("Email sent successfully...");
        } catch (AddressException e) {
            System.out.println(e.getMessage());
        } catch (MessagingException e) {
            System.out.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }
    }
}
