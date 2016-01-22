
package javachat;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaChat {

    public static void main(String[] args) {
       ServerSocket server;
       Socket socket;
      
        DataOutputStream out=null;
        DataInputStream in=null;
         in insaie;
        Scanner lukija = new Scanner(System.in);
        try {
            server = new ServerSocket(6680);  //this is server config. to config host put socket = new Socket(address, port)
            socket = server.accept();
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            
        } catch (IOException ex) {
            System.out.println("vika");
        }
        insaie = new in(in);
        insaie.start();
        String s="a";
        String viesti;
        while(true) {
        System.out.print("");
        viesti = lukija.next();
        
        
        try {
            out.writeUTF(viesti);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(JavaChat.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
}
