package MailReader.MailReader;

import java.util.ArrayList;

public class FromVerification {
   boolean verifyIfClientIsImportant(String client) {
        MailSender mailSender = new MailSender();
        ArrayList<String> importantClients = new ArrayList<String>();
        importantClients.add("clienteimportantey@gmail.com");
        importantClients.add("caedessi@gmail.com");

        for(String currentClient : importantClients){
            if(client.contains(currentClient)){
                return true;
            }
        }
       System.out.println("Esse cliente nao esta marcado como um cliente importante, portanto, nao foi enviado um e-mail de respostas. Para marca-lo, adicione-o ao array da classe FromVerification.");
        return false;
    }





}
