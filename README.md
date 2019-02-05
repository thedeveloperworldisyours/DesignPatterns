# DesignPatterns
Design Patterns in Kotlin

Classification:

- Creational
  * **[Abstract Factory](https://github.com/thedeveloperworldisyours/DesignPatterns/blob/master/src/Factory.kt)**
  
  * **[Singleton](https://github.com/thedeveloperworldisyours/DesignPatterns/blob/master/src/Singleton.kt)**
  
  * **[Builder](https://github.com/thedeveloperworldisyours/DesignPatterns/blob/master/src/Builder.kt)**
  you don't need to use builders in Kotlin because we have default and named arguments. This enables you to write
  ```
  class Car(val model: String? = null, val year: Int = 0)
  ```
  and use it like so:
  ```
  val car = Car(model = "X")
  ```
