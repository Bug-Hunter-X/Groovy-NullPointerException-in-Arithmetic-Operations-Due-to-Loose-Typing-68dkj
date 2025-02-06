```groovy
def someMethod(a, b) {
  if (a == null) {
    return 0
  }
  return a + b
}

println someMethod(null, 5) // Output: 0
println someMethod(10, null) // NullPointerException
```