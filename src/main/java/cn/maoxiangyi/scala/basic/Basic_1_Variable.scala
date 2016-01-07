package cn.maoxiangyi.scala.basic


/**
 * 学习scala定义变量的三种方式
 *    val：定义不可变的变量，scala推荐此种方式
 *    var：定义可变的变量
 *    显示的指定变量的类型  val variableName：variableType
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_1_Variable{

  def main(args: Array[String]) {
    //使用val定义的变量值是不可变的，相当于java中final修饰的变量
    val i =1
    //使用var定义的变量是可变的，在scala中鼓励使用val来定义变量
    var j =1
    //scala编译器会自动腿短变量的类型，必要的时候可以显示的指定变量的类型
    val str:String  = "hello scala!"
  }

}