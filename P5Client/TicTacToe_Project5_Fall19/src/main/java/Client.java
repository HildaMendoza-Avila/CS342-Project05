import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.function.Consumer;

public class Client extends Thread{
	Socket socketClient;
	
	ObjectOutputStream out;
	ObjectInputStream in;
	Integer portnum;
	String ipAddress;
	GameInfo gi;
	
	private Consumer<Serializable> callback;//put message for port scene
	private Consumer<Serializable> message; //use for writing message to the client GUI
	// private Consumer<Serializable> setGame; //change scene to game and should also be able to display message to the listview
	// private Consumer<Serializable> setChallenge; //change scene to pick Opponent
	
	Client(Consumer<Serializable> call,String ip,int port){
		callback = call;
		ipAddress = ip;
		portnum = port;
	}
	
	public void run() {
		try {
			socketClient = new Socket(ipAddress,portnum);
			out = new ObjectOutputStream(socketClient.getOutputStream());
		    in = new ObjectInputStream(socketClient.getInputStream());
		    socketClient.setTcpNoDelay(true);
		}
		catch(Exception e) {
			callback.accept("Unable to Connect to Server");
		}
		while( true ) {
			try {
				gi = (GameInfo)in.readObject();
			} catch(Exception e) {}
			
		} // End of while
	} // End of run
} // End of Client class

///////////////////////////////////
		
	
