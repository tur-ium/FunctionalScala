//The map function is an example of a higher-order function
def double(args: Int): Int = args*2

val collection = List(1,2,3,4,5)
println(collection.head)

val doubled_collection = collection.map(double)
println(doubled_collection.head)


// We could also print the collection
doubled_collection.map(println)

// The reduce() function is another higher order function
def max(x:Int,y:Int) = if (x > y) x else y
val l = List(1,2,3,4,100,2,3)
println(l.reduce(max))