package Gr1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CSVReader {

   public Map<String, TreeSet<Schueler>> readSchueler(String fileName) throws IOException {
      String line;
      String[] data;

      Map<String, TreeSet<Schueler>> schueler = new HashMap<>();

      // try-with-ressources -> br wird automatisch geschlossen!
      try (BufferedReader br = new BufferedReader(new FileReader(fileName));){
           // Überschrift überspringen
         br.readLine();
         Schueler s;

         while((line=br.readLine())!=null){
            // TODO: Zeile parsen
            data = line.split(";");

            // TODO: Schüler erzeugen
            if (data.length == 3)
               s = new Schueler(data[0], data[1], data[2], 0);
            else
               s = new Schueler(data[0], data[1], data[2], Integer.parseInt(data[3]));

            // TODO: in Collections speichern

            // gibt es die eingelesene Klasse schon als SChlüssel in der Map?
            if (schueler.containsKey(s.getKlasse())){
               schueler.get(s.getKlasse()).add(s);
            } else{ // Klasse wird zum ersten Mal eingelesen
               TreeSet<Schueler> ts = new TreeSet<>();
               ts.add(s);
               schueler.put(s.getKlasse(), ts);
            }

         }
      }
      return schueler;
   }
}
