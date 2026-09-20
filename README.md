Reusable Java Swing classes.

# Classes
- Toast: A toast UI component.
- StatusBar: A variation of the toast UI component with predefined icons: info, warning, and error. 
- OptionDialog: A modal choice dialog similar to JOptionPane. The user selects via radio buttons.
- SVGButton: A button with an SVG icon.
- TestFrames: Instantiate JFrames without the boilerplate.

# Build
```bash
mvn package
```

# Run demos
Run these demos from your IDE or from the command line (Java 25 must be installed):
```bash
mvn exec:exec -Ddemo.module.mainClass=com.epau.util.swing/com.epau.util.swing.toast.StatusBarDemo
mvn exec:exec -Ddemo.module.mainClass=com.epau.util.swing/com.epau.util.swing.option_dialog.OptionDialogDemo
mvn exec:exec -Ddemo.module.mainClass=com.epau.util.swing/com.epau.util.swing.button.SvgButtonDemo
```