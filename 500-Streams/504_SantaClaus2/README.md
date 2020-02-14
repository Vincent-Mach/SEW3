# 504_SantaClaus2
Im Zuge von Einsparungen soll am Nordpol der bisherige Workﬂow auf eine EDV gestützte Lösung (SAP - Santas Arbeits Programm) umgestellt werden.

![SantaClaus](https://img1.goodfon.com/wallpaper/nbig/f/7f/santa-klaus-elka-elka.jpg)

Bisher war die Arbeitsweise wie folgt:

- Santa verwaltet in seinem Buch alle Kinder dieser Welt und kann darin nachschlagen, ob Kind brav war oder nicht. -
- Die Kinder schicken Santa Ihren Wunschzettel per Weihnachtspost.
- Am Nordpol werden die Wunschzettel der Kinder der Reihe nach abgearbeitet.
- Als erstes wird nachgesehen, ob das Kind brav war.
- Falls dies der Fall ist, werden die Wünsche der Kinder produziert (Elfenfabrik) und anschließend verpackt.
- Schlimme Kinder erhalten kein Geschenk.


Santa hat einige Elfen damit beauftragt, die Daten (Verhalten der Kinder und Wunschzettel) in CSV-Dateien zu erfassen und auch gleich die Kosten (zwecks Kalkulation) und das Gewicht (zwecks max. zulässiges Gesamtgewicht des Schlitten) zu ermitteln.

Es sind 2 Dateien entstanden: (Erstelle diese Dateien selbst mit einem Editor)


Kinder.csv:

```  		
      Name;Verhalten;
      Thomas;brav;
      Franzi;nicht brav;
      Susi;brav;
      Harald;nicht brav;
      Erich;brav;
      Ferdinand;nicht brav; 
      ...
```

sowie

Wunschliste.csv:

```  		
    Name;Wunsch;
    Kosten;Gewicht;
    Thomas;Harley Davidson Chromteile; 299.90; 0.5;
    Thomas;Ring;200;0.01;
    Franzi;Das große Buch der Proxies;49.50;2;
    Franzi;Raspberry Pi 4;49.90;0.3;
    ...
```


Santa möchte auf Knopfdruck wissen, welches Kind welche Wünsche hat, was hoch die Kosten der Wünsche sind und wie schwer sie sind.


### 1) Kind/Wunsch
Implementiere Klassen für Kinder (Kind) und Wünsche (Wunsch)

### 2) CSV Dateien erstellen und importieren
Erstelle eine Klasse CSVReader, welche die CSV Dateien ausliest und in einer dafür passenden Collection speichert. Ziehe bei deinen Überlegungen Aufgabe 3) ins Kalkül

### 3) Suche von Kindern, Gesamtkosten/-gewicht, Wünsche
Implementiere eine Klasse SAP, welche das Herzstück der Anwendung bietet. Santa soll eine Möglichkeit bekommen, wie er nach Eingabe eines Namens auf die Daten des Kindes (Verhalten, Wunschliste, Gesamtkosten, Gesamtgewicht) zugreifen kann (entsprechende Methoden). Hr. Claus macht viele Abfragen dieser Art…

Weiters braucht er eine Methode, welche die Gesamtkosten und das Gesamtgewicht insgesamt bzw. je Kind berechnet.

### 4) Lieferung
Für die Auslieferung der Geschenke muss Santa mehrmals ausfahren. Sein Schlitten kann eine Gesamtlast von xx kg transportieren. Überlege dir wie die Lieferungen intern gespeichert bzw. abgebildet werden kann (je Lieferung mehrer Geschenke) und wie man aus den gesamten Wünschen die Teil-Lieferungen berechnen kann. Stelle entsprechende Methoden zur Verfügung.

### 5) Speicherung in einer CSV Datei
Santa möchte die Daten in einer Datei verwalten. Überlege dir ein CSV Format und speichere die Daten in einer Datei ab Klasse CSVWriter.

### 6) Testprogramm
Schreibe ein Testprogramm, welches die Funktionalität von SAP testet.
