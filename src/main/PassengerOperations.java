package main;

import org.junit.internal.runners.model.EachTestNotifier;

public class PassengerOperations {

	
	public int addPassengers(String passengerCount) throws Exception {
		
		String delimiter= ",";
		if(passengerCount.startsWith("//")){
			String[] splitOnNewline = passengerCount.split("\n");
			passengerCount = splitOnNewline[1];
			delimiter = splitOnNewline[0].substring(2);
		}
		
		return addPassengers(passengerCount, delimiter);
	}
	
	
	public int addPassengers(String passengerCount, String delimiter) throws Exception {

		String passengerCountToArray[] = passengerCount.split(delimiter);

		int totalSumOfPassengers = 0;
		if (!passengerCount.isEmpty()) {
			for (int i = 0; i < passengerCountToArray.length; i++){

				String passengerCountString = passengerCountToArray[i];
				if(passengerCountString.contains("\n"))
				{
					String[] splitOnNewLine = passengerCountString.split("\n");
					for (String splittedCount : splitOnNewLine) {
						totalSumOfPassengers += Integer
								.parseInt(splittedCount);
					}
					
				}
				else{
					totalSumOfPassengers += Integer
							.parseInt(passengerCountString);
				}
				
			}

		}
		
		if(totalSumOfPassengers > 100)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw  e;
			}

		return totalSumOfPassengers;
	}

}
