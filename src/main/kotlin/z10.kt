import kotlin.system.exitProcess

fun main() {
    try{
        println("введите баланс хранилища:")
        val storage1 = SugarStorage(readln().toInt())
        println(storage1.decreaseSugar(100))
        println(storage1.increaseSugar(2))
    }
    catch (e: NumberFormatException)
    {
        println("число, требуется число")
    }

}

class SugarStorage{
    var volume: Int = 0

    constructor (volume: Int)
    {
        if (volume >= 0)
            this.volume = volume
        else
            println("ты дурака")
    }

    fun decreaseSugar(v: Int): Int{
        val a = volume - v
        if (a  >= 0)
            volume -= v
        else
            println("мало сахара")
        return volume
    }
    fun increaseSugar(v: Int): Int{
        volume += v
        return volume
    }
}

/*
Земные программисты так сильно впечатлили пришельцев, что те
доверили землянам создать ПО для работы главного финансового учреждения в
Созвездии Жука - сахарного хранилища.

Создайте класс для сахарного хранилища SugarStorage.
Класс должен реализовывать следующие методы:

-первичный конструктор, инициализирующий начальный баланс хранилища.
-decreaseSugar(v:Int) - уменьшить баланс хранилища на v.
-increaseSugar(v:Int) - увеличить баланс хранилища на v.
Также класс должен обладать публичным свойством volume:Int, задающим текущий баланс хранилища.

Обратите внимание, что
-volume не может быть отрицательным. При попытке уменьшить баланс на величину,
превышающую volume, значение volume должно становиться нулем.
-decreaseSugar и increaseSugar должны игнорировать отрицательные аргументы.
 */