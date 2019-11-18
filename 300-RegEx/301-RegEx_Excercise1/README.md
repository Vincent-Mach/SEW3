# 301-RegEx_Excercise1

## Aufgabe 1:
Finde die passenden Regulären Ausdrücke und teste diese ordentlich. Füge die Antworten als Textfile in dein JavaProjekt ein.  
Verwende für diese Aufgabe die Webseite: [Regex101](http://regex101.com) zum  Erstellen des RegEx.

1) Österreichische PLZ
2) Handy Nummer (0664/8234236 oder 0676 3027123)
3) Gültige Variablennnamen in Java
4) Datum tt.mm.jj
5) EMail Adresse
6) IP Adresse
7) Satzzeichen am Satzende
8) Schreibe ein Java-Programm, das überprüft, ob eine URL richtig eingegeben wurde.

## Aufgabe 2:
Bei dem unten angeführtem Java Programm fehlen die regulären Ausdrücke. Ergänze die Datei an den kommentierten Stellen, sodass die nachfolgenden Statements, die geforderten Ausgaben ergeben.

```
import java.util.regex.Pattern;

public class reg2
{
    public static void main(String args[]){
    // It would return true if string matches exactly "ann"
    System.out.println("1: "+Pattern.matches(, "Ann")); //False

    // returns true if the string matches exactly "ann" or "Ann"
    System.out.println("2: "+Pattern.matches(, "Ann")); //True
    System.out.println("3: "+Pattern.matches(, "ann")); //True

   /* Returns true if the string matches exactly "tim"
    * or "Tim" or "jin" or "Jin"
    */
    System.out.println("4: "+Pattern.matches(, "Tim"));//True
    System.out.println("5: "+Pattern.matches(, "jin"));//True

    // returns true if the string contains "abc" at any place
    System.out.println("6: "+Pattern.matches(, "deabcpq"));//True

    // returns true if the string does not have a number at the beginning
    System.out.println("7: "+Pattern.matches(, "123abc")); //False
    System.out.println("8: "+Pattern.matches(, "abc123")); //True

    // returns true if the string contains of three letters
    System.out.println("9: "+Pattern.matches(, "aPz"));//True
    System.out.println("10: "+Pattern.matches(, "aAA"));//True
    System.out.println("11: "+Pattern.matches(, "apZx"));//False

    // returns true if the string contains 0 or more non-digits
    System.out.println("12: "+Pattern.matches(, "abcde")); //True
    System.out.println("13: "+Pattern.matches(, "abcde123")); //False

    /* Boundary Matchers example; * use ^ and $
       returns true if "These" is the beginning and the end of the string
    */
    System.out.println("14: "+Pattern.matches(, "These are regular expressions")); //False
    System.out.println("15: "+Pattern.matches(, "These")); //True
    System.out.println("16: "+Pattern.matches(, "are regular expressions")); //False
    }
}
```
