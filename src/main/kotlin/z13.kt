fun main() {
    try {
        println(EgineStatus(readLine()!!.toInt()))
    }
    catch (e: NumberFormatException){
        println("Введите числовое значение")
    }

}

fun EgineStatus(EgineNumber: Int) : String{

    try {
        println(rawEngineStatus(EgineNumber))
    }
    catch (ex : EngineNotFoundExaption)
    {
        return "engine ${EgineNumber} not found"
    }
    catch(ex : SensorMeltExaption)
    {
        return "engine ${EgineNumber} offline"
    }
    finally {
        return "Проверка закончена"
    }

}

fun rawEngineStatus(EgineNumber: Int) : String{
    return "мы работаем"
}


class SensorMeltExaption() :  Throwable() {
}

class EngineNotFoundExaption() :  Throwable() {
}

/*
К слову о звездолетах и пришельцах. Благодаря помощи с обучением молодого поколения,
пришельцы передали человечеству технологию сверхсветовых двигателей.
Однако при ближайшем рассмотрении оказалось, что двигатели не являются надежными
в техническом плане (могут расплавить крепление и улететь в космос по своим делам) и
по одиночке не работают.
Чтобы пилоты-испытатели не оказались слишком далеко от Земли в неисправном корабле,
реализуйте функцию engineStatus(engineNumber:Int): String, которая делает безопасный
(с точки зрения необработанных исключений) вызов функции rawEngineStatus(engineNumber:Int):String :

если произошло исключение EngineNotFoundException, то вернуть строку "engine <number> not found";
если произошло исключение SensorsMeltException, то вернуть строку "engine <number> offline";
если не произошло исключение, то вернуть результат работы rawEngineStatus.
где <number> - номер двигателя.

Функцию rawEngineStatus и исключения разрабатывать не нужно!
 */