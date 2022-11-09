import java.lang.Math.sqrt
import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число a: ")
    val a = reader.nextDouble()

    print("Введите число b: ")
    val b = reader.nextDouble()

    print("Введите число c: ")
    val c = reader.nextDouble()

    val d = (b * b) - (4 * a * c)

    if (d > 0) {
      val x1 = (-b + sqrt(d)) / (2*a)
      val x2 = (-b - sqrt(d)) / (2*a)
        print("x1 = $x1, x2 = $x2")
    } else if (d == null) {
       val x = -b  / (2*a)
        print("x = $x")
    } else {
        print("Корней нет")
    }
}