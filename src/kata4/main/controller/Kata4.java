package kata4.main.controller;

import kata4.view.HistogramDisplay;
import kata4.model.Histogram;

/**
 * Representación gráfica de un Histograma leyendo los datos
 * desde un fichero, compuesto por un conjunto de direcciones
 * email, mostraremos el histograma de los dominios.
 * 
 * @author Ángel 
 */

public class Kata4 {

    public static void main(String[] args) {
        String fileName;
        //<Mail> mailList = new ;
        Histogram<String> histo = new Histogram();
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
    }
    
}
