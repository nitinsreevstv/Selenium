package selenium;
import java.time.LocalDate;
public class calender {

	public static void main(String[] args) {
		        int year = 2023;
		        int month = 6;
		        
		        printCalendar(year, month);
		    }

		    public static void printCalendar(int year, int month) {
		        LocalDate date = LocalDate.of(year, month, 1);
		        int daysInMonth = date.lengthOfMonth();
		        int startDay = date.getDayOfWeek().getValue();

		        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

		        for (int i = 0; i < startDay; i++) {
		            System.out.print("     ");
		        }

		        for (int day = 1; day <= daysInMonth; day++) {
		            System.out.printf("%5d", day);

		            if ((day + startDay) % 7 == 0 || day == daysInMonth) {
		                System.out.println();
		            }
		        }
		    }
		}
