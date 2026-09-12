package com.epau.utilities.swing.button;

import com.epau.utilities.swing.Icons;
import com.epau.utilities.swing.frame.TestFrames;

class SvgButtonDemo {

    static void main() {
		TestFrames.showComponent("SvgButton Demo", new SvgButton(Icons.INFO_ICON_PATH, 256)); //NON-NLS
    }
}