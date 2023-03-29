package steps;

import java.io.IOException;
import java.util.*;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.twilio.rest.verify.v2.service.VerificationCheck;
import cucumber.api.DataTable;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;


import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.http.client.utils.URIBuilder;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.actions.BillingInformationPageActions;
import utils.SeleniumDriver;

import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Ref;
import java.util.Date;
import java.util.Properties;
import java.util.stream.Stream;

public class BillInfoPageSteps {
    String username = "hackathontest1@outlook.com";//username

    String password = "amazon@1234";
    public String getOtp ="";
    public String ACCOUNT_SID = "ACc33a8620818a8384c8d0591c88ec60dd";
    public String AUTH_TOKEN = "f426b7690057b06daeea9a28d3388bed";

    BillingInformationPageActions billingInformationPageActions = new BillingInformationPageActions();
    @Then("^user enter the credit or debit card number in the billing information page \"([^\"]*)\"$")
    public void userEnterTheCreditOrDebitCardNumberInTheBillingInformationPage(String number) throws Throwable {
        billingInformationPageActions.enterCreditCardNumber(number);
    }

    @And("^user enter the expiration month and year of the card added \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnterTheExpirationMonthAndYearOfTheCardAdded(String month, String year) throws Throwable {
       billingInformationPageActions.clickMonthDropdown();
       billingInformationPageActions.selectMonth(month);
        billingInformationPageActions.clickYearDropdown();
        billingInformationPageActions.selectYear(year);

    }

    @And("^user enter the cardholder name \"([^\"]*)\"$")
    public void userEnterTheCardholderName(String name) throws Throwable {
       billingInformationPageActions.enterCardHolderName(name);
    }

    @And("^user enter the CVV \"([^\"]*)\"$")
    public void userEnterTheCVV(String number) throws Throwable {
      billingInformationPageActions.enterCVVNumber(number);
    }

    @And("^user select no to pan$")
    public void userSelectNoToPan() throws InterruptedException {
        billingInformationPageActions.selectNoToPan();
    }

    @Then("^user click on continue in the billing page$")
    public void userClickOnContinueInTheBillingPage() throws InterruptedException {
        billingInformationPageActions.clickContinueOnBillingPage();
        Thread.sleep(20000);
    }

    @And("^user submit for verification$")
    public void userSubmitForVerification() throws InterruptedException {
        billingInformationPageActions.clickSubmit();
        Thread.sleep(10000);
    }

    @And("^user does confirmation by selecting the expiry month and year \"([^\"]*)\" \"([^\"]*)\"$")
    public void userDoesConfirmationBySelectingTheExpiryMonthAndYear(String month, String year) throws Throwable {
        billingInformationPageActions.selectExpiryMonth(month);
        billingInformationPageActions.selectExpiryYear(year);
    }


    @Then("^user enter the pin number \"([^\"]*)\"$")
    public void userEnterThePinNumber(String number) throws Throwable {
       billingInformationPageActions.enterAtmPin(number);
    }


    @Then("^Update the created account in the project test data management sheet$")
    public void updateTheCreatedAccountInTheProjectTestDataManagementSheet() throws IOException, InvalidFormatException {
                // Creating file object of existing excel file
                File xlsxFile = new File("/Users/kragi/Documents/pers/learn/my-project/Selenium/EndToEndTestig_WeatherReportComparison-master/src/test/resources/ProjectTestData.xlsx");

                //New students records to update in excel file
                Object[][] newStudents = {
                        {"usa", "passi", "rakesh.sharma@gmail.com", 22},
                        {"Thomas Hardy", "London", "thomas.hardy@gmail.com", 25}
                };

                try {
                    //Creating input stream
                    FileInputStream inputStream = new FileInputStream(xlsxFile);

                    //Creating workbook from input stream
                    Workbook workbook = WorkbookFactory.create(inputStream);

                    //Reading first sheet of excel file
                    Sheet sheet = workbook.getSheetAt(0);

                    //Getting the count of existing records
                    int rowCount = sheet.getLastRowNum();

                    //Iterating new students to update
                    for (Object[] student : newStudents) {

                        //Creating new row from the next row count
                        Row row = sheet.createRow(++rowCount);

                        int columnCount = 0;

                        //Iterating student informations
                        for (Object info : student) {

                            //Creating new cell and setting the value
                            Cell cell = row.createCell(columnCount++);
                            if (info instanceof String) {
                                cell.setCellValue((String) info);
                            } else if (info instanceof Integer) {
                                cell.setCellValue((Integer) info);
                            }
                        }
                    }
                    //Close input stream
                    inputStream.close();

                    //Crating output stream and writing the updated workbook
                    FileOutputStream os = new FileOutputStream(xlsxFile);
                    workbook.write(os);

                    //Close the workbook and output stream
                    workbook.close();
                    os.close();

                    System.out.println("Excel file has been updated successfully.");

                } catch (EncryptedDocumentException | IOException e) {
                    System.err.println("Exception while updating an existing excel file.");
                    e.printStackTrace();
                }
            }

