package TestNG.Lecture8;

import org.testng.annotations.Test;

public class GroupingClass2 {
//@Test(groups="group1")
	public void GClass4() {
		System.out.println("Group1 Function16");
		}
//@Test(groups="group1")
		public void GClass2() {
		System.out.println("Group1 Function6");
		}
//@Test(groups="group2")
		public void GFunc5() {
			System.out.println("GroupingFunction 5");
		}
//@Test(groups="group2")
		public void GFunc7() {
			System.out.println("GroupingFunction 7");
		}
}
