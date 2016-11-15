![alt tag](http://www.talkevent.de/wp-content/uploads/2015/07/talkevent_altern_logo_noclaim.png)

# TalkeventSDK

Mit Hilfe des TalkeventSDK können Sie die Video-Chat-Funktion von talkevent in Ihre Android-App einbauen. Die Benutzer Ihrer App können dann direkt über ihr Android-Gerät per Videochat mit Ihren Beratern in Kontakt treten.
Dazu müssen Sie registrierter Partner von talkevent sein. Weitere Informationen finden Sie unter https://www.talkevent.de.

## Maven Installation

1. Add the following Maven repository to your build.gradle file in the root directory of the project:
<pre><code>
repositories {
       maven {
           url 'https://github.com/talkevent-gmbh/android-sdk/raw/master/mvn-repo'
       }
   }
</code></pre>

2. Then add the module dependency in your app's build.gradle file:
<pre><code>
dependencies {
    compile 'de.talkevent:talkevent-sdk:{release tag}'
}
</code></pre>


## Installation
1. Fügen Sie die Datei "android-talkevent-sdk.aar" zu dem /libs Ordner Ihres Projektes hinzu.
2. Fürgen Sie das Framework zu den dependenceis in der Datei "build.gradle file" hinzu. Bitte stellen Sie sicher, dass der /libs Ordner in dem fileTree enthalten ist.

<pre><code>
dependencies {
    compile(name:'android-talkevent-sdk', ext:'aar')
}
</code></pre>

## Abhängigkeiten

Das TalkeventSDK benötigt mindestens Android 4.4.
Die Integration wurde mit Android Studio und Gradle getestet. 

## Anbindung 

### Start des Videochats

Nach erfolgreicher Einbindung können Sie in Ihrer App nun an beliebiger Stelle einen Button einfügen, über welchen der Videochat mit dem Berater gestartet werden kann. 

In dem ViewController muss das Framework zunächst mit folgendem Befehl importiert werden:

<code>
import de.talkevent.android_sdk.Models.TalkeventSDK;
</code>

Anschließend kann das Framework in Ihrem ViewController instanziiert und gestartet werden.

<pre><code>
TalkeventSDK talkevent = new TalkeventSDK(thisActivity);
talkevent.open()
</code></pre>

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

<code>
xmlns:tools="http://schemas.android.com/tools"
</code>

2. Fürgen Sie `tools:replace` in das "application"-Tag ein:

<code>
tools:replace="android:label"
</code>
