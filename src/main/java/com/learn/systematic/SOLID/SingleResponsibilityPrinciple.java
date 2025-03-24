package com.learn.systematic.SOLID;

public class SingleResponsibilityPrinciple {



    public class BankService {

        public long deposit(long amount, String accountNo) {
            //deposit amount
            return 0;
        }

        public long withDraw(long amount, String accountNo) {
            //withdraw amount
            return 0;
        }

        public void printPassbook() {
            //update transaction info in passbook
        }

        public void getLoanInterestInfo(String loanType) {
            if (loanType.equals("homeLoan")) {
                //do some job
            }
            if (loanType.equals("personalLoan")) {
                //do some job
            }
            if (loanType.equals("car")) {
                //do some job
            }
        }

        public void sendOTP(String medium) {
            if (medium.equals("email")) {
                //write email related logic
                //use JavaMailSenderAPI
            }
        }

    }

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
