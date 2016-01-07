/**
 * 主要学习scala中数组的运用
 *  1、使用增强for循环
 *  2、使用until会生成一个Range
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Array_2_For {

  def main(args: Array[String]) {

    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9);
    //1、使用增强for循环
    for (i <- arr) print(i)
    println()

    //2、使用until会生成一个Range
    //  好用的until会生成脚标，0 until 10 包含0不包含10
    for (i <- (0 until arr.length).reverse) print(arr(i))

  }

}