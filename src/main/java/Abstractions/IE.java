package Abstractions;

import utilities.Driver;

public class IE extends Browser {


    public IE(int memory){
        this.memory = memory;

    }

    @Override
    public void launchBrowser() {
        if(this.browserLaunched){
            System.out.println("This browser is already launched");
        }

    }

    @Override
    public boolean closeTab(String url) {
        return false;
    }

    @Override
    public void addTab(String url) {

    }

    @Override
    public void changeTab(String url) {

    }

    @Override
    public void closeBrowser() {

    }
}
