package inheritance;

public class Checkboolean {

	
	    static boolean flag(boolean a, boolean b) {
//	        (true,true) print false
//	        (false,true) print true
//	        (true,false) print false
//	        (false,false) print true
	        boolean c=false;
	        if(a==true&&b==true) {
	            c=false;
	        }else if(a==false&&b==true) {
	            c=true;
	        }else if(a==true&&b==false) {
	            c=false;
	        }else if(a==false&&b==false) {
	            c=true;
	        }
	        return c;
	    }

	    public static void main(String[] args) {
	        System.out.println(flag(true, false));
	    }
	    
	}