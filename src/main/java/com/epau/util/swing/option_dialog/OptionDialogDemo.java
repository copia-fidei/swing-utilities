package com.epau.util.swing.option_dialog;

import com.epau.util.swing.frame.TestFrames;
import org.jetbrains.annotations.NonNls;

import java.util.List;

class OptionDialogDemo {

	static void main() {
		@NonNls var options = List.of(
				new Option(
						"install",
						"Install the application",
						"Install the application on this computer"
				),
				new Option(
						"repair",
						"Repair the installation",
						"Repair the existing installation"
				),
				new Option(
						"uninstall",
						"Uninstall the application",
						"Remove the application from this computer"
				)
		);
		TestFrames.showDialog(
				"OptionDialog Demo", //NON-NLS
				parent -> new OptionDialog(
						parent,
						"Choose an action", //NON-NLS
						"Please select what you would like to do:", //NON-NLS
						options,
						options.getFirst()
				)
		);
	}
}