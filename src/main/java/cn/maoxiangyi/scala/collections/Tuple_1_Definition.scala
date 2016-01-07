
/**
 * 主要学习scala中数组的运用
 * 创建Map 使用 ->的方式
 * 创建map 使用元组的方式
 * 获取map中的元素的两种方式，直接获取和getOrElse方法的使用
 * 获取map中的所有元素，五种方式
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Tuple_1_Definition {

  def main(args: Array[String]) {
    //定义tuple时，用小括号将多个元素包起来，其间用逗号分隔
    //元素的类型可以不一样，元素个数可以任意
    val tuple = ("redis", "hadoop", "scala", 100)
    println(tuple)

    val redis = tuple._1;
    val hadoop = tuple._2;
    val scala = tuple._3;
    val score = tuple._4;
    println(redis, hadoop, scala, score)

  }
}