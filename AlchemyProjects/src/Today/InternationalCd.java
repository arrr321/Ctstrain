package Today;

public class InternationalCd extends CD{
	
	private String lang;
	
	public  InternationalCd()
	{
		
		super();
	}
	 public InternationalCd(int cdid , String cdName ,String genre ,double price ,  String lang ) {
		 
		 
		 super(cdid , cdName , genre , price );
		 this.lang=lang;
		 
	 }
	
	
	

}
