package Week5Homework;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		StringBuilder spacestring = new StringBuilder();
		
		
		
		for (int i = 0; i < Log.length(); i++) {
			spacestring.append(Log.charAt(i) + " ");
			
		}
		
		System.out.println(spacestring);
	}

	@Override
	public void Error(String Error) {
 		 
		System.out.println(Error.toString()); 
	}

 }
