# Advanced Programming - Laboratory 6

## Tasks
```text
GeometryDrawing
Create an application with graphical user interface for creating images (layouts) containing standard or custom geometric figures: diamonds, trapezes, regular polygons, snow flakes, etc.
You may use either Swing or JavaFX.

The main specifications of the application are:

```
COMPULSORY
```text
Create the following components:

The main frame of the application.
A configuration panel for introducing parameters regarding the shapes that will be drawn: the size, the number of sides, the stroke, etc.
The panel must be placed at the top part of the frame. The panel must contain at least one label and one input component for specifying the size of the component.
A canvas (drawing panel) for drawing various types of shapes. You must implement at least one shape type at your own choice. This panel must be placed in the center part of the frame.
When the users execute mouse pressed operation, a shape must be drawn at the mouse location. You must use the properties defined in the configuration panel (at least one) and generate random values for others (color, etc.).
A control panel for managing the image being created. This panel will contains the buttons: Load, Save, Reset, Exit and it will be placed at the bottom part of the frame.
Use a file chooser in order to specify the file where the image will be saved (or load).

```
OPTIONAL
```text
Implement a retained mode drawing and add support for deleting shapes.
Add support for drawing multiple types of components. Consider creating a new panel, containing a list of available shapes.
The configuration panel must adapt according to the type of the selected shape. Implement at least two types of shapes.
Implement free drawing and a simple shape recognition algorithm, capable of recognizing at least lines and circles.

```

## Solved tasks

As of today (28.03.2021) I have solved all tasks regarding the compulsory task.
## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output

I have included a mp4 demo in the demo directory.