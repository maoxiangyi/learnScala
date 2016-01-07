
/**
 * 学习scala中方法与函数组合使用
 *    在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一样被传递和操作
 *
 * scala中方法和函数的区别
 *    狭义上：
 *      方法（Method）是指在tail/class/object中的def关键字声明的，它不能被直接传递。
 *      函数(Function)是指类型ParamsType=>ResultType的变量，这些变量背后是用FunctionN对象来封装的，可以被传递。
 *      方法可以转换为函数
 *    广义上：抛开背后的实现，方法就是函数；编译器某些场景下会自动把方法封装为一个函数对象来传递。
 *    scala社区并不特别区分这两个名词。
 *    -----来自 阿里巴巴集团 孙瑞锋
 *
 *    方法对对象进行操作，函数不是。
 *     ----来自 快学scala
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_8_MethodAndFunciton {

  def main(args: Array[String]) {
    //在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一样被传递和操作
    //调用methodA方法，并传入f1函数
    val r1 = methodA(f1)
    println(r1)

    //在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一样被传递和操作
    //调用methodA方法，并传入f2函数
    val r2 = methodA(f2)
    println(r2)


    //在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一样被传递和操作
    //调用methodA方法，并传入f3函数
    val r3 = methodA(f3);
    print(r3)

  }

  //定义一个方法
  //方法methodA参数要求是一个函数，函数的参数必须是两个Int类型
  //返回值类型也是Int类型
  //大白话：方法methodA，需要传入一个函数，这个函数的输入两个Int参数，返回一个Int类型的结果
  def methodA(f: (Int, Int) => Int): Int = {
    f(2, 6)
  }


  //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
  val f1 = (x: Int, y: Int) => x + y
  //再定义一个函数f2
  val f2 = (m: Int, n: Int) => m * n
  //在定义一个函数f3
  val f3 = (a: Int, b: Int) => Math.abs((a + b) * (a - b) / 2)


}