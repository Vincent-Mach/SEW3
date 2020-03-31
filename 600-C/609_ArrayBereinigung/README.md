# 609_ArrayBereinigung

## Aufgabe:
Erstelle ein Programm, welches die Duplikate aus einem int-Array entfernt, sodass jede Zahl nur einmal im Array vorkommt.
Wird ein Element gestrichen, so sind alle Elemente "dahinter" um eine Stelle "vorzurücken", dh alle übrig gebliebenen Zahlen solle immer an den vordersten Arraypositionen stehen. Unbenutzte Elemente sind auf 0 zu setzen.

Zum Belegen des Arrays müssen vorher max. 10 Elemente eingelesen werden, der Benutzer kann die Eingabe jedoch vorzeitig durch die Eingabe einer 0 beenden.

Zur Vedeutlichung ein Beispiel:


vorher   | 3 | 4 | 6 | 3 | 9 | 7 | 6 | 3 | 6 | 3
-------- | - | - | - | - | - | - | - | - | - | -
nachher  | 3 | 4 | 6 | 9 | 7 | 0 | 0 | 0 | 0 | 0
