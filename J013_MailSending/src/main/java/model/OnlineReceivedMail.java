
package model;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class OnlineReceivedMail {
	public static void receiveEmail(String host, String storeType, String user, String password) {
		try {

			// 1) get the session object
			Properties properties = new Properties();
			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");

			Session emailSession = Session.getDefaultInstance(properties);

			// 2) create the POP3 store object and connect with the pop server

			Store store = emailSession.getStore("pop3s");
			store.connect(host, user, password);

			// 3) create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			// 4) retrieve the messages from the folder in an array and print it
			Message messages[] = emailFolder.getMessages();
//			for (int i = 0; i < messages.length; i++) {
			int i = ((messages.length) - 1);
			Message message = messages[i];
			System.out.println("---------------------------------");
			System.out.println("Email Number " + (i + 1));
			System.out.println("Subject: " + message.getSubject());
			System.out.println("From: " + message.getFrom()[0]);
			System.out.println("Text: " + message.getContent().toString());
//			}

			// 5) close the store and folder objects
			emailFolder.close(true);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String host = "pop3.gmail.com";
		String storeType = "pop3";
		String user = "kinjalsavaliya2620@gmail.com";
		String password = "yntprdkoahpmeybe";// change accordingly

		receiveEmail(host, storeType, user, password);
	}
}