    @Then("^user receives a email notification$")
    public void userReceivesAEmailNotification() throws MessagingException {
//        String mailFolderName =folderName;
        String emailSubjectContent ="AWS Email Verification";
        String emailContent="Verification code";
        int lengthOfOTP=6;

//mailFolderName(Eg- "INBOX"), emailSubjectContent(Eg- Mail for OTP),
//        emailContent(Eg- OTP is 111111), OTP length(Eg- 6)
        String hostName = "outlook.office365.com";//"smtp.office365.com";//change it according to your mail

        String username = "hackathontest1@outlook.com";//username

        String password = "amazon@123";

        int messageCount;

        int unreadMsgCount;

        String emailSubject;

        Message emailMessage;

        String searchText=null ;
        String readOTP = "";

        Properties sysProps = System.getProperties();

        sysProps.setProperty("mail.store.protocol", "imaps");

        Session session = Session.getInstance(sysProps, null);
        Store store = session.getStore();
        store.connect(hostName, username, password);
        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(username));
        InternetAddress[] toAddresses = { new InternetAddress(username) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject("Account Creation Completed");
        msg.setSentDate(new Date());

        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent("Test data sheet with account informations are updated", "text/html");

        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // adds attachments
        String[] attachFiles = new String[1];
        attachFiles[0] = "/Users/kragi/Documents/pers/learn/my-project/Selenium/AutomaticAccountsCreation/src/test/resources/ProjectTestData.xlsx";
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();

                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                multipart.addBodyPart(attachPart);
            }
        }

        // sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // sends the e-mail
        Transport.send(msg);

    }
    public Properties mailProperties() {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
//        props.setProperty("mail.transport.protocol", "smtp");

        props.setProperty("mail.smtp.host", "outlook.office365.com");
        props.setProperty("mail.smtp.port", "143");
        props.setProperty("mail.smtp.user", "hackathontest1@outlook.com");
        props.setProperty("mail.smtp.password", "amazon@1234");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.auth", "true");

        return props;
    }

    public String sendMail(String from, String to, String subject, String msgBody) {
        Properties props = mailProperties();
        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        "hackathontest1@outlook.com", "amazon@1234");// Specify the Username and the PassWord
            }
        });

        mailSession.setDebug(false);

        try {
            Transport transport = mailSession.getTransport();

            MimeMessage message = new MimeMessage(mailSession);
            message.setSubject(subject);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, to);

            MimeMultipart multipart = new MimeMultipart();

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            String filename = "/home/circleci/project/target/positive/cucumber.html/index.html";

            messageBodyPart.setContent(msgBody, "filename");

            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);

            transport.connect();
            transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transport.close();
            return "SUCCESS";
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
            return "INVALID_EMAIL";
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "ERROR";
    }


    @Then("^Email notification is sent with the test result attached to the mailbox$")
    public void email_notification_is_sent_with_the_test_result_attached_to_the_mailbox() throws Throwable {
        test.sendMail();
    }


    @Then("^user enter the verification code received in the users mailbox \"([^\"]*)\" and click on verify$")
    public void userEnterTheVerificationCodeReceivedInTheUsersMailboxAndClickOnVerify(String folderName) {
    test.sendMail();
        ////        sendMail(username, username, "mailtest", "msgBody");
//
//
//
//
//        //String mailFolderName1, String emailSubjectContent1, String emailContent1, int lengthOfOTP1
//        String mailFolderName = folderName;
//        String emailSubjectContent = "AWS Email Verification";
//        String emailContent = "Verification code";
//        int lengthOfOTP = 6;
//
////mailFolderName(Eg- "INBOX"), emailSubjectContent(Eg- Mail for OTP),
////        emailContent(Eg- OTP is 111111), OTP length(Eg- 6)
//        String hostName = "outlook.office365.com";//"smtp.office365.com";//change it according to your mail
//
//        String username = "hackathontest1@outlook.com";//username
//
//        String password = "amazon@1234";
//
//        int messageCount;
//
//        int unreadMsgCount;
//
//        String emailSubject;
//
//        Message emailMessage;
//
//        String searchText = null;
//        String readOTP = "";
//
////        Properties sysProps = System.getProperties();
////
////        sysProps.setProperty("mail.store.protocol", "imaps");
//
//
//        Properties props = new Properties();
//        props.put("mail.store.protocol", "imaps");
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", hostName);
////        props.put("mail.smtp.port", 25);
//        props.put("mail.smtp.password",password);
//        props.put("mail.smtp.ssl.trust", "smtp.office365.com");
//        props.setProperty("mail.smtp.user", username);
//
//
//        try {
//
//            Session session = Session.getInstance(props, null);
//
//            Store store = session.getStore();
//
//            store.connect(hostName, username, password);
//
//            try {
//                // Create a default MimeMessage object.
//                Message message = new MimeMessage(session);
//                // Set From: header field of the header.
//                message.setFrom(new InternetAddress(username));
//                // Set To: header field of the header.
//                message.setRecipients(Message.RecipientType.TO,
//                        InternetAddress.parse(username));
//                // Set Subject: header field
//                message.setSubject("Attachment");
//                // Create the message part
//                BodyPart messageBodyPart = new MimeBodyPart();
//                // Now set the actual message
//                messageBodyPart.setText("Please find the attachment below");
//
//
//                // Create a multipar message
//                Multipart multipart = new MimeMultipart();
//                // Set text message part
//                multipart.addBodyPart(messageBodyPart);
//                // Part two is attachment
//                messageBodyPart = new MimeBodyPart();
//                String filename = "/Users/kragi/Documents/office/AWS/hackathon22/hackathon-23/ContionusIntegration-Project/target/positive/cucumber.html/index.html";
//                DataSource source = new FileDataSource(filename);
//                messageBodyPart.setDataHandler(new DataHandler(source));
//                messageBodyPart.setFileName(filename);
//                multipart.addBodyPart(messageBodyPart);
//                // Send the complete message parts
//                message.setContent(multipart);
//                // Send message
//                Transport.send(message);
//                System.out.println("Email Sent Successfully !!");
//            } catch (MessagingException e) {
//                throw new RuntimeException(e);
//            }
//
//
//            Folder emailBox = store.getFolder(mailFolderName);
//
//            emailBox.open(Folder.READ_WRITE);
////
//            javax.mail.Message[] msg = emailBox.getMessages();
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
//            //
//
//            //for (int i = 0; i < msg.length; i++) {
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
//                        readOTP = bodyPart.getContent().toString().split(System.lineSeparator())[5].substring(0,6);
//                        System.out.println("____***********_____OTP IS __******"+readOTP);
//                        System.out.println("***********get content is ********"+bodyPart.getContent());
//                        getOtp = readOTP;
//                        billingInformationPageActions.enterVerificationCode(getOtp);
//                        billingInformationPageActions.clickOnVerify();
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
//        } catch (NoSuchProviderException e) {
//            throw new RuntimeException(e);
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
    }



    @And("^user select the existing address$")
    public void userSelectTheExistingAddress() throws InterruptedException {
        Thread.sleep(3000);
        billingInformationPageActions.selectExistingAddress();
    }
    /**
     * The method getVerificationCode.
     *
     * @return String. verification code.
     * @throws URISyntaxException the uri syntax exception
     * @throws IOException        the io exception
     */
