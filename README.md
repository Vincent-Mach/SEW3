# Herzlich Willkommen bei SEW3!

## 0. Wichtige Links
* SEW-Repository: [3AHIT Classroom](https://classroom.github.com/a/vPV9zgj9)
* Hilfe bekommst du fast immer hier:
	+ [Stack Overflow](http://stackoverflow.com)

## 1. Source Code Verwaltung mit git

Arbeite folgende Links durch, um mit git bzw. GitHub vertraut zu machen:
* [git - Der einfache Einstieg](https://rogerdudler.github.io/git-guide/index.de.html)
* [git Cheat Sheet](https://rogerdudler.github.io/git-guide/files/git_cheat_sheet.pdf)
* [git für Einsteiger](https://svij.org/blog/2014/10/25/git-fur-einsteiger-teil-1/)
* [GitHub Guide](https://guides.github.com/activities/hello-world/)
* [git Reference](https://git-scm.com/docs)

### 1.1 Git in SEW
Sämtliche Programmierarbeit ist auf GitHub "abzugeben". Sofern Programmieraufgabe gestellt werden, sind diese nach Beendigung der letzten SEW Stunde an diesem Tag in die Repository zu pushen. Selbiges gilt auch für Hausübungen und Projekte.
Dazu ist es notwendig EIN Verzeichnis zu erstellen, wo ALLE IntelliJ/CLion Projekte in Unterordner enthalten sind.

Die Aufgaben sind in eigenen Unterordnern(=Projekten) bereitzustellen. Der Name des Projekts beginnt immer mit dem Kapitel gefolgt von einer fortlaufenen 2-stelligen Nummer, Beispiel: "001-Wiederholung"
Jede Commitmessage beginnt mit dem Datum "031017 - Test Projekt erstellt"

Bei korrekter Konfiguration erkennt auch IntelliJ in den Unterprojekten, dass es unter GIT Kontrolle steht. Die Einstellung findest du unter "Preferences - Version Control" - hier kann das VCS root-Verzeichnis angegeben werden, d.h. das ist euer "IntelliJ"-Ordner, in dem alle Projekte enthalten sind.

### 1.2 Erstelle deine Repository
Deine persönliche Repository für dieses Schuljahr findest du hier: 
* [3AHIT Classroom](https://classroom.github.com/a/vPV9zgj9)


### 1.3 ".gitignore"
git kann mittels der Datei ".gitignore" mitgeteilt werden, welche Dateien bzw. Ordner NICHT unter git-Kontrolle stehen. Das ist natürlich sinnvoll, denn Beispielsweise .class Dateien oder IntelliJ Projekteinstellungen sollten nicht hochgeladen werden.

Daher erstelle eine Datei ".gitignore" im deinem Hauptordner (dort findest du auch einen Ornder ".git") mit folgendem Inhalt:
```
## Java

*.class
*.war
*.ear
hs_err_pid*

## Robovm
robovm-build/

## GWT
war/
html/war/gwt_bree/
html/gwt-unitCache/
.apt_generated/
html/war/WEB-INF/deploy/
html/war/WEB-INF/classes/
.gwt/
gwt-unitCache/
www-test/
.gwt-tmp/

## Android Studio and Intellij and Android in general
android/libs/armeabi/
android/libs/armeabi-v7a/
android/libs/arm64-v8a/
android/libs/x86/
android/libs/x86_64/
android/gen/
.idea/
*.ipr
*.iws
*.iml
out/
com_crashlytics_export_strings.xml

## Eclipse
.classpath
.project
.metadata
**/bin/
tmp/
*.tmp
*.bak
*.swp
*~.nib
local.properties
.settings/
.loadpath
.externalToolBuilders/
*.launch

## NetBeans
**/nbproject/private/
build/
nbbuild/
dist/
nbdist/
nbactions.xml
nb-configuration.xml

## Gradle

.gradle
gradle-app.setting
build/

## OS Specific
.DS_Store
Thumbs.db

# Covers JetBrains IDEs: IntelliJ, RubyMine, PhpStorm, AppCode, PyCharm, CLion, Android Studio and Webstorm
# Reference: https://intellij-support.jetbrains.com/hc/en-us/articles/206544839

# User-specific stuff:
.idea/**/workspace.xml
.idea/**/tasks.xml
.idea/dictionaries

# Sensitive or high-churn files:
.idea/**/dataSources/
.idea/**/dataSources.ids
.idea/**/dataSources.xml
.idea/**/dataSources.local.xml
.idea/**/sqlDataSources.xml
.idea/**/dynamic.xml
.idea/**/uiDesigner.xml

# Gradle:
.idea/**/gradle.xml
.idea/**/libraries

# CMake
cmake-build-debug/

# Mongo Explorer plugin:
.idea/**/mongoSettings.xml

## File-based project format:
*.iws

## Plugin-specific files:

# IntelliJ
out/

# mpeltonen/sbt-idea plugin
.idea_modules/

# JIRA plugin
atlassian-ide-plugin.xml

# Cursive Clojure plugin
.idea/replstate.xml

# Crashlytics plugin (for Android Studio and IntelliJ)
com_crashlytics_export_strings.xml
crashlytics.properties
crashlytics-build.properties
fabric.properties

```

### 1.4 README.md
Erstelle eine Datei <b>README.md</b> mit folgendem Inhalt bzw. ändere eine Datei, sofern sie schon erstellt wurde:
```
# SEW 3 - SJ 2xxx/xx
----
Name: Vorname Nachname
...
```

Damit ist es mir schneller möglich dich mit deinem richtigen Namen zu identifizieren - die Repos kommen beim clonen immer mit deinem GitHub-Usernamen an. Daraus läßt sich unter Umständen nicht schließen, von wem die Arbeit kommt.
