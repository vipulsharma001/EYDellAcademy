package com.interfaceExplained;

public class IndianTeam implements ISports {

	@Override
	public void setVenue(String place) {
		String teamName = "Pakistan";
		System.out.println("Visiting Team is :" + teamName);
		
	}

	@Override
	public void setVisitingTime(String place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHomeTeam(String place) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		IndianTeam obj = new IndianTeam();
		obj.setHomeTeam("Australia");
	}
	
}