//    @And("^user enter the OTP$")
//    public void userEnterTheOTP() throws URISyntaxException, IOException {
//        // get the OTP using Twilio APIs:
//        String ACCOUNT_SID = "ACc33a8620818a8384c8d0591c88ec60dd";
//        String AUTH_TOKEN = "f426b7690057b06daeea9a28d3388bed";
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        VerificationCheck verificationCheck = VerificationCheck.creator(
//                        "VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
//                        "123456")
//                .setTo("+15017122661").create();
//
//        System.out.println(verificationCheck.getStatus());
//
//
//        String smsBody = getMessage();
//        System.out.println("Message"+ smsBody);
//        String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
//        System.out.println(OTPNumber);
//
//        SeleniumDriver.getDriver().findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);


//            final URIBuilder uri = new URIBuilder("Add url for API");
//            uri.setPath("Add endpoint for get OTP code");
//            uri.addParameter("token", "f426b7690057b06daeea9a28d3388bed");
//            uri.addParameter("phone", "+19896324611");
//            final String codes = getHtml(uri.toString());
//            final JSONObject jsonObj = new JSONObject(codes);
//            final Object returnCode = jsonObj.get("code");
////            return String.valueOf(returnCode);
//        }
//    public static String getMessage() {
//        return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
//                .filter(m -> m.getTo().equals("+19896324611")).map(Message::getBody).findFirst()
//                .orElseThrow(IllegalStateException::new);
//    }
//
//    private static Stream<Message> getMessages() {
//        ResourceSet<Message> messages = Message.reader("ACc33a8620818a8384c8d0591c88ec60dd").read();
//        return StreamSupport.stream(messages.spliterator(), false);
//    }

    @And("^user choose the country \"([^\"]*)\"$")
    public void userChooseTheCountry(String country) throws Throwable {
        Thread.sleep(10000);
        SeleniumDriver.getDriver().navigate().refresh();
        Thread.sleep(10000);
//        new WebDriverWait(SeleniumDriver.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox"))).click();
//
//        if(SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox")).isDisplayed()){
//            SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox")).click();
//        }
//        else {
//            SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-3-textbox.awsui-select-trigger-textbox")).click();
//        }

//        SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox")).click();
        SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox")).click();
        SeleniumDriver.getDriver().findElement(By.xpath("//input[@class='awsui-input awsui-input-has-icon-left awsui-input-type-text awsui-input-valid']")).sendKeys(country);
        SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='awsui-select-dropdown-options-container']//li//div[@data-value='IN']")).click();


    }

    @And("^user select the text message$")
    public void userSelectTheTextMessage() {
        SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='awsui-radio-button-label-text']//span[text()='Text message (SMS)']")).click();


    }
    @And("^user enter send sms$")
    public void userEnterSendSms() throws InterruptedException {
       SeleniumDriver.getDriver().findElement(By.xpath("//awsui-button[contains(@class,'StretchButton_stetchButton')]//button[@type='submit']")).click();
       Thread.sleep(10000);
    }

    @And("^user enter the contact number to confirm the identity \"([^\"]*)\"$")
    public void userEnterTheContactNumberToConfirmTheIdentity(String number) throws Throwable {
        SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='awsui-input-container']//input[@name='phoneNumber']")).sendKeys(number);
        Thread.sleep(10000);
    }

    @Then("^user click on verify button$")
    public void userClickOnVerifyButton() throws InterruptedException {
        Thread.sleep(10000);
        //
        //awsui-button[contains(@class,'StretchButton_stetchButton')]//button[@type='submit']"
        SeleniumDriver.getDriver().findElement(By.xpath("//button[@class='awsui-button awsui-button-variant-primary awsui-hover-child-icons']")).click();
    }

    @And("^user complete the account sign up$")
    public void userCompleteTheAccountSignUp() throws InterruptedException {
        SeleniumDriver.getDriver().findElement(By.xpath("//awsui-button[contains(@class,'CenteredButton_centeredButton')]//button[@type='submit']")).click();
        Thread.sleep(5000);
    }

    @And("^user click on send sms$")
    public void userClickOnSendSms() throws InterruptedException {
        SeleniumDriver.getDriver().findElement(By.xpath("//awsui-button[contains(@class,'StretchButton_stetchButton')]//button[@type='submit']")).click();
        Thread.sleep(10000);
    }

