import scala.collection.mutable.ArrayBuffer


/**
 * 主要学习scala中数组的定义
 *  创建定长数组：new Array[Int](8)
 *  直接创建数组：val arr1 = Array(1, 2, 3, 4, 5, 6, 7, 8);
 *  创建可变长数组：val arr3 = ArrayBuffer[Int]();
 *  对可变长数组进行删除操作：arr3.remove(2,3) //删除角标2之后的三个元素,含角标2
 *  对可编程数组进行增加操作： arr3.insert(2,3,4,5) //在角标2的位置依次插入 3,4,5 三个元素
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Array_1_Definition {

  def main(args: Array[String]) {
    //1、使用new关键字 初始化一个长度为8的定长数组，其所有元素均为0
    //如果new，相当于调用了数组的apply方法，直接为数组赋值
    val arr = new Array[Int](8)
    print(arr.toBuffer) //通过arr.toBuffer能够直观的看到数组中值
    println()

    //2、直接定义一个定长的数组
    val arr1 = Array(1, 2, 3, 4, 5, 6, 7, 8);
    print(arr1.toBuffer) //通过arr.toBuffer能够直观的看到数组中值
    println()
    val arr2 = Array("storm", "spark", "hadoop", "machineLearning", "javaEE")
    println(arr2.toBuffer) ////通过arr.toBuffer能够直观的看到数组中值

    //3、可变长数组
    val arr3 = ArrayBuffer[Int]();
    arr3 += 1 //在数组尾部增加一个元素
    arr3 +=(2, 3, 4, 5, 6) //在数组尾部增加多个元素
    arr3 ++= Array(7, 8) //在数组尾部增加一个数组
    arr3 ++= ArrayBuffer[Int](9,10,11) //在数组尾部增加一个数组buffer
    println(arr3)

    //4、删除数组中的元素
    arr3.remove(2,3) //删除角标2之后的三个元素,含角标2
    println(arr3)

    //5、增加3个元素
    arr3.insert(2,3,4,5) //在角标2的位置依次插入 3,4,5 三个元素
    println(arr3)
  }

}