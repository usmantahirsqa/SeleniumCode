package TestNG.Lecture8;

import org.testng.annotations.Test;

public class GroupingClass1 {
//@Test(groups="group1")
public void GClass4() {
System.out.println("Group1 Function4");
}
//@Test(groups="group1")
public void GClass2() {
System.out.println("Group1 Function2");
}
//@Test(groups="group2")
public void GFunc1() {
	System.out.println("GroupingFunction 1");
}
//@Test(groups="group2")
public void GFunc3() {
	System.out.println("GroupingFunction 3");
}
}
