package TestNG.Lecture8;

import org.testng.annotations.Test;

public class GroupingClass3 {
	//@Test(groups="group1")
	public void GClass8() {
		System.out.println("Group1 Function8");
		}
		//@Test(groups="group1")
		public void GClass2() {
		System.out.println("Group1 Function10");
		}
		//@Test(groups="group2")
		public void GFunc1() {
			System.out.println("GroupingFunction 9");
		}
		//@Test(groups="group2")
		public void GFunc2() {
			System.out.println("GroupingFunction 11");
		}
}
