module com.epau.util.swing {
	requires java.desktop;

	requires org.jetbrains.annotations;
	requires com.formdev.flatlaf.extras;
	requires com.github.weisj.jsvg;

	requires com.epau.util.nls;

	opens com.epau.util.swing.icons.svgrepo;
	opens com.epau.util.swing.option_dialog to com.epau.util.nls;

	exports com.epau.util.swing.option_dialog;
	exports com.epau.util.swing.frame;
	exports com.epau.util.swing.text;
	exports com.epau.util.swing.toast;
	exports com.epau.util.swing.button;

}