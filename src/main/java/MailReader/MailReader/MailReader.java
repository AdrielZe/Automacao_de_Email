package MailReader.MailReader;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.swing.*;
import java.util.*;

public class MailReader {
 public static void main(String[] args) {
     MailSender mailSender = new MailSender();
     //servidor POP
     String host = "pop.gmail.com";
     String username = "Digite seu gmail aqui";
     String password = "Digite a sua senha de app do Google aqui";

     //Configuração para realizar a conexão com o servidor POP;
     Properties prop = new Properties();
     prop.setProperty("mail.pop3.host", host);
     prop.setProperty("mail.pop3.port", "995");
     prop.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
     prop.setProperty("mail.pop3.socketFactory.fallback", "false");

     Session session = Session.getInstance(prop);

     try{
      //Conectar ao servidor pop
        Store store = session.getStore("pop3");
        store.connect(host, username, password);

      //Abrir pasta de entrada
       Folder inbox = store.getFolder("INBOX");
       inbox.open(Folder.READ_ONLY);

       //Obter array de objetos Message, representando mensagens da pasta de entrada



       //Iterar sobre cada mensagem e extrair dados desejados
         Message[] totalMessages = inbox.getMessages();

// Especificando o intervalo de mensagens para recuperar (do mais recente para o mais antigo)


         for ( int i = 0; i< totalMessages.length; i++) {
               Message message = totalMessages[i];
               String subject = message.getSubject();
               String from = InternetAddress.toString(message.getFrom());

               System.out.println("ATENCAO: VOCE RECEBEU NOVOS E-MAILS");
               System.out.println("------------------------------");
               System.out.println("Email numero " + (i + 1));
               System.out.println("Assunto: " + subject);
               System.out.println("De: " + from);

                 Object content = message.getContent();
                 MimeMultipart multipart = (MimeMultipart) content;

                   for (int j = 0; j < multipart.getCount(); j++) {
                       BodyPart bodyPart = multipart.getBodyPart(j);
                       if (bodyPart.isMimeType("text/plain")) {
                           System.out.println("-----------------------------------");
                           System.out.println("Conteudo do e-mail:\n" + bodyPart.getContent() + "\n");
                       }
                   }
             if (Objects.equals(from, "Cliente <clienteimportantey@gmail.com>")){
                 mailSender.sendEmail("clienteimportantey@gmail.com");
             }
           }

       //Fechar pasta de entrada e conexão com servidor POP
      inbox.close(false);
       store.close();
     } catch (Exception e){
      e.printStackTrace();
         System.out.println("Erro ao RECEBER e-mail: " + e.getMessage());
     }

 }
}
