/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachat;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lammi
 */
public class in extends Thread{
    DataInputStream input;
    String s;
    private volatile boolean close=false;

    public in (DataInputStream input) {
        this.input= input;
    }
    
    public void run() {
        while(!close) {
            
        try {
            while(input.available()!=0){
            s= input.readUTF();
            System.out.print(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(in.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    public void sulje(){
        close=true;
    }
}
