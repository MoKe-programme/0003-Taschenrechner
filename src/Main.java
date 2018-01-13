import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		char rechenart = JOptionPane.showInputDialog("Möchtest du '+' '-' '*' oder '/' rechnen").charAt(0);
		double wert1 = Double.parseDouble(JOptionPane.showInputDialog("Bitte gebe hier die erste Zahl ein"));
		double wert2 = Double.parseDouble(JOptionPane.showInputDialog("Bitte gebe hier die zweite Zahl ein"));
		double ergebnis = 0;
		if(rechenart == '+') ergebnis = wert1 + wert2;
		if(rechenart == '-') ergebnis = wert1 - wert2;
		if(rechenart == '*') ergebnis = wert1 * wert2;
		if(rechenart == '/') ergebnis = wert1 / wert2;
		JOptionPane.showMessageDialog(null, "Das Ergebnis der Rechnung ist " + ergebnis, "Wir haben über dein Ergebnis abgestimmt, es lautet", JOptionPane.OK_OPTION);
	}

}
