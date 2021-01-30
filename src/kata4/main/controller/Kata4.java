package kata4.main.controller;

import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 * Representación gráfica de un Histograma leyendo los datos
 * desde un fichero, compuesto por un conjunto de direcciones
 * email, mostraremos el histograma de los dominios.
 * 
 * @author Ángel 
 */

public class Kata4 {

    public static void main(String[] args) throws Exception {
        String fileName = new String("C:\\Users\\angel\\OneDrive\\Documentos\\NetBeansProjects\\Kata4\\txtFileEmail\\email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histo = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
    }
    
}