//    @Then("^user verifies the list of locators are valid$")
//    public void user_verifies_the_list_of_locators_are_valid(DataTable arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        //throw new PendingException();
//
//        List<String> rows = arg1.asList(String.class);
//        for(String locator:rows){
//           SeleniumDriver.getDriver().findElement(By.xpath(locator)).isDisplayed();
//        }
//    }
//    @Then("^validate if the locators used in the automation script are valid$")
//    public void validate_if_the_locators_used_in_the_automation_script_are_valid(DataTable arg1) throws Throwable {
//        List<String> rows = arg1.asList(String.class);
//        for(String locator:rows){
//            SeleniumDriver.getDriver().findElement(By.xpath(locator)).isDisplayed();
//        }
//    }
    @Then("^validate if the locators used in the automation script are valid$")
    public void validate_if_the_locators_used_in_the_automation_script_are_valid(DataTable arg1) throws Throwable {
        List<String> rows = arg1.asList(String.class);
        for(String locator:rows){
            SeleniumDriver.getDriver().findElement(By.xpath(locator)).isDisplayed();
        }
    }


    /**
     * The method getHtml.
     *
     * @return String.
     */
//    private static String getHtml(final String urlToRead) throws IOException {
//        final StringBuilder result = new StringBuilder();
//        final URL url = new URL(urlToRead);
//        final URLConnection connection = url.openConnection();
//        if (connection == null) {
//            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
//        } else {
//            final HttpURLConnection conn = (HttpURLConnection) connection;
//            conn.setRequestMethod("GET");
//            final BufferedReader bufferedReader = new BufferedReader((Reader) (new InputStreamReader(conn.getInputStream())));
//            final Ref.ObjectRef line = new Ref.ObjectRef();
//            while (true) {
//                final String lines = bufferedReader.readLine();
//                line.element = lines;
//                if (lines == null) {
//                    bufferedReader.close();
//                    final String resultLines = result.toString();
//                    Intrinsics.checkExpressionValueIsNotNull(resultLines, "result.toString()");
//                    return resultLines;
//                }
//                result.append((String) line.element);
//            }
//        }
//    }
//Sometimes the API message doesn't mention the word CODE or OTP.
// Our task is to find the digital code from the text and return it.
// You can solve this problem using regular expressions.
// final String codes = getHtml(uri.toString());
// final String OTPCode = codes.replaceAll("[^-?0-9]+");

}
