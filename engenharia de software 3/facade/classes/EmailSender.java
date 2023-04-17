public class EmailSender {
  
      public void sendEmail(String to, String from, String subject, String body) {
        EmailMessage email = new EmailMessage(to, from, subject, body);
        email.send();
    }
  
}
