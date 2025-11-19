package es.ciudadescolar;

import java.io.File;

import es.ciudadescolar.util.BdooManager;

public class Main {
    public static void main(String[] args) 
    {
        BdooManager bd = new BdooManager(new File("instituto.db4o"), true);

    }
}