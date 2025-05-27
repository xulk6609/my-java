public class Puppy {
  private int age;
  private String name;

  // 构造器
  public Puppy(String name) {
    this.name = name;
    System.out.println("名字是：" + name);
  }

  // 设置 age 的值
  public void setAge(int age) {
    this.age = age;
  }

  // 获取 age 的值
  public int getAge() {
    return age;
  }

  // 获取 name 的值
  public String getName() {
    return name;
  }

  // 主方法
  public static void main(String[] args) {
    // 创建对象
    Puppy myPuppy = new Puppy("xxy");

    // 通过方法来设定 age
    myPuppy.setAge(2);

    // 调用另一个方法来获取age
    int age =  myPuppy.getAge();
    System.out.println("年龄为：" + age);
    
    // 直接访问成员变量
    System.out.println("变量值" + myPuppy.getAge());
  }
}