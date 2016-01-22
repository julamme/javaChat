/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachat;

import java.io.DataInputStream;

public class out extends Thread {
    DataInputStream output;
    String s;
    private volatile boolean close=false;

    public out (DataInputStream output) {
        this.output= output;
    }
    
    public void run() {
        
    }
    
}
