# 504_SantaClaus2_1

Erweitere Santa Claus 2.0 um zusätzliche Funktionalität zum Laden/Speichern der Daten in eine Datei.

## Aufgabe 1) Objektserialisierung/-deserialisierung

Stelle je eine Methode zum Laden und Speichern zur Verfügung, welche die Daten mittels eines ObjectInputStream/ObjectOutputStream lädt/speichert.

Hier gibt es 2 Varianten:
- Speichern/Laden der Anzahl der Kinder als Integer gefolgt von den Kind-Objekten ODER
- Speichern/Laden der gesamten Collection (kinder) als ein Objekt

HINWEIS:
- Objekte, die gespeichert werden sollen, müssen Serializable implementieren!
- Laden erfolgt in genau umgekehrter Reihenfolge wie das Speichern.

ACHTUNG:
- Beide Varianten müssen verstanden, aber nur eine implementiert werden!

## Aufgabe 2) Binäres Laden / Speichern

Stelle je eine Methode zum Laden und Speichern zur Verfügung, welche die Daten mittels DataInputStream/DataOutputStream lädt/speichert.

Es muss dazu jedes Attribut einzeln mit der dazu passenden writeXXX Methode gespeichert werden. Die Speicherung kann in 2 Dateien erfolgen oder aber in 1 Datei (Analog zum Speichern der CSV Dateien). Der Output ist eine Binärdatei (keine Textdatei!!)
