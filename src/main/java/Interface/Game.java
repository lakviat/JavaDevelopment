package Interface;

class Game implements Shape {



    public void Method() {
        System.out.println("This is from the implementing Class");
    }

    @Override
    public void Method2() {
        System.out.println("This is concrete method i guess");

    }
}

class ImplementingClass implements Vehicle {
    @Override
    public void Accerlerates() {

    }

    @Override
    public void Drives() {

    }

    @Override
    public void Steers() {

    }
}

