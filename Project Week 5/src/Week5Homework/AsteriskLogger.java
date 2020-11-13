package Week5Homework;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String x) {
		 
		System.out.println("***" + x + "***");
		System.out.println();
	}

	@Override
	public void Error(String Er ) {
		
		StringBuilder printAsterisk = new StringBuilder();
		for (int i = 0; (i < (Er.length() + 6)); i++) {
			
			printAsterisk.length();
			System.out.print("*");
		}
		
		 System.out.println();
		 System.out.println("***" + Er + "***");

			StringBuilder printLineAsterisk = new StringBuilder();
			for (int i = 0; (i < (Er.length() + 6)); i++) {
			System.out.print(printLineAsterisk + "*");
	 
		}
			
			
//			
//			
//			

//			printLineAsterisk.append("*");	 
//			System.out.println();	
			
			}

	  
		
	}
 
 
