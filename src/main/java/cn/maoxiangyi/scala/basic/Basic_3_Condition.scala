package cn.maoxiangyi.scala.basic


/**
 * 学习scala的条件表达式，
 *    学习常用的 if else组合
 *    学习常用的 if elseif else
 *    学习混合表达表达式  val str = if (condition > 1) condition else "不满足条件";
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_3_Condition {

  def main(args: Array[String]) {
    //初始化便令condition=1
    val condition = 1;

    //判断变量condition是否大于0，满足条件返回1，不满足条件返回2
    //并将返回的结果赋值给变量y
    val y = if (condition > 0) condition else -1;
    println(y)

    //支持混合类型表达式
    val str = if (condition > 1) condition else "不满足条件";
    println(str)

    //如果确实else，相当于 if(condition >1 ) else ()
    val result = if (condition > 1) "满足条件"
    println(result)

    //if 和 else if
    val elseIf = if (condition > 1) condition else if (y == 1) y else -1
    print(elseIf)

  }
}