
/**
 * 主要学习array转换成map，拉链操作
 *  将存放tuple的数组，转化成map
 *  拉链操作
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Tuple_2_TupleAndMap {

  def main(args: Array[String]) {
    //将存放tuple的数组，转化成map
    val arr = Array((1, "redis"), (2, "hadoop"), (3, "spark"), (4, "scala"))
    val map = arr.toMap //将数组转换成map
    map.foreach(e => println(e._1 + ":" + e._2))


    //拉链操作
    //注意：如果两个数组的元素个数不一致，拉链操作后生成的数组的长度为较小的那个数组的元素个数
    val names = Array("zhangsan", "lisi", "zhaoliu", "wangwu") //定义一个数组，保存用户名称
    val money = Array(100, 200, 233, 10) //定义一个数组，保存用户的钱
    val resArray = names.zip(money)     //通过拉链操作，把角标依次对应的数据组合到一个元组中，最后返回一个Array
    val resMap = resArray.toMap         //将Array转换为map
    resMap.foreach(e => {               //迭代
      val (x, y) = e;
      println(x + "  " + y)
    })
  }

}