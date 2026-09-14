package com.epau.util.swing.button;

import com.epau.util.swing.Icons;
import com.epau.util.swing.frame.TestFrames;

class SvgButtonDemo {

    static void main() {
		TestFrames.showComponent("SvgButton Demo", new SvgButton(Icons.INFO_ICON_PATH, 256)); //NON-NLS
    }
}