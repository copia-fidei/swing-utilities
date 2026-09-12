module com.epau.utilities.swing {
	requires java.desktop;

	requires org.jetbrains.annotations;
	requires com.formdev.flatlaf.extras;
	requires com.github.weisj.jsvg;

	requires com.epau.utilities.nls;

	opens com.epau.utilities.swing.icons.svgrepo;
	opens com.epau.utilities.swing.option_dialog to com.epau.utilities.nls;

	exports com.epau.utilities.swing.option_dialog;
	exports com.epau.utilities.swing.frame;
	exports com.epau.utilities.swing.text;
	exports com.epau.utilities.swing.toast;
	exports com.epau.utilities.swing.button;

}