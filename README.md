# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a common pitfall in Groovy when performing arithmetic operations with potentially null values. Groovy's dynamic typing allows for some flexibility, but this can lead to unexpected `NullPointerExceptions` if not handled properly.

The `bug.groovy` file shows the problematic code. The `bugSolution.groovy` demonstrates improved handling of null values, making the code more robust and less prone to exceptions.

## How to Reproduce

1. Clone the repository.
2. Run `groovy bug.groovy` to observe the `NullPointerException`.
3. Run `groovy bugSolution.groovy` to see the corrected behavior.

## Solution

Explicitly check for null values before performing any arithmetic operations to prevent `NullPointerExceptions`.  Using the Elvis operator (`?:`) provides a concise way to handle these situations.