
/**
 * 学习scala中如何定义一个函数
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
object Basic_7_Function {

  //要定义函数，需要给出函数名称、参数、函数体
  val functionA = (x: Int, y: Int) => x + y


  def main(args: Array[String]) {
    //在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一样被传递和操作
    val reslut = functionA(125, 125)
    println(reslut)
  }


}