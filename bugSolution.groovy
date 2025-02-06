```groovy
def someMethod(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println someMethod(null, 5) // Output: 5
println someMethod(10, null) // Output: 10
println someMethod(null, null) // Output: 0
```