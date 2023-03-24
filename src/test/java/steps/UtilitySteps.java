//package steps;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Then;
//
//import javax.activation.DataHandler;
//import javax.mail.*;
//import java.util.Properties;
//
//public class UtilitySteps {
//    @Then("^user enter the verification code received in the users mailbox \"([^\"]*)\" and click on verify$")
//    public void userEnterTheVerificationCodeReceivedInTheUsersMailboxAndClickOnVerify(String arg0) throws Throwable {
//        String mailFolderName ="INBOX";
//        String emailSubjectContent ="AWS Email Verification";
//        String emailContent="Verification code";
//        int lengthOfOTP=6;
//
////mailFolderName(Eg- "INBOX"), emailSubjectContent(Eg- Mail for OTP),
////        emailContent(Eg- OTP is 111111), OTP length(Eg- 6)
//        String hostName = "outlook.office365.com";//"smtp.office365.com";//change it according to your mail
//
//        String username = "hackathontest1@outlook.com";//username
//
//        String password = "amazon@123";
//
//        int messageCount;
//
//        int unreadMsgCount;
//
//        String emailSubject;
//
//        Message emailMessage;
//
//        String searchText=null ;
//        int readOTP = 0;
//
//        Properties sysProps = System.getProperties();
//
//        sysProps.setProperty("mail.store.protocol", "imaps");
//
//        try {
//
//            Session session = Session.getInstance(sysProps, null);
//
//            Store store = session.getStore();
//
//            store.connect(hostName, username, password);
//
//            Folder emailBox = store.getFolder(mailFolderName);
//
//            emailBox.open(Folder.READ_WRITE);
////
//            Message[] msg = emailBox.getMessages();
//
//            //
//            messageCount = emailBox.getMessageCount();
//
//            System.out.println("Total Message Count: " + messageCount);
//
//            unreadMsgCount = emailBox.getNewMessageCount();
//
//            System.out.println("Unread Emails count:" + unreadMsgCount);
//
//            for(int i=messageCount; i>(messageCount-unreadMsgCount); i--){
//                //
//
//                //for (int i = 0; i < msg.length; i++) {
//                System.out.println("------------ Message " + (i + 1) + " ------------");
////                String from = InternetAddress.toString(msg[i].getFrom());
////                if (from != null) {
////                    System.out.println("From: " + from);
////                }
//
//                Multipart multipart = (Multipart) msg[i-1].getContent();
//
//                for (int x = 0; x < multipart.getCount(); x++) {
//                    BodyPart bodyPart = multipart.getBodyPart(x);
//
//                    String disposition = bodyPart.getDisposition();
//
//                    if (disposition != null && (disposition.equals(BodyPart.ATTACHMENT))) {
//                        System.out.println("Mail have some attachment : ");
//
//                        DataHandler handler = bodyPart.getDataHandler();
//                        System.out.println("file name : " + handler.getName());
//                    } else {
//                        readOTP = Integer.parseInt(bodyPart.getContent().toString().split(System.lineSeparator())[9].trim());
//                        System.out.println("____***********_____OTP IS __******"+readOTP);
//                        System.out.println("***********get content is ********"+bodyPart.getContent());
//                    }
//
//////
////            messageCount = emailBox.getMessageCount();
////
////            System.out.println("Total Message Count: " + messageCount);
////
////            unreadMsgCount = emailBox.getNewMessageCount();
////
////            System.out.println("Unread Emails count:" + unreadMsgCount);
////
////            for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)
////
////            {
////
////                emailMessage = emailBox.getMessage(i);
////
////                emailSubject = emailMessage.getSubject();
////                //commenting n trying in 195
////               // System.out.println("Email Subject is :"+emailMessage.getContent());
////                System.out.println("Email Subject is :"+emailMessage.getDescription());
////
////                if(emailSubject.contains(emailSubjectContent))
////
////                {
////
////                    System.out.println("OTP mail found");
////
////                    String line;
////
////                    StringBuffer buffer = new StringBuffer();
////
//////                    BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));
////                    BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));
////
////                    while ((line = reader.readLine()) != null) {
////
////                        buffer.append(line);
////
////                    }
////
////                    String messageContent=emailContent;
////
////                    String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));
////
////                    searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);
////
////                    System.out.println("Text found : "+ searchText);
////
////                    emailMessage.setFlag(Flags.Flag.SEEN, true);
////
////                    break;
////
////                }
////
////                emailMessage.setFlag(Flags.Flag.SEEN, true);
////
////            }true
//
//                    emailBox.close(true);
//
//                    store.close();
//
//
//                }
//            }
//        }catch (Exception mex) {
//
//            mex.printStackTrace();
//
//            System.out.println("OTP Not found ");
//
//        }
//
//        return readOTP;
//
//
//
//    }
//}
