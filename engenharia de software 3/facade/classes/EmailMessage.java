public class EmailMessage {
    private String to;
    private String from;
    private String subject;
    private String body;

    public EmailMessage(String to, String from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public void send() {
        System.out.println("Enviando e-mail para " + to + " de " + from + " com assunto: " + subject);
        System.out.println("Corpo do e-mail:");
        System.out.println(body);
    }
}
