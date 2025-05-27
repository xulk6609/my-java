// import java.io.*;

public class EmployeeTest {
  public static void main(String[] args) {
    // 使用构造器创建两个对象
    Employee empOne = new Employee("xxy1");
    Employee empTwo = new Employee("xxy2");

    // 调用两个对象的成员方法
    empOne.setAge(26);
    empOne.setDesignation("高级程序员");
    empOne.setSalary(100000);
    empOne.printEmployee();

    empTwo.setAge(21);
    empTwo.setDesignation("菜鸟程序员");
    empTwo.setSalary(500);
    empTwo.printEmployee();
  }
}