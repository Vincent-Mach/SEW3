package Gr1;

import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;

// Methoden, die aus Testklasse verwendet werden -> DIE Anwendung
public class SchulVerwaltung {
   private Map<String, TreeSet<Schueler>> schueler = null;
   private CSVReader csvReader = null;

   public SchulVerwaltung(){
      csvReader = new CSVReader();
   }

   public void readSchueler(String fileName) throws IOException {
      schueler = csvReader.readSchueler(fileName);
   }

   public void printKlasse(String klassenName){
      TreeSet<Schueler> ts = schueler.get(klassenName);

      for (Schueler t : ts) {
         System.out.println(t);
      }
   }

}
