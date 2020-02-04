package Gr1;

import java.io.IOException;

public class Main {
   public static void main(String[] args) {
         SchulVerwaltung sv = new SchulVerwaltung();
      try {
         sv.readSchueler("HTL.csv");
         sv.printKlasse("3AHIT");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
