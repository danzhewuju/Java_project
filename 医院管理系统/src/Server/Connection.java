package Server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import all_class.Case;

public class Connection {
	 private static ArrayList<Case> register=new ArrayList<Case>();
	 public void add_register(Case register){
		synchronized (this ){ this.register.add(register);}
	 }
	
	public void register_Thread(){
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ServerSocket server=null;
				Socket socket=null;
				try {
					socket=server.accept();
					ObjectInputStream is=null;
					ObjectOutputStream os=null;
					is=new ObjectInputStream(new  BufferedInputStream(socket.getInputStream()));
			        os=new ObjectOutputStream(socket.getOutputStream());
					try {
						Case patient=(Case)is.readObject();
						add_register(patient);
						
						
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
		}).start();
	}
	

}

