
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
object Map_1_Definition {

  def main(args: Array[String]) {
    //在Scala中，把哈希表这种数据结构叫做映射

    //1、创建Map 使用 ->的方式
    val map = Map("1" -> "storm", "2" -> "spark", "3" -> "hadoop", "4" -> "redis", "5" -> "lucene")
    println(map)

    //2、创建map 使用元组的方式
    val map1 = Map((1, "Storm"), (2, "spark"), (3, "hadoop"), (4, "redis"), (5, "lucene"))
    println(map1)


    //3、获取map中的元素
    val value = map1(1); //直接获取，如果key的类型是字符串，就直接使用字符获取
    println(value)
    val getOrElse = map1.getOrElse(1, "mahout") //如果获取的key没有value，就用用户设置的value
    println(getOrElse)

    //4、获取map中的所有元素
    // 第一种方式：使用foreach方法，获取entry的第一个元素 e._1
    map.foreach(e => println(e._1 + "  " + e._2))
    // 第二种方式：使用keys获取一个迭代器 Iterable
    map.keys.foreach(key => println(key + "  " + map(key)))
    // 第三种方式：使用keySet获取一个set，然后通过foreach
    map.keySet.foreach(key => println(key + "  " + map(key)))
    // 第四种方式：使用keySet获取一个set，然后通过for循环获取所有元素
    for (key <- map.keySet.toArray) {
      println(key + ":" + map.get(key))
    }
    //第五种方式：使用foreach方法，然后定义代码块进行处理
    map.foreach(e => {
      val (k, v) = e
      println(k + "  " + v)
    })

  }

}