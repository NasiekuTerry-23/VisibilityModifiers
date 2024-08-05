fun main(){

    val fruits = Fruits("Apple")
    fruits.sayHello()

    val subClass = Fruits.SubClass("Oranges")
    subClass.sayHelloProtected()
}