package com.Class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		Employee work= new Employee();
		WaterFallTeam wt=new WaterFallTeam();
		emp.work();
		emp.salary=90000;
		emp.getPaid();
		wt.salary1=90000;

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		st.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeeting();
		st.workONArtifacts();
		
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		FrontEnd end = new FrontEnd();
		BackEnd bend = new BackEnd();
		
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workONArtifacts();
		dev.attendScrumMeeting();
		dev.code();
		end.doHtml();
		bend.doSql();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workONArtifacts();
		qa.attendScrumMeeting();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BussiessAnalyst ba =new BussiessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workONArtifacts();
		ba.attendScrumMeeting();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workONArtifacts();
		sm.attendScrumMeeting();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workONArtifacts();
		po.attendScrumMeeting();
		po.prioritizeBacklog();
		po.talkTheClient();
	}
}
