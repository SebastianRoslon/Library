package app;

 public class LibraryApp {

     private static final String APP_NAME = "Biblioteka c0.9";

    public static void main(String[] args) {

        System.out.println(APP_NAME);


        LibraryControl libControl = new LibraryControl();

        libControl.controlLoop();
    }
}
