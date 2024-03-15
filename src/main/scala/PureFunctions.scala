package org.turium.com

object Run extends App {
  val x = 8

  def double(x: Int): Int = x * 2

  println(double(x))
  println(x)

  println(double(2))
}