```scala
class MyClass(val value: Int) {
  def this() = this(0) // Correctly chained auxiliary constructor
}

// Additional safe guards to ensure proper value setting can be added here.

val instance1 = new MyClass(5)
val instance2 = new MyClass()

println(instance1.value) // Output: 5
println(instance2.value) // Output: 0
```