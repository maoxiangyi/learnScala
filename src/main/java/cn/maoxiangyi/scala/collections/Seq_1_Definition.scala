
/**
 * 主要学习seq序列的运用
 * 创建一个序列
 * 获取序列的值
 *
 * Author:   maoxiangyi
 * Domain:   www.maoxiangyi.cn
 * Data:     2016/1/6.
 */
object Seq_1_Definition {
  def main(args: Array[String]) {

    //定义一个序列
    val seq = Seq(1, 2, 3, 4, 5, 6, 7, 9)

    //打印序列的值
    seq.foreach(element => println(element))
    for (e <- seq) println(e)
    //获取单个值
    println(seq.apply(4))


  }
}