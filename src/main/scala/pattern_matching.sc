import scala.util.Random

def someQuote = {
  val aList = List(10,4,666,777,1,13,36)
  aList(Random.nextInt(aList.length)) match {
    case 666 => "I am in hell"
    case 777 => "I am lucky"
    case 1 | 4 | 10 => "This is the life"
    case 13 => "I am unlucky"
    case _ => "I am 36"
  }
}
println(someQuote)
println(someQuote)