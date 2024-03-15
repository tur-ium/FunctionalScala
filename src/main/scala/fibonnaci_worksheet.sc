def fibonacci_N(n:Int): Int = if (n==0 || n==1) return 1 else return fibonacci_N(n - 1) + fibonacci_N(n - 2)

println(List(0,1,2,3,4,5).map(fibonacci_N))

def fibonacci_N_pattern(n:Int): Int = n match {
  case 0 | 1 => 1
  case n => fibonacci_N(n - 1) + fibonacci_N(n - 2)
}
println(List(0,1,2,3,4,5).map(fibonacci_N_pattern))
