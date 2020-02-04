package Gr2;

import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      SchuelerVerwaltung sv = new SchuelerVerwaltung();
      try {
         sv.readSchueler("HTL.csv");
         sv.printKlasse("3AHIT");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
