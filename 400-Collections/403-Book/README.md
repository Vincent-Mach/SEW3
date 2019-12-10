# 403_Book

Siehe Herdt "Java 8 - Grundlagen Programmierung", 13.8 Übung, Seite 156ff
1. Definieren Sie die Klasse Book. Sie dient zum Speichern der Daten über ein Buch und hat die Eigenschaften author, title und issue. Erstellen Sie Getter- und Setter-Methoden zum Speichern und Auslesen der Attribute. Im Konstruktor werden die übergebenen Werte gesetzt.
2. Erstellen Sie eine Anwendung mit dem Namen Exercise.
3. Definieren Sie ein Array, in dem sechs Objekte der Klasse Book gespeichert werden sollen.
4. Lassen Sie im Konstruktor der Klasse Exercise sechs Objekte der Klasse Book erstellen und in dem Array speichern. Dieses Array wird für die folgenden Übungsaufgaben 6 - 8 benötigt.
5. Für jeden der nachfolgenden Aufgabenteile 6 bis 8 ist eine Methode part6 ... part8 zu programmieren. Der Aufruf der entsprechenden Methode erfolgt in Abhängigkeit vom Parameter, der der Anwendung übergeben wird. Der Parameter entspricht der Aufgabennummer. Wird das Programm z. B. mit Parameter 6 aufgerufen, soll die Methode Part6 ausgeführt werden. Erstellen Sie im Konstruktor eine if-Verzweigung, in der Sie die entsprechende Methode aufrufen.
6. Erzeugen Sie für die Verwaltung der Bücher eine ArrayList. Fügen Sie in die ArrayList die sechs Buchobjekte des Arrays ein und geben Sie diese unsortiert, sortiert und in umgekehrter Reihenfolge sortiert aus. Die Ausgabe sollte den folgenden Aufbau besitzen:
```
Goethe: "Faust I" Auflage: 20000 Stueck Schiller: "Wilhelm Tell" Auflage: 10000 Stueck ...

Fontane: "Effi Briest" Auflage: 10000 Stueck *** in umgekehrter Reihenfolge *** Schiller: "Wilhelm Tell" Auflage: 10000 Stueck ...

Fontane: "Effi Briest" Auflage: 10000 Stueck *** in sortierter Reihenfolge *** Fontane: "Effi Briest" Auflage: 10000 Stueck ...

Schiller: "Wilhelm Tell" Auflage: 10000 Stueck
```
Um eine Sortierung in der gewünschten Form zu erhalten, müssen Sie in die Klasse Book die Methode compareTo implementieren.
7. Verwenden Sie für die Bücherverwaltung eine HashMap. Füllen Sie diese mit den Büchern des Arrays. Als Schlüssel soll der laufende Index verwendet werden. Geben Sie anschließend die Bücher der HashMap aus (ohne Index).
Definieren Sie nun eine TreeMap, die die gleichen Elemente enthält wie die HashMap, und geben Sie sie ebenfalls aus.
8. In dieser Aufgabe sollen die Bücher in Collections vom Typ Set verwaltet werden. Arbeiten Sie zuerst mit einem HashSet. Übernehmen Sie die Bücher aus dem Array und zeigen Sie diese an. Fügen Sie dann ein neues Buch hinzu, das in der Liste bereits existiert. Erscheint dieses Buch in der Anzeige doppelt, ist das ein Fehler (ein Set kann jedes Objekt nur einmal enthalten). Lesen Sie in diesem Kapitel nach, wie Sie dieses Problem lösen können.
