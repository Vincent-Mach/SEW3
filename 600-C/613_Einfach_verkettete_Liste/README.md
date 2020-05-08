# 613_Einfach_verkettete_Liste

## Aufgabe
Entwickle ein C Programm, welches Personennamen (Vorname + Nachname) in einer einfach verketteten Liste verwaltet.
Verwende ein globales 'first' Element!

- Folgende Structur ist gegeben:
```
typedef struct data {
	char firstName[MAX_LEN];
	char lastName[MAX_LEN];
	struct data *next;
}DATA;
```

- Folgende Funktionen sind (mindestens) zu implementieren:
```
void addElementEnd(char *firstName, char *lastName);
void addElementBegin(char *firstName, char *lastName);
int deleteElement(char *lastName);
void printAll();
void freeAll();
```

- Teste dein Programm, wichtig sind hier insbesondere die Ausnahmefälle (löschen von einem nicht existenten Element, löschen des ersten Elements, ...)
