package _training.Classes;

public class Mobile extends Computer {

    // New Fields!

    String currentApp;
    boolean onHomeScreen;

    // New Methods!
    
    public void toggleHomeScreen() {
        if(onHomeScreen) {
            System.out.println("You have returned to the app " + currentApp);
        } else {
        System.out.println("You are on the home screen");
        }
        onHomeScreen = !onHomeScreen;
    }

    public void openApp(String appName) {
        if(onHomeScreen) {
            System.out.println("You have opened the app "+appName);
            currentApp = appName;
            onHomeScreen = false;
        }
    }

    public static void main(String[] args) {
        
    }
}