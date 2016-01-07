object Set_1_Definition {

  def main(args: Array[String]) {

    //定义一个set
    val set = Set("hadoop", "redis", "spark", "hadoop")
    set.foreach(e => println(e))      //从set中获取元素
    println(set.head)                 //此方法返回集合的第一个元素。
    println(set.last)                 //此方法返回集合的最后一个元素
    set.tail.foreach(e => print(e+" ")) //此方法返回集合除第一元素的所有元素


  }

}