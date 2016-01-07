
/**
 * 主要学习scala中数组的运用
 *  使用yield关键字产生一个新的数组
 *  使用map对数组的进行简单的处理
 *  将偶数取出乘以100后再生成一个新的数组
 *  filter和map配合使用
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Array_3_YieldAndMap {


  def main(args: Array[String]) {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //1、yield关键字将原始的数组进行转换会产生一个新的数组，原始的数组不变
    val arr1 = for (i <- arr) yield i * 100
    println(arr1.toBuffer)

    //2、map可以对数组的进行简单的处理    _代表入参
    val arr3 = arr.map(_ * 200)
    println(arr3.toBuffer)


    //3、将偶数取出乘以100后再生成一个新的数组
    val res = for (e <- arr if e % 2 == 0) yield e * 100
    println(res.toBuffer)

    //4、更高级的写法,用着更爽
    //filter是过滤，接收一个返回值为boolean的函数    _代表入参
    //map相当于将数组中的每一个元素取出来，应用传进去的函数  _代表入参
    val r = arr.filter(_ % 2 == 0).map(_ * 10)
    println(r.toBuffer)


  }


}