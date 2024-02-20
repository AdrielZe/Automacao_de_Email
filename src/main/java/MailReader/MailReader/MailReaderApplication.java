package MailReader.MailReader;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

@SpringBootApplication
public class MailReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailReaderApplication.class, args);
	}




}
