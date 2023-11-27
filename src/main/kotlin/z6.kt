import java.lang.Exception

fun main() {
    println("вводите строку числ без пробелов")
    val str = readLine()
    var summ: Int = 0
    try {
        for (i in 0..(str!!.length - 1))
        {
            if (str[i].digitToInt() % 2 == 0)
                summ = summ + str[i].digitToInt()
        }
        println(summ)
    }
    catch(e: Exception)
    {
        println("что-то пошло не так")
    }

}

/*
Пришельцы открыли посольства в главных городах Земли.
Для их функционирования требуется огромное множество различных
наемных работников - повара, охранники, клерки, бухгалтера.
И именно последние столкнулись со страшной проблемой.
В виду (доходящей до абсурда) разницы в подходах к экономическим вопросам,
платежные ведомости предоставляются пришельцами в ужасном беспорядке.
Итоговая заработная плата работников землян зачем-то пишется в виде
отдельных четных цифр (которые нужно просуммировать) вперемешку с
нечетными цифрами одной строкой для каждого сотрудника. Реализуйте
функцию calculateEvenDigits, которая находит сумму четных цифр в строке.
 */