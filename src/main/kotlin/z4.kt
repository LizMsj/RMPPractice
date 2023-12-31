fun main(){
    try{
        println("ведите день недели (1-7)")
        var dayNumber = readln().toInt()
        if (dayNumber > 7 || dayNumber < 1) {
            println("нет такого дня недели, будет взян понедельник (1)")
            dayNumber = 1
        }
        println("введите значение ранга")
        val bugRank = readln().toInt()
        println("введите количество рублей")
        val cashAmount = readln().toInt()
        println(sahar(dayNumber, bugRank, cashAmount))
    } catch (e: NumberFormatException) {
        println("числами, пж")
    }
}

fun sahar(x: Int, y: Int, z: Int): Int{
    return z * (x * (y + 42))
}

/*
Жителям созвездия Жука незнакомы экономические проблемы, так как  их
денежная единица жестко привязана к основному ресурсу для просвещенных
пришельцев - обыкновенному сахару. При этом, курс, сколько килограммов
сахара дается за одну денежную единицу(cashAmount), является постоянным
(для одного конкретного пришельца) и варьируется в зависимости следующих параметров:

дня недели (dayNumber, целое число),
"ранга" пришельца в социальной иерархии (bugRank, целое число).
Еще раз: курс обмена одной денежной единицы равен произведению
номера дня недели и ранга пришельца, к которому добавлена вселенская константа(42).

Напишите функцию, которая пересчитывает деньги жителей созвездия Жука
в эквивалентную массу сахара. В качестве параметров функция должна принимать:
день недели, ранг пришельца и количество денежных единиц .
Возвращаемое значение  - количество килограммов сахара (целое число).
 */