package Gr2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CSVReader {

   public Map<String, TreeSet<Schueler>> readCSV(String file) throws IOException {
      String line;
      String[] data;
      Schueler s;
      Map<String, TreeSet<Schueler>> schueler = new HashMap<>();

      // TODO: Lese Datei zeilenweise ein + Ausgabe am Bildschirm
      try (BufferedReader br = new BufferedReader(new FileReader(file));){
         // Überschrift verwerfen
         br.readLine();

         while ((line = br.readLine())!=null){
            // TODO: Parse die einzelnen Zeilen
            // TODO: Erzeuge Schüler (Objekte)
            data = line.split(";");

            if (data.length == 4)
               s = new Schueler(data[0], data[1], data[2], Integer.parseInt(data[3]));
            else // muss Lehrer sein -> KatalogNr=0
               s = new Schueler(data[0], data[1], data[2], 0);

            // TODO: Speichere Schüler in Collection

            // Existiert Klasse (= Schlüssel) schon?
            if (schueler.containsKey(s.getKlasse())){
               schueler.get(s.getKlasse()).add(s);
            } else { // noch nicht -> neues TreeSet anlegen
               TreeSet<Schueler> ts = new TreeSet<>();
               ts.add(s);
               schueler.put(s.getKlasse(), ts);
            }
         }
      }


      return schueler;
   }
}
