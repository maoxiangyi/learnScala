
/**
 * 主要学习scala中数组的运用
 *  对数组中的元素进行排序
 *  取出数组中最大的值 最小值
 *  对数组中元素求和
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Array_4_SumAndMaxAndSort {

  def main(args: Array[String]) {
    val arr = Array(1, 3, 2, 8, 5, 9, 4, 7, 6);

    //1、对数组中的元素进行排序
    val sortArr = arr.sorted
    println(sortArr.toBuffer)

    //2、取出数组中最大的值 最小值
    val maxValue = arr.max
    val minValue = arr.min
    println("最大值：" + maxValue + "  最小值：" + minValue)

    //3、对数组中元素求和
    val sum = arr.sum
    println(sum)


  }


}