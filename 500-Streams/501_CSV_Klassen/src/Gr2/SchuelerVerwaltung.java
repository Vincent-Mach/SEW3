package Gr2;

import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;

public class SchuelerVerwaltung {
   private Map<String, TreeSet<Schueler>> schueler;
   private CSVReader csvReader;

   public SchuelerVerwaltung(){
      csvReader = new CSVReader();
   }

   public void readSchueler(String file) throws IOException {
      schueler = csvReader.readCSV(file);
   }

   public void printKlasse(String klassenName){
      if (schueler.containsKey(klassenName)){
         TreeSet<Schueler> ts = schueler.get(klassenName);
         for (Schueler t : ts) {
            System.out.println(t);
         }
      }else{
         System.out.println("Klasse " + klassenName + " existiert nicht!");
      }
   }
}
