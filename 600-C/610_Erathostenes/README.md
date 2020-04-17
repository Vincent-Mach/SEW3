# 610_Eratosthenes

## Sieb des Eratosthenes

### Aufgabe:
Mit Hilfe des klassischen Algorithmus "Sieb des Eratosthenes" (ca. 300 v.Chr.) sollen alle Primzahlen (eine ganze Zahl > 1, die nur durch sich selbst und 1 teilbar ist) bis zu einer einzugebenden Obergrenze bestimmt werden.

Da dies mit Divisionen sehr aufwändig ist, hatte Erathostenes folgende Idee:
Man schreibt die Zahlen von 2 bis zur Obergrenze auf. Dann streicht man daraus die Vielfachen von 2, 3, 5 usw. bis zur Quadratwurzel aus der Obergrenze. Die nicht gestrichen Zahlen sind am Ende dann Primzahöen.

Entwickle einen Algorithmus, der diese Funktion automatisiert. Ein gewissenhafter Test wird als selbstverständlich angenommen.

### Hinweis:
verwende ein boolsches Array ```isPrim``` mit n Elementen, die mit true initialisiert werden. Setze das Element ```isPrim[i]``` auf false, wenn du sicher bist dass die Zahl i keine Primzahl ist. Ist das Element ```isPrim[i]``` noch true, so KANN es sich um eine Primzahl handeln, sofern sie nicht später im Algorithmus noch gestrichen wird.

### Sonderaufgabe für Coding-Profis:
Zähle die Anzahl an Zugriffen auf das Array ```isPrim``` und versuche die Anzahl an Zugriffen zu minimieren. In der Kryptografe werden sehr große Primzahlen zur Verschlüsselung benötigt. Supercomputer rechnen Monate um solche Zahlen zu finden - jede Optimierung spart hier wertvolle Rechenzeit!

### Ausgabe:
```
Obergrenze: 100

Primzahlen von 1..100: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

Anzahl der Primzahlen von 1..100: 25
```
