package com.mypackage

//fun main(args: Array<String>) {
//    """Переменные"""
//
//    var age: Int = 10           //var age = 10  не обязательно писать типы данных,
//                                                // переменная сама принимает на себя,
//                                                // то значение данных, которые ты задашь
//    age = 15
////    println("Переменная " + num1)
//
//    val hel: String = "Привет"      //не изменяется(константа)
//    var name = "Devid"
//    println("$hel $name, тебе $age лет")
//}


//fun main(args: Array<String>){
//    """Условные операторы"""

//    var a = 2
//    var b = 10
//    if (a == b) { // Если a будет равным b, тогда будет выполнен код
//        // Здесь код который будет выполнен
//        // Если всего одна строка кода, то фигурные скобки {}
//        // можно не ставить
//    } else if (a <= b) { // Если а будет меньшим или равным b
//        // Если предыдущее условие не будет выполнено,
//        // а здесь условие окажется верным,
//        // то будет выполнен этот код
//    } else {
//        // Этот код сработает, если другие условия не будет выполнен
//    }
//    var x = 23
//    when (x) { // Проверяем переменную x
//        1 -> print("Переменная равна 1")
//        // Если переменная будет равна 1, то здесь сработает код
//        // Может быть множество строк, а не только одна
//        23 -> print ("Переменная равна 23")
//        // Если переменная будет равна 56, то здесь сработает код
//        // Может быть множество строк, а не только одна
//
//        // По аналогии таких проверок может быть множество
//        // Также можно добавить проверку, которая сработает в случае
//        // если все остальные проверки не сработают
//        else -> print ("Что-то другое")
//    }
//}


//fun main(args: Array<String>){
//    """Функции"""
//    sayHello("hello", 43)                               //Вызываем функцию sayHello
//                                                        //Передаем переменным значения
//    val result = Add(5, 10)
//    println(result)
//    println(saySomething(true))
//}
//
//fun sayHello(first:String, number: Number){
//    println("$first - $number")
//}
////(first:String, number: Number) - задаем параметры и передаем их в функциюю main
//
//fun Add(x:Int, y:Int): Int{
//    return x + y
//}
//
//fun saySomething(first: Boolean): String = "Hello World!! - $first"  // так можно записывать функцию, которая может
//                                                                     // возвращать только ОДНО Значение


//fun main(args: Array<String>) {
////    """Массивы данных/Cписки"""
////    val someArray = arrayOf(true, false) // можно не указывать тип данных
//    var items: Array<Int> = arrayOf(5, 7, 12, 58, 6, 78)
////    println(items.set(0, 99))       //изменение массива по индексу(число под индексом 0(5)
////                                    // меняем на число 99)
////    println(items[0])
////    println(items.get(1))
////    println(items.size)             //получение размера массива
////
////    //Переборка массива
////    items.forEachIndexed{
////        index, el -> println("$el с индексом $index")
////    }
//
//    // Списки
//    var items_list = listOf(2, 34, 34, 235, 235, 1, 134, 4)
//    items_list.lastIndexOf(1)
//
//    //Ассоциативный массив
//
//    var user: Map<String, Any> = mapOf("name" to "Bob", "age" to 23, "isHasCar" to true)
////    // Any - тип данных нужен
////    // для передачи элементов с различными типами данных
////    user.forEach { key, value -> println("$key -> $value") }
////    // Переборка массива(Выводит ключ и значение)
////    var user2 = mutableMapOf("name" to "Bob", "age" to 23, "isHasCar" to true)
////    println(user2)
//    // Массив для добавления данных
//
////    var array = mutableListOf<Any>(5, 54, 545, 2, 21, 62, 65, 25423, 43)
////    array.add("Jary")
////    array.addAll(4, array)
//    printArray(user)
//}
//fun printArray(items: Map<String, Any>){
//    items.forEach{key, value ->
//        println("$key -> $value")
//    }
//}


//fun main(args: Array<String>){
//    """Параметры в функциях"""
//
//    var names = arrayOf("alex", "oleg", "bob", "charly")
//    printSome()
//    printSome(word = *arrayOf("Hi"))
//    printSome(word = *arrayOf("Hi"), item = "some")
//    printSome("Hi", "some", "hello")
//    printSome("Hi", *names)
//}
//
//fun printSome(item: String = "Hi", vararg word: Any){             //vararg - функция которая позволяет
//    print("$item: ")                                            // передавать несколько параметром
//    word.forEach { el -> print("$el ") }
//    println("")
//}


//fun main(args: Array<String>){
//    """Циклы"""

//    var items = 5
//
//    while(items > 0){
//        println(items)
//        items--
//    }
//
//    do {
//        println("Items: $items")
//    }while (items==5)

//    for (i in 0..10 step 2){            //step - шаг цикла, 0..10 - от и до
//        println(i)
//    }

//    for(i in 10 downTo 0 step 2){           //от 10 до 0 с шагом 2
//        println(i)
//    }

        //переборка алфавита/так же можно сделать downTo
//    for(el in 'a'..'f'){
//        println(el)
//    }

//val x = 100
//if (x in 5..30){
//    println("variable: $x")
//}else{
//    println("err")
//}
//}


fun main(args: Array<String>){
    """Классы и объекты"""

    var alex = User(secondName = "Alex", firstName = "All")
    alex.login = "codi"
    alex.login

}

