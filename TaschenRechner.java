import javax.swing.JOptionPane;

/**
 * Das ist der einfache Java Taschenrechenr.
 * @author noawp
 * @version 2024-2-15
 */

public class TaschenRechner {
    public static void main(String[] args) { //Methode

        JOptionPane.showMessageDialog(null, "Willkommen beim einfachen Java Taschenrechner. Folgende Rechenoperationen sind gültig: (+ , - , * , / , Modulo , Hypothenuse , Wurzel , Exponent)", "Löffel-Rechner", JOptionPane.INFORMATION_MESSAGE);
        String operation = JOptionPane.showInputDialog(null, "Rechenoperation: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE);

        if (operation.equalsIgnoreCase("+") || operation.equalsIgnoreCase("Addition")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Summe
            double addition = zahl1 + zahl2;
            JOptionPane.showMessageDialog(null, "Die Summe ist : " + addition);
        } else if (operation.equalsIgnoreCase("-") || operation.equalsIgnoreCase("Subtraktion")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Differenz
            double subtraktion = zahl1 - zahl2;
            JOptionPane.showMessageDialog(null, "Die Differenz ist : " + subtraktion);
        } else if (operation.equalsIgnoreCase("*") || operation.equalsIgnoreCase("Multiplikation")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Multiplikation
            double multiplikation = zahl1 * zahl2;
            JOptionPane.showMessageDialog(null, "Das Produkt ist : " + multiplikation);
        } else if (operation.equalsIgnoreCase("/") || operation.equalsIgnoreCase("Division")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Division
            double division = zahl1 / zahl2;
            JOptionPane.showMessageDialog(null, "Die Division ergibt : " + division, "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        } else if (operation.equalsIgnoreCase("%") || operation.equalsIgnoreCase("Modulo")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output des Modulo-Wertes
            double modulo = zahl1 % zahl2;
            JOptionPane.showMessageDialog(null, "Die Modulo-Wert ist : " + modulo, "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        } else if (operation.equalsIgnoreCase("Hypothenuse")) {
            //Input Zahl 1 und Zahl 2
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 2: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Hypotenuse
            double hypothenuse = Math.sqrt(zahl1 * zahl1 + zahl2 * zahl2);
            JOptionPane.showMessageDialog(null, "Die Hypothenuse ist : " + hypothenuse, "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        } else if (operation.equalsIgnoreCase("Wurzel")) {
            //Input Zahl 1
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl 1: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnen und Output der Wurzel
            double wurzel = Math.sqrt(zahl1);
            JOptionPane.showMessageDialog(null, "Die Wurzel ist : " + wurzel, "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (operation.equalsIgnoreCase("Exponent")) {
            //Input Zahl1 und Exponent
            double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Zahl: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));
            double exponent = Double.parseDouble(JOptionPane.showInputDialog(null, "Exponent: ", "Taschenechner", JOptionPane.INFORMATION_MESSAGE));

            //Berechnung und Output der Zahl
            double ergebnis = Math.pow(zahl1, exponent);
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis, "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        }

        //Falls kein Gültiger Rechenoperator
        else {
            JOptionPane.showMessageDialog(null, "Kein gültiger Rechenoperator. Die Anwendung wird geschlossen.", "Taschenechner", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}