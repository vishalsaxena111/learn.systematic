package com.learn.systematic.SOLID;

public interface OpenClosePrincipleInterface {

    public class NotificationService{
        public void sendOTP(String medium) {
            if (medium.equals("email")) {
                //write email related logic
                //use JavaMailSenderAPI
            }
        }
    }

    //Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

    void calculateArea(int h, int w); // these method use according =ly for there shapes

     void calculatePerimeter(int h, int w);



}
