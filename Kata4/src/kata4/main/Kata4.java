package kata4.main;

import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

	public static void main(String[] args) {
		
		final String filename = "email.txt";
		
		Histogram<String> histogram = MailHistogramBuilder
				.build(MailListReader.read(filename));
		
		HistogramDisplay display = new HistogramDisplay(histogram);
		
		display.execute();

	}

}