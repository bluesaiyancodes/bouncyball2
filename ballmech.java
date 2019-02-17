/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall2;

import javax.swing.JFrame;
/**
 *
 * @author bishalblue
 */
public class ballmech {
    public static void main(String args[]){
        BounceBall Bl=new BounceBall() {};
        JFrame frame=new JFrame();
        frame.add(Bl);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AIO Ball");
    }
}
