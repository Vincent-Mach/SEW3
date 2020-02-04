# Projektplanung

In einer Firma werden Projekte durchgeführt. 

Die Projekte bestehen aus:
- Phasen (Analyse, Entwurf, Implementierung, Test, ...)
- Personen (welche an Projekten arbeiten)

Personen buchen ihre Arbeitszeit(in min.) auf eine Phase eines Projekts.

Bisher wurden Projekte und die Personen, die an einem Projekt zu einer bestimmten Zeit arbeiten mithilfe einer CSV-Datei verwaltet. 

Die CSV-Dateien haben den Aufbau:

```
Person;Projekt;Phase;Datum;Minuten
HELF;Eduway;Analyse;01.02.2017;118
```
Um eine umfassende Analyse und bessere Planung durchführen zu können, soll folgende Funktionalität hergestellt werden. Es sind kein GUI und keine Konsoleneingaben notwendig. Die Hauptfunktionalität soll sich in der Klasse Projektmanagement befinden.


## Gesamt (  /  20)


## Datenklassen ( / 6)
- ( / 2) `Projekt`:
    - jedes Projekt hat einen Namen, sowie eine Sammlung von Projektmitarbeitern
    - auf Projektsmitarbeiter kann über Namen zugegriffen werden, wobei diese alphabetisch aufsteigend sortiert sind
    
-  ( / 2) `Zeiteintrag`
    - ein Zeiteintrag besteht aus dem Projektnamen, der Projektphase, dem Datum und die Arbeitszeit
    
-  ( / 2) `Person`  
    - jede Person hat einen Namen, sowie
    - eine nach Phase, Datum und Arbeitszeit sortierte Sammlung von Zeiteinträgen


## Importieren der Projekte ( / 6)
Die bereitgestellte CSV-Datei "zeiteintraege.csv" ist einzulesen!
- Erstelle dazu eine passende Klasse für den CSV Import:
    - Die Import-Methode erzeugt eine Collection von Projekten
    - Der Zugriff auf die Projekte erfolgt über den Projekt Namen und soll einen schnellen Zugriff erlauben
    - Beim Einlesen der Personen sind gleichzeitig die einzelnen Zeiteinträge zuzuordnen
  
    
## Klasse `Projektmanagement` (  / 8)
- ( / 3) Projektzeitplan:
    - zu einem einzelnen Projekt soll es möglich sein einen Zeitplan auszugeben
    - der Plan ist sortiert nach Personen, Phasen und Zeiteintrögen 
- ( / 3) Personenzeitplan:
    - für  eine Person ist der Zeitplan aller Projekte für einen Datumsbereich (z.B. 01.01.2017 bis 02.02.2017) auf einfache Art auszugeben
- ( / 2) Personenzeitplan Erweiterung
    - gib beim Personenzeitplan zusätzlich eine Gesamtsumme der Arbeitszeit pro Projekt an      


## Test ( / 1)
Teste dein Programm in der Klasse `Projektmanagement`
- Einlesen der Daten
- Projektzeitplan für das Projekt "EDUWAY" ausgeben
- Zeitplan der Person "GAME" zw. "01.01.2017" und "02.02.2017" ausgeben


## Hinweise / Sonstiges:

 ## Abgabe:
 - erstelle ein Projekt auf `Z:\Schule` mit dem Namen: 599_PLF_Nachname
 - lösche vor der Abgabe alle Dateien im Projektlaufwerk AUSSER `src`
 - Zippe den Ordner `599_PLF_Nachname`, du erhälst `599_PLF_Nachname.zip`
 - gib die Zip-Datei am Lehrer Laufwerk unter `HELT\Abgabe_SA\Klassenname` ab
