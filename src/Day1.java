import java.io.*;
import java.net.*;
class SocketDay1Server  {

    public static void main(String argv[]) throws Exception {

        String clientSentence;

        String capitalizedSentence;

        ServerSocket skt = new ServerSocket(6789);
        while (true) {

            Socket connectionSocket = skt.accept();

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            clientSentence = inFromClient.readLine();

            System.out.println("Received and Sending: " + clientSentence);
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);
        }
    }
}