package comm.ex;



public class hello {

	public class date{
		private int month;
		public void setmonth(int month){
			this.month=month;
			
			
			}
		public void days()
		{
		if (month==1 || month ==3 ||month==5 || month ==7 ||month==8 || month ==10 || month==11| month==12)
		{
		System.out.println("31 days");
		}
		else if (month ==4 ||month==6 || month ==9)
		{
		System.out.println("30 days");
		} else if (month==2)
		{
		System.out.println("29 or 28 days");
		}  else
		{ System.out.println("Invalid");
		}
		}
		}
}
