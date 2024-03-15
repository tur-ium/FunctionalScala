def sumListNaive(l:List[Int]): Int = l match {
  case Nil => 0
  case head::tail => head+sumListNaive(tail)
}

println(sumListNaive(List(0,1,2,3,4,5)))

def rev(l:List[Any]):List[Any] = l match{
  case Nil => Nil
  case head::tail => rev(tail):+head
}
println(rev(List(0,1,2,3,4,5)))

def last(l:List[Any]): Any = l match{

  case head::Nil => head
  case Nil => -1
  case head::tail => last(tail)
}
last