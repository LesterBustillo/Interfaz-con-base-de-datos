
package com.mbutgae.jf.chat;


 
public class MainChat {
    public static void main(String[] args) {
           new GUIServer().setVisible(true);
           new GUIClient("localhost", 1000).setVisible(true);
    }
}
