import fontutils.FontCreator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FontCreator fontCreator = new FontCreator();
        int[] a = {};
        fontCreator.getHFont(2, 20, "0123456789", a, "test");
    }
}