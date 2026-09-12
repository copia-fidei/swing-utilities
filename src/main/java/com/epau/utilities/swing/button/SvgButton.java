package com.epau.utilities.swing.button;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import org.jetbrains.annotations.NonNls;

import javax.swing.JButton;
import java.awt.Insets;

public class SvgButton extends JButton {

	/// @param name – the name of the SVG resource (a '/'-separated path; e.g. "com/myapp/myicon.svg")
	/// @param size – the height and width of the icon
	@NonNls
	public SvgButton(String name, int size) {
		super(new FlatSVGIcon(name, size, size));

		setMargin(new Insets(0, 0, 0, 0));
	}
}