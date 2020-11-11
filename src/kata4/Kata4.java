package kata4;

import kata4.view.MailHistrogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.persitence.file.MailListReader;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        
        String fileName = new String("email.txt");
        List<Mail> mailList =MailListReader.read(fileName);
        
        
        Histogram<String> mailhistogram = MailHistrogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM",mailhistogram);
        histogramDisplay.execute();
    }
    
}
