package com.Class23;

public class ScrumTeam extends Employee {
	
	public String artifacts;
	public String ceremonies;
	
	public void workONArtifacts() {
		System.out.println("Srum team work on "+artifacts);
	}
	public void attendScrumMeeting() {
		System.out.println("Scrum team attends "+ceremonies);
	}

}
