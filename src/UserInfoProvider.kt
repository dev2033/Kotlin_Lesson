//package com.mypackage
//
//interface UserInfoProvider{
//    val info: String                            //если создать переменную внутри интерфейса, ее необходимо
//                                                //реализовать внутри всех классов ниже |
//
//    fun printInfo(user: User){                  //эту функцию можно реализовать в классе ниже, либо в самом
//        println(info)                                                            // интерфейсе
//        user.printUser()
//    }
//}
//
//interface DbConnection{
//    fun getConnection() : String
//}
//
//open class MainProvider : UserInfoProvider, DbConnection {
//    protected open val db = "Db connected"                    //open - нужен для того чтобы можно было переопределить
//                                                    // переменную в классе наследнике
//    override val info: String
//        get() = "Method was called"
//
//    override fun printInfo(user: User) {
//        super.printInfo(user)
//        println("Дополнительный код/функцию можно не переписывать, если " +
//                "не требуется дополнительный код ")
//    }
//
//    override fun getConnection(): String {
//        return db
//    }
//}
//
