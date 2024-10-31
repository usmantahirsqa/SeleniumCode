package TestNG.Lecture8;

import org.testng.annotations.Test;

public class GroupingClass4 {
	//@Test(groups="group1")
	public void GClass12() {
		System.out.println("Group1 Function12");
		}
		//@Test(groups="group1")
		public void GClass14() {
		System.out.println("Group1 Function14");
		}
		//@Test(groups="group2")
		public void GFunc12() {
			System.out.println("GroupingFunction 13");
		}
		//@Test(groups="group2")
		public void GFunc14() {
			System.out.println("GroupingFunction 15");
		}
}
