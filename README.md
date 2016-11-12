![alt tag](http://www.talkevent.de/wp-content/uploads/2015/07/talkevent_altern_logo_noclaim.png)

# TalkeventSDK

Mit Hilfe des TalKEventSDK können Sie die Video-Chat-Funktion von talkevent in Ihre Android-App einbauen. Die Benutzer Ihrer App können dann direkt über ihr iOS-Gerät per Videochat mit Ihren Beratern in Kontakt treten.
Dazu müssen Sie registrierter Partner von talkevent sein. Weitere Informationen finden Sie unter https://www.talkevent.de.

## Installation

Das Framework wird über jCenter (https://jcenter.bintray.com) eingebunden.


## Abhängigkeiten

Das TalkEventSDK benötigt mindestens Android 4.4

## Anbindung 



### Start des Videochats

Nach erfolgreicher Einbindung können Sie in Ihrer App nun an beliebiger Stelle einen Button einfügen, über welchen der Videochat mit dem Berater gestartet werden kann. 

In dem ViewController muss das Framework zunächst mit folgendem Befehl importiert werden:

<code>
import de.talkevent.android_sdk.Models.TalkeventSDK;
</code>

Anschließend kann das Framework in Ihrem ViewController instanziiert und gestartet werden.

<code>
TalkeventSDK talkevent = new TalkeventSDK(thisActivity);
talkevent.open()
</code>


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
<manifest
    ...
    xmlns:tools="http://schemas.android.com/tools">
</code>

2. Add tools:replace in the application tag

<code>
<application
        ...
        tools:replace="android:label">
</code>