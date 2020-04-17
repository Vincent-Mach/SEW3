# 506_Personenverwaltung_XXS

Implementiere eine einfache Personenverwaltung mit folgenden Voraussetzungen:

Eine Person besteht aus:
- einen Namen (String)
- Geburtsjahr (vierstellig Zahl)
- Wohnsitz (Person hat einen Hauptwohnsitz bzw. zusätzlich noch weitere Nebenwohnsitze)

Ein Wohnsitz besteht aus:
- Namen der Gemeinde (String)
- Postleitzahl (Zahl)

Beispiele:
- Felix, 2001; 4780 Schärding, 1210 Wien, 4600 Wels
- Manuela, 2003; 4861 Schörfling am Attersee, 4910 Ried im Innkreis
- David, 1999; 4020 Linz

## Aufgabe
Erstelle jeweils eine Klasse zum Speichern/Laden einer Sammlung von Personen (inkl. Wohnsitz(e)) in/aus:
- einer Textdatei (.csv),
- einer Binärdatei und
- einer Datei mit serialisierten Objekten.


### Textdatei (personen.csv)
- Es bietet sich eine CSV-artigte Speicherung mit einem üblichen Trennzeichen an.
- Die gewählte Struktur soll mit einem/mehreren Wohnsitzen zurechtkommen.

### Binärdatei (personen.bin)
- Die Werte der Personen und Wohnsitze sollen binär (String, Zahl) gespeichert werden.
- Das Speichern von Zahlen als Text/Ziffernfolge gilt NICHT als binär.
- Besonderes Augenmerk muss auf die variable Anzahl von Personen und hier wiederum Wohnsitzen gelegt werden.

### Serialisierte Objekte (personen.obj)
- Die Sammlung der Personen soll inklusive deren Wohnsitzen serialisiert gespeichert werden.

## Hinweis
- Für eine beschleunigte Lösung der Aufgabe stehen vorbereitete Klassen Person, City und PersMgmtTester zur Verfügung.
- Diese Klassen umfassen nur das allernotwendigste und sind nicht komplett!!
