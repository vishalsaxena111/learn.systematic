package com.learn.systematic.SOLID;

public interface LiskovsubstitutionPrincipleInterface {

    //Derived or child classes must be substitutable for their base or parent classes

    interface SocialMedia {
        public void chatWithFriend();
        public void sendPhotosAndVideos();
    }

    interface SocialPostAndMediaManager {
        public void publishPost(Object post);
    }

    interface VideoCallManager{
        public void groupVideoCall(String... users);
    }

    class Instagram implements SocialMedia ,SocialPostAndMediaManager{
        public void chatWithFriend(){
            //logic
        }
        public void sendPhotosAndVideos(){
            //logic
        }
        public void publishPost(Object post){
            //logic
        }
    }
}
