package Gr1;

public class Schueler implements Comparable<Schueler> {
   private String klasse;
   private String name;
   private String vorname;
   private int katalogNr;

   public Schueler(String klasse, String name, String vorname, int katalogNr) {
      this.klasse = klasse;
      this.name = name;
      this.vorname = vorname;
      this.katalogNr = katalogNr;
   }

   public String getKlasse() {
      return klasse;
   }

   public void setKlasse(String klasse) {
      this.klasse = klasse;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getVorname() {
      return vorname;
   }

   public void setVorname(String vorname) {
      this.vorname = vorname;
   }

   public int getKatalogNr() {
      return katalogNr;
   }

   public void setKatalogNr(int katalogNr) {
      this.katalogNr = katalogNr;
   }

   @Override
   public String toString() {
      return "Gr1.Schueler{" +
              "klasse='" + klasse + '\'' +
              ", name='" + name + '\'' +
              ", vorname='" + vorname + '\'' +
              ", katalogNr=" + katalogNr +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Schueler)) return false;

      Schueler schueler = (Schueler) o;

      if (getKatalogNr() != schueler.getKatalogNr()) return false;
      if (getKlasse() != null ? !getKlasse().equals(schueler.getKlasse()) : schueler.getKlasse() != null) return false;
      if (getName() != null ? !getName().equals(schueler.getName()) : schueler.getName() != null) return false;
      return getVorname() != null ? getVorname().equals(schueler.getVorname()) : schueler.getVorname() == null;
   }

   @Override
   public int hashCode() {
      int result = getKlasse() != null ? getKlasse().hashCode() : 0;
      result = 31 * result + (getName() != null ? getName().hashCode() : 0);
      result = 31 * result + (getVorname() != null ? getVorname().hashCode() : 0);
      result = 31 * result + getKatalogNr();
      return result;
   }

   @Override
   public int compareTo(Schueler o) {
      int ret = 0;
      if ((ret = this.getName().compareTo(o.getName())) == 0){
         if((ret = this.getVorname().compareTo(o.getVorname())) == 0){
            ret = this.getKatalogNr()-o.getKatalogNr();
         }
      }
      return ret;
   }
}
