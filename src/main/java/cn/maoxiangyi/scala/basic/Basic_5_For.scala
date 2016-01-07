
/**
 *
 * 学习for循环在scala的集中使用方式
 *  for(i <- 表达式),表达式1 to 10返回一个Range（区间）
 *  for(i <- 数组)
 *  for (i <- 1 to 3; j <- 1 to 3 if i != j) 每个生成器都可以带一个条件，注意：if前面没有分号
 *  for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Basic_5_For {

  def main(args: Array[String]) {

    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）
    //每次循环将区间中的一个值赋给i
    for (i <- 1 to 10) {
      println(i)
    }

    //for(i <- 数组)
    val arr = Array(1, 2, 3, 4, 5, 6)
    for (i <- arr) println(i)

    //高级for循环
    //每个生成器都可以带一个条件，注意：if前面没有分号
    //需求描述:两个线程从同一个区间取数据，如果取的数据相同就不打印
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println(i + "  " + j)

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val collection = for (i <- 1 to 100) yield i * 100;
    println(collection)
  }

}