package com.hawk.c01.custom.design_pattern.null_object;

public class NullObject extends Project {
	public boolean isNull() {
		return true;
	}
	public double getCost() {
		return 0.0;
	}
	public static void main(String[] args) {
		Project prj=new Project();
		Project plan=new NullObject();
		System.out.println(prj.getProjectId());
		
//		if (prj.getProjectId()==null) {
//			plan.setCost(0.0);
//		}else {
//			plan.setCost(prj.getCost());
//		}
		
//		if (prj.isNull()) {
//			plan.setCost(0.0);
//			System.out.println("1");
//		}else {
//			plan.setCost(prj.getCost());
//			System.out.println("2");
//		}
		plan.setCost(prj.getCost());
		
		System.out.println(plan.getCost());
	}
}

class Project {
	private double cost;
	private String projectId;

	public boolean isNull() {
		return false;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
