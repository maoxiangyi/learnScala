package cn.maoxiangyi.scala.basic


/**
 * 在scala中大括号{}可以包含一些列的表达式，代码块中最后的一个表达式的值就是块的值
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_4_BlockExpression {

  def main(args: Array[String]) {
    //在scala中大括号{}可以包含一些列的表达式，代码块中最后的一个表达式的值就是块的值

    val initValue = 0;

    val lastValue = {
      if (initValue == 0) initValue+1
    }
    print(lastValue)

  }

}