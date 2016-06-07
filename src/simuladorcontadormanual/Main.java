/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorcontadormanual;

import Gui.MainForm;
import contadormanual.ContadorManual;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainForm windows =new MainForm();
        windows.setTitle("Simulador de Contador Manual ");
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
    
    }
}
