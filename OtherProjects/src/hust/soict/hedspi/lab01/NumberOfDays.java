package hust.soict.hedspi.lab01;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class NumberOfDays {
	
	public static void main(String[] args) {
		
		String strYear = JOptionPane.showInputDialog("Enter year:");
		String strMonth = JOptionPane.showInputDialog("Enter month:");
		
		int year = Integer.parseInt(strYear);
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
		int[] numDays = {31, (isLeapYear?29:28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[][] aliases = new String[12][4];
		String[] names = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
		for (int i=0; i<12; i++) {
			aliases[i][0] = String.valueOf(i+1);
			aliases[i][1] = names[i];
			aliases[i][2] = aliases[i][1].substring(0,3);
			aliases[i][3] = (i>=4 && i<=6) ? aliases[i][1] : (i==8 ? aliases[i][2] + "t." : aliases[i][2] + ".");
		}
		
		boolean found = false;
		for (int i=0; i<12; i++) {
			List<String> list = Arrays.asList(aliases[i]);
			if (list.contains(strMonth.toLowerCase())) {
				JOptionPane.showMessageDialog(null, "There\'s " + numDays[i] + " days in this month.");
				found = true;
				break;
			}
		}
		if (!found) {
			JOptionPane.showMessageDialog(null, "Cannot resolve the month you entered.");
		}
		
		System.exit(0);
	}
}
