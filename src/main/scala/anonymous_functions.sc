//  To avoid writing lots of functions that are defined and only used once,
//  we can use anonymous functions or "literal" functions, which allow us
//  to define a function without declaring the name of the function. They will be used in particular:
// These are handy for instance as :
// - arguments to higher order functions
// - as the return value of a function
// - to initialize a constant

// Average
val l = List(10,2,6,7,8)
val av = l.reduce((x: Int, y: Int) => x + y) / l.length

println(av)

// Filter
val filteredList = l.filter(_ >= 8)
println(filteredList)

//Create a list where each element is a tuple (x,1) with x an element of the list List(10,2,6,7,8) :
val transformedList = l.map((_,1)) // This is the same as l.map(x => (x,1))
println(transformedList.mkString(","))

// Function Factories (functions that return other functions)
def incrementFactory(increment: Int) = (x:Int) => x+increment
// Apply to a single value
incrementFactory(1)(3) // Add 1 to 3

l.map(incrementFactory(1)) // Add 1 to the list defined earlier
l.map(incrementFactory((2))) // Add 2 to the list defined earlier

val addOne = incrementFactory(1)

println(l.map(addOne)) // The same as above but using a constant
