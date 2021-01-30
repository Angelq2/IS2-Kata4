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
    
    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> histo;
    private static HistogramDisplay histoDisplay;
    
    public static void main(String[] args) throws Exception {
        execute();
    }
    
      public static void execute() throws Exception {
        input();
        process();
        output();
    }

    public static void input() {
        try {
            fileName = new String("C:\\Users\\angel\\OneDrive\\Documentos\\NetBeansProjects\\Kata4\\txtFileEmail\\email.txt");
            mailList = MailListReader.read(fileName);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el fichero");
        }
    }

    public static void process() {
        histo = MailHistogramBuilder.build(mailList);
    }

    public static void output() {
        histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
    }        

}
 
  
