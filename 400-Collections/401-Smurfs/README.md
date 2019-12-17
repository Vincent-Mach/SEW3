# 401_Smurfs

## Schlumpfverwaltung mit Collections
Löse folgende Aufgabenstellung mit Collections

* Erstelle eine Klasse **Smurf** (Name, Vorname, PilzNr., eindeutige Schlumpf-ID über alle Schlümpfe)
* Implementiere die Klasse **SmurfStorage**, mit folgender Funktionalität (je eine Methode), die jeweils mit ArrayList bzw. LinkedList funktionieren soll:
  * ```createSmurfs(int x)``` : x Schlümpfe werden erzeugt und in einer Collection gespeichert (Tip: generiere Namen + SchlumpfNr. mit Schleife)
  * ```deleteSmurf(int id)```: Lösche einen bestimmten Schlumpf anhand seiner SchlumpfID
  * ```searchName(String name)```: Suchen eines Schlumpfes anhand seines Namens
  * ```printAll()```: Ausgeben aller Schlümpfe (bei LinkedList auch umgekehrte Reihenfolge)
  * ```getSmurfAsArray()```: gibt alle Schlümpfe in einem Feld zurück 
