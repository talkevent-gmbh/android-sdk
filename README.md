![alt tag](http://www.talkevent.de/wp-content/uploads/2015/07/talkevent_altern_logo_noclaim.png)

# TalkeventSDK

Mit Hilfe des TalkeventSDK können Sie die Video-Chat-Funktion von talkevent in Ihre Android-App einbauen. Die Benutzer Ihrer App können dann direkt über ihr Android-Gerät per Videochat mit Ihren Beratern in Kontakt treten.
Dazu müssen Sie registrierter Partner von talkevent sein. Weitere Informationen finden Sie unter https://www.talkevent.de.

## Installation via Gradle

Wir empfehlen die Einbindung über das hier hinterlegte Maven-Repository. 

1. Fügen Sie dieses Repository zu der Liste der Repositories in der Datei gradle.build im Root-Verzeichnis Ihres Projektes hinzu:
```
repositories {
       maven {
           url "https://jitpack.io"
       }
       maven {
           url 'https://github.com/talkevent-gmbh/android-sdk/raw/master/mvn-repo'
       }
   }
```

2. Anschließend fügen Sie das Modul zu den Abhängigkeiten hinzu (ebenfalls in der Datei build.gradle):
```
dependencies {
       compile 'de.talkevent:talkevent-sdk:{release tag}'
}
```

## Manuelle Installation

Alternativ zu obiger Beschreibung können Sie die aar-Datei auch manuell zu Ihrem Projekt hinzufügen. 

1. Laden Sie die aar-Datei der gewünschten Version "talkevent-sdk-{version}.aar" aus dem Ordner "mvn-repo"(https://github.com/talkevent-gmbh/android-sdk/tree/master/mvn-repo/de/talkevent/talkevent-sdk) herunter und fügen Sie diese zu dem /libs Ordner Ihres Projektes hinzu.
2. Fügen Sie das Framework zu den Abhängigkeiten in der Datei build.gradle hinzu. Bitte stellen Sie sicher, dass der /libs Ordner in dem fileTree enthalten ist.

```
dependencies {
    compile(name:'android-talkevent-sdk', ext:'aar')
}
```

## Abhängigkeiten

Das TalkeventSDK benötigt mindestens Android 4.4.
Die Integration wurde mit Android Studio und Gradle getestet. 

## Anbindung 

### Start des Videochats

Nach erfolgreicher Einbindung können Sie in Ihrer App nun an beliebiger Stelle einen Button einfügen, über welchen der Videochat mit dem Berater gestartet werden kann. 

In dem ViewController muss das Framework zunächst mit folgendem Befehl importiert werden:

```java
import de.talkevent.android_sdk.Models.TalkeventSDK;
```

Anschließend kann das Framework in Ihrem ViewController instanziiert und gestartet werden.

```java
TalkeventSDK talkevent = new TalkeventSDK(thisActivity);
talkevent.open()
```

## Einstellungsmöglichkeiten

Das Design des Frameworks lässt sich dem Design Ihrer App anpassen. Hierfür können folgende Eigenschaften gesetzt werden, <b>bevor</b> die Funktion 'talkevent.open()' aufgerufen wird.

Folgende Funktionen stehen hier zur Verfügung:

### setApiUrl

Definieren Sie die URL, die für die API-Anfragen genutzt wird.

### setKurentoRoomUrl

Definieren Sie die Websocket-URL für Ihren Kurento-Room.

### setClientNumber

Zur Anbindung an ein Beraterfenster muss hier eine gültige Mandantennummer (BLZ) oder Lizenzschlüssel des Chat-Raums hinterlegt werden.
<b>Einer dieser Parameter muss eingestellt sein.</b>

### setBackgroundColor

Definieren Sie die Hintergrundfarbe des Frameworks.

### setFontColor

Definieren Sie die Schriftfarbe des Frameworks.

### setConsultantBoxColor

Diese Funktion bezieht sich auf die VideoView und setzt die Farbe der Box in der der Name des verbundende Beraters angezeigt wird.

### setSettingsBtnColor

Diese Funktion bezieht sich auf die VideoView und setzt die Farbe der Buttons für die Einstellungen.

### setCameraOverlayColor

Diese Funktion bezieht sich auf die VideoView und setzt die Farbe der Maske, die erscheint, wenn der Besucher seine Kamera deaktiviert.

### setEndCallBtnColor

Diese Funktion bezieht sich auf die VideoView und setzt die Farbe des Auflege-Button.

## Troubleshooting

Es kann beim Builden der Anwendung zu Problemen mit String-Ersetzungen kommen. Bitte befolgen Sie in diesem Fall folgenden Schritte: 

1. Fürgen Sie die Zeile `xmlns:tools` in das "manifest"-Tag ein

```xml
xmlns:tools="http://schemas.android.com/tools"
```

2. Fürgen Sie `tools:replace` in das "application"-Tag ein:

```xml
tools:replace="android:label"
```
