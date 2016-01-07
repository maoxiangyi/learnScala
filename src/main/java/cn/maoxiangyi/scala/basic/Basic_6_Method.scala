
/**
 * 学习scala中如何定义一个方法
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_6_Method {

  def main(args: Array[String]): Unit = {
    //定义一个main方法
    //1、def 是定义一个方式使用的关键字
    //2、main是方法的名称
    //3、args是参数列表
    //4、Array是参数的类型 String是数组中元素的类型
    //5、Unit是方法的返回值，相当于java中void
    //   方法的返回值类型可以不写，编译器可以自动推断出来，但是对于递归函数，必须指定返回类型

    println(learn("scala"))
  }


  def learn(content: String): String = {
    "我正在学习：" + content

    //定义一个learn方法
    //1、def 是定义一个方式使用的关键字
    //2、learn 是方法的名称
    //3、content 是参数列表
    //4、String是参数的类型
    //5、String是方法的返回值
    //   方法的返回值类型可以不写，编译器可以自动推断出来，但是对于递归函数，必须指定返回类型

  }


}