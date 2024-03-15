"""Pure functions are characterized by Determinism and absense of edge effects (overwriting of values)"""

val x = 8

def double(x: Int): Int = x * 2

println(double(x))
println(x)

println(double(2))