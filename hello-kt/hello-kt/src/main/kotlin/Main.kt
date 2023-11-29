package net.honux.playground

fun main() {
    println("Hello World")
    val n1 = 10
    val n2 = 20
    val ret = sub(n1, n2)

    println("$n1 + $n2 = ${add(n1, n2)}")
    println("$n1 - $n2 = $ret")

}

fun add(num1:Int, num2:Int): Int {
    return num1 + num2
}

fun sub(num1:Int, num2:Int) = num1 - num2