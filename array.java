package studentrecord;


public class array {

public static void main(String arg[])
	    {
	        String names[] = { "Rajesh", "Suresh", "Ramesh", "Kamlesh", "Vignesh" };
	        int marks[] = { 45, 78, 83, 77, 93 };
	        char sections[] = { 'A', 'B', 'A', 'A', 'B' };
	        
	        for(int i = 0; i < names.length; i++)
	        {
	            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
	        }    
	    }
	
}
