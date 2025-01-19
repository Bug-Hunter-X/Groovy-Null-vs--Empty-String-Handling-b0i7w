```groovy
class MyClass {
    def myMethod(String arg) {
        if (arg.isNullOrEmpty()) {
            return "Null or Empty argument"
        } else {
            return "Argument: "+ arg
        }
    }
}

MyClass myObject = new MyClass()
println myObject.myMethod(null)
println myObject.myMethod("")
println myObject.myMethod("Hello World")
```