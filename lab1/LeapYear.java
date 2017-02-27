// A leap year is either:
// divisible by 400 or
// divisible by 4 and not by 100.

public class LeapYear{
	public static void main(String[] args){
		int Year = 200;
		if(Year % 400 ==0){
			System.out.println(Year + " is a leap year");
		}else{
			if(Year % 4 != 0){
			System.out.println(Year + " is not a leap year");
			}else if(Year % 100 != 0){
			System.out.println(Year + " is a leap year");
			}else{
			System.out.println(Year + " is not a leap year");
			}
		}
		

		
	

	}
}