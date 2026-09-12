package com.epau.utilities.swing;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.extras.FlatSVGIcon.ColorFilter;
import org.jetbrains.annotations.NonNls;

import java.awt.Color;

@NonNls
public interface Icons {

	String ERROR_ICON_PATH     = "com/epau/utilities/swing/icons/svgrepo/error-svgrepo-com.svg";
	String WARNING_ICON_PATH   = "com/epau/utilities/swing/icons/svgrepo/warning-filled-svgrepo-com.svg";
	String INFO_ICON_PATH      = "com/epau/utilities/swing/icons/svgrepo/info-svgrepo-com.svg";

	static FlatSVGIcon error(int size) {
		return newIcon(ERROR_ICON_PATH, Colors.ERROR, size);
	}

	static FlatSVGIcon warning(int size) {
		return newIcon(WARNING_ICON_PATH, Colors.WARNING, size);
	}

	static FlatSVGIcon info(int size) {
		return newIcon(INFO_ICON_PATH, Colors.INFO, size);
	}

	private static FlatSVGIcon newIcon(String location, Color color, int size) {
		return new FlatSVGIcon(location, size, size).setColorFilter(new ColorFilter(_ -> color));
	}
}
