package MailReader.MailReader;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

//Para enviar e-mails, utilizamos os servidores STMP
public class MailSender {
    void sendEmail(String receiver) {
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "Digite seu gmail aqui";
        String password = "Digite a sua senha de app do Google aqui";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
                message.setSubject("Sua mensagem foi recebida com sucesso!!");
                message.setText("Olá, caro cliente. Já identificamos o envio do seu e-mail. Fique tranquilo que os nossos profissionais estão analisando o seu pedido e você será respondido entre 10 à 15 minutos.");

                Transport.send(message);

                System.out.println("Como esse e-mail esta marcado como um CLIENTE IMPORTANTE, foi enviado um e-mail automático para o cliente, o informando\n que ja estamos revisando o pedido dele.");
            } catch (MessagingException e) {
                e.printStackTrace();
                System.out.println("Erro ao enviar e-mail: " + e.getMessage());
            }
        }
    }

