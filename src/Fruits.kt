
open class Fruits (_fruit: String){
    protected open val carrot = "Carrot"

    init{
        println("You chose a $_fruit")
    }

    open fun sayHello(){
        println("Fruit() say hello. ")
    }

    private fun helloPrivate(){
        println("I say hello privately!")
    }

   open fun sayHelloProtected(){
        println("I say hello while I am protected")
    }

    class SubClass(fruit: String) :Fruits(fruit){

        val item = carrot

        override fun sayHello() {
            super.sayHello()
        }

        override fun sayHelloProtected() {
            super.sayHelloProtected()
            println("Add extra stuff")
        }

    }
}

