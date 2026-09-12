module com.epau.utilities.swing {
	requires java.desktop;

	requires org.jetbrains.annotations;
	requires com.epau.utilities.nls;

	opens com.epau.utilities.swing.option_dialog to com.epau.utilities.nls;

	exports com.epau.utilities.swing.option_dialog;
	exports com.epau.utilities.swing.test;
	exports com.epau.utilities.swing.text;

}