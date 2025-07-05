# java

## 输入数据流

是指只能读不能写的数据流，用于向计算机内输入信息而用

## 简述一个类中的信息包括哪些部分

1. 字段摘要
2. 构造方法摘要
3. 方法摘要
4. 字段详细信息
5. 构造方法详细信息
6. 方法详细信息

## 简述在java中要转换对象引用时须做的检查

1. 向上转化总是合理的，
2. 向下转化则只能父类向子类转化，其他类之间的转化是不允许的
3. 编译器检查正确后，需在运算时检查引用类型

## 简述swing中的四种顶层容器及其功能

1. JFrame： 创建一个带有标题行和控制按钮的窗口
2. JApplet: 创建小应用程序时使用，嵌入在浏览器中
3. JWindow: 创建一个没有标题行和控制按钮的窗口，通常很少使用
4. JDialog: 创建一个对话框

## 简述创建通信通道的步骤

1. 建立输入数据流
2. 建立输出数据流
3. 将输入输出数据流连接起来

## 简述java语言程序运行中可能遇到的两种错误分类

1. 致命性的错误：即程序出现非常严重的不正常错误，无法简单的恢复运行
2. 非致命性的错误：程序经过修正后可以正常执行

## 简答题：简述字节码校验器检查的内容。

1. 类是否遵从JVM的类文件格式
2. 不出现访问违例情况
3. 代码不会引起运算栈溢出
4. 所有运算代码的参数类型总是正确的
5. 不会发生非法数据转换
6. 对象域访问是合法的

## 简述在哪些情况下会使用异常机制

1. 网络错误，文件不存在
2. 在项目中使用统一的方式处理异常
3. 处理在方法，类库，类中抛出的异常时
4. 处理可能发生的故障
5. 当方法因无法控制的原因而不能完成任务时
6. 编写文字处理器一类的程序时

## 简答题：简述运行Applet需要的步骤。

1. 创建一个HTML文件
2. 在文件中使用<applet>标记 指定要运行的Applet程序名称，将html url路径发送给浏览器
3. 通过浏览器装入并运行

## 简答题：简述创建一个新的File对象的三种构造方法

1. File myFile
myFile = new File('a')

2. myFile = new File('/', 'a')

3. File fileDir = new File('/')
myFile = new File(fileDir, 'a')

## System.arraycopy

```arraycopy
src：源数组
  srcPos：源数组中要复制的起始位置
  dest：目标数组
  destPos：目标数组的起始插入位置
  length：要复制的元素数量
```

```js
public class test2 {
    public static void main(String[] args) {
        int[] src = {12, 2, 33, 54};
        int[] dest = new int[5];

        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.print("My:");

        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + ","); // 输出：12,2,33,54,0
        }
    }
}
```

````js
/* 程序设计题：请编写方法int searchMaxNumIndex(int []a)，该方法的功能是返回已知数组中最大数的下标。 */

int searchMaxNumIndex(int []a) {
  int maxNum = a[0];
  int maxIndex = 0
  for(int i = 0; i < a.length; i++) {
    if(a[i] > maxNum) {
      maxNum = a[i]
      maxINdex = i
    }
    return maxIndex
  }
}

```