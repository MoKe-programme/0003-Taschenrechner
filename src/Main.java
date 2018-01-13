import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		char rechenart = JOptionPane.showInputDialog("Möchtest du '+' '-' '*' oder '/' rechnen").charAt(0);
		String rawwert1 = JOptionPane.showInputDialog("Bitte gebe hier die erste Zahl ein");
		rawwert1 = rawwert1.replace(',', '.');
		double wert1 = Double.parseDouble(rawwert1);
		String rawwert2 = JOptionPane.showInputDialog("Bitte gebe hier die zweite Zahl ein");
		rawwert2 = rawwert2.replace(',', '.');
		double wert2 = Double.parseDouble(rawwert2);
		double ergebnis = 0;
		if(rechenart == '+') ergebnis = wert1 + wert2;
		if(rechenart == '-') ergebnis = wert1 - wert2;
		if(rechenart == '*') ergebnis = wert1 * wert2;
		if(rechenart == '/') ergebnis = wert1 / wert2;
		JOptionPane.showMessageDialog(null, "Das Ergebnis der Rechnung ist " + ergebnis, "Wir haben über dein Ergebnis abgestimmt", JOptionPane.OK_OPTION);
	}

}