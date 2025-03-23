package com.learn.systematic.SOLID;

public class SingleResponsibilityPrinciple {

    // A class should have one, and only one, reason to change.

    class userManagement{

        public boolean authenticateUser(){

            /// some code
            return true;
        }
    }


    class EmailManagement{

        public void sendEmail(){

            /// some code

        }
    }


    class updateUserProfile{

        public void updateUser(){

            /// some code

        }
    }


}
