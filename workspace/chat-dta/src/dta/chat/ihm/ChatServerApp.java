package dta.chat.ihm;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServerApp {

	private static final int MAX_THREAD = 20;
	private static final int SERVER_PORT = 1800;

	private static class SocketClient {
		private ObjectInputStream input;
		private ObjectOutputStream output;
	}

	public static void main(String[] args) throws IOException {

		final List<SocketClient> sockets = Collections.synchronizedList(new ArrayList<>());

		try (ServerSocket socketServeur = new ServerSocket(SERVER_PORT)) {
			ExecutorService es = Executors.newFixedThreadPool(MAX_THREAD);

			while (true) {
				System.out.println("Server : Attente d'un client");
				final Socket socketClient = socketServeur.accept();

				es.execute(() -> {
					SocketClient client = null;
					try {
						client = new SocketClient();
						client.output = new ObjectOutputStream(socketClient.getOutputStream());
						client.input = new ObjectInputStream(socketClient.getInputStream());

						sockets.add(client);

						System.out.println("Serveur : Connexion du client " + socketClient.getInetAddress());

						while (true) {
							Object msg = client.input.readObject();
							System.out.println("Message reçu " + msg);
							for (SocketClient soc : sockets) {
								if (!soc.equals(client)) {
									soc.output.writeObject(msg);
								}
							}
						}
					} catch (IOException | ClassNotFoundException e) {
						System.err.println("Erreur client " + e.getMessage());
						// e.printStackTrace();
					} finally {
						sockets.remove(client);
						System.err.println("Fin du client " + socketClient.getInetAddress());
					}
				});
			}
		}
	}

}
