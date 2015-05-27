package Variables;

public class Schedule {

	static String[] course = new String[8];
	static String[] teacher = new String[8];
	
	public static void main(String[] args) {
		
		 course[0] = "English III";
		 course[1] = "Precalculus";
		 course[2] = "Music Theory";
	     course[3] = "Biotechnology";
	     course[4] = "Principles of Technology I";
	     course[5] = "Latin II";
	     course[6] = "AP US History";
	     course[7] = "Business Computer Infomation Systems";
	   
	     teacher[0] = "Ms. Lapan";
	     teacher[1] = "Mrs. Gideon";
	     teacher[2] = "Mr. Davis";
	     teacher[3] = "Ms. Palmer";
	     teacher[4] = "Ms. Garcia";
	     teacher[5] = "Mrs. Barnett";
	     teacher[6] = "Ms. Johannessen";
	     teacher[7] = "Mr. James";		 
	     
	     for(int i=0;i<8;i++)
	     	{
	    	 System.out.println(i + "      "  + course[i]  +"                 " + teacher[i]);
	     	}	     
	     
	}
}
