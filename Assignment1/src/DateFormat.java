import javax.swing.JOptionPane;
public class DateFormat{

	/**Objective: to change the original format month/day/year 
	 * to a new format day.month.year
	 * Summary: String dateString = JOptionPane.showInputDialog is prompt for some input in thie case 
	 * "Enter a date in the format month/day/year.\n" and "I will output the date in the format day.month.year.\n"
	 * dateString = dateString.replaceAll("[0-12]+)/([0-12]+"), "$2/$1" means String dateString will switches the day and month 
	 * and dateString = dateString.replace('/','.'); replaces the slashes with dots. 
	 *
	 * @Sarah Y Park 
	 */
	public static void main(String[] args) {
		
		String dateString = JOptionPane.showInputDialog(
				"Enter a date in the format month/day/year.\n" +
				"I will output the date in the format day.month.year\n");
		dateString = dateString.replaceAll("([0-12]+)/([0-12]+)","$2/$1");
		dateString = dateString.replace("/",".");
	
		JOptionPane.showMessageDialog(null, dateString +
				"converts to:" + "day" + "." + "month" + "." + "year");
		System.exit(0);
		
	}

}