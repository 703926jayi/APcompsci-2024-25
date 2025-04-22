// An electric car that runs on batteries must be periodically recharged for a certain number of hours. The battery technology in the car requires that the charge time not be interrupted.

// The cost for charging is based on the hour(s) during which the charging occurs. A rate table lists the 24 one-hour periods, numbered from 0 to 23, and the corresponding hourly cost for each period. The same rate table is used for each day. Each hourly cost is a positive integer. A sample rate table is given below.



// The class BatteryCharger below uses a rate table to determine the most economic time to charge the battery. You will write two of the methods for the BatteryCharger class.

// Write the BatteryCharger method getChargingCost that returns the total cost to charge a battery given the hour at which the charging process will start and the number of hours the battery needs to be charged.

// For example, using the rate table given at the beginning of the question, the following table shows the resulting costs of several possible charges.

// Write the BatteryCharger method getChargingCost that returns the total cost to charge a battery given the hour at which the charging process will start and the number of hours the battery needs to be charged.

// For example, using the rate table given at the beginning of the question, the following table shows the resulting costs of several possible charges.

//Assume that getChargingCost works as specified, regardless of what you wrote in part (a). Complete method getChargeStartTime below.

public class BatteryCharger {
	
	private int[] rateTable;
	
	public void setTable(int[] table)
	{
		rateTable=table;
	}
	
	private int getChargingCost(int startHour, int chargeTime)
	{
		int totalCost=0;
		for(int i=0;i<chargeTime;i++)
		{
			totalCost+=rateTable[(startHour+i)%24];
		}
		return totalCost;
	}
	
	public int getChargeStartTime(int chargeTime)
	{
		int cost=getChargingCost(0,chargeTime);
		int time=0;
		
		for(int i=1;i<24;i++)
		{
			if(getChargingCost(i,chargeTime)<cost)
			{
				cost=getChargingCost(i,chargeTime);
				time=i;
			}
		}
		return time;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] table={50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
		BatteryCharger bc=new BatteryCharger();
		bc.setTable(table);
		System.out.println(bc.getChargingCost(22,30));
		System.out.println(bc.getChargeStartTime(30));
		
	}

}