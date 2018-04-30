package com.game;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class ChatClient extends Frame
{
    public static void main( String[] args )
    {
        new ChatClient().launchFrame();
    }


    public void launchFrame(){
        setLocation(400, 300);
        this.setSize(1000, 1000);
        setVisible(true);
    }
}
