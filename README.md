![alt tag](http://www.talkevent.de/wp-content/uploads/2015/07/talkevent_altern_logo_noclaim.png)

# TalkeventSDK

Mit Hilfe des TalkeventSDK können Sie die Video-Chat-Funktion von talkevent in Ihre Android-App einbauen. Die Benutzer Ihrer App können dann direkt über ihr Android-Gerät per Videochat mit Ihren Beratern in Kontakt treten.
Dazu müssen Sie registrierter Partner von talkevent sein. Weitere Informationen finden Sie unter https://www.talkevent.de.

## jCenter Installation

Das Framework wird über jCenter (https://jcenter.bintray.com) eingebunden.

// TODO: coming

## Manual installation
1. Add the file "android-talkevent-sdk.aar" to your /libs directory

2. Add it to your app dependencies in the "build.gradle file". Make sure the /libs directory is included in the fileTree

<pre><code>
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    ...
    compile(name:'android-talkevent-sdk', ext:'aar')
}
</code></pre>

## Abhängigkeiten

Das TalkeventSDK benötigt mindestens Android 4.4.

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

You may experience issues when building the app due to a conflict with strings replacement. It can be fixed following these steps:

1. Add the xmlns:tools line in the manifest tag

<code>
xmlns:tools="http://schemas.android.com/tools"
</code>

2. Add tools:replace in the application tag

<code>
tools:replace="android:label"
</code>