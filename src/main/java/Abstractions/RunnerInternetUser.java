package Abstractions;

public class RunnerInternetUser {
    public static void main(String[] args) {
        //Abstract Class is cannot be instantiated, contains abstract methods which doesnt have any implementation
        // Abstract method doesnt have body, that doesnt have any code on it, no implementation
        //Concrete class -- > first non abstract class that is extending to abstract class.
        //concrete class must implement override all the abstract methods that is inherited from abstract class
        //we can't instatiate abstract classes
        // Instance varialbles works the same as regular classes in abstract classes

        //Can we have constructor in abstract class   //// YES we can
        //Becuase inherritance reference needs to get to Object class
        /// Abstract class doesnt have anything with inheritance it extends to an object


        Chrome chrome = new Chrome(512);
        chrome.addTab("google.com");

        chrome.version = "68.08";
        chrome.launchBrowser();
        chrome.addTab("google.com");
        chrome.addTab("amazon.com");
        chrome.printInfo();
        chrome.closeBrowser();
        chrome.closeTab("amazon.com");
        chrome.printInfo();
        chrome.closeBrowser();
        chrome.printInfo();
    }
}
