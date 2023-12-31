fun main() {
    println("Введите количество пришельцев")
    try {
        val x = readln().toInt()
        println(calcChairs(x))
    }
    catch (e: NumberFormatException)
    {
        println("Введите число")
    }

}

fun calcChairs(x: Int) : Int{

    val y: Int = x + x / 2
    return y
}


/*
Из-за анатомических особенностей жителей Созвездия Жука
земляне постоянно ошибаются при рассадке дипломатических делегаций
пришельцев в худшую сторону - не хватает стульев.
Проблема возникает из-за древнего рефлекса - по мере роста  группы,
пришельцы начинают автоматически занимать больше сидячих мест,
чем им на самом деле требуется. Анализ видеозаписей позволил считать,
что зависимость количества стульев (y) от количества пришельцев (х) имеет вид:
y = x + z
где z - это целая часть от числа (x/2).

Для предотвращения конфликтов на почве недостатка посадочных мест вам
необходимо создать функцию calcChairs для расчета количества стульев.
Функция принимает один аргумент (количество пришельцев) и возвращает
требуемое целое количество стульев.

Необходимо реализовать только функцию calcChairs.

Подсказка: задачу можно решить без floor.
 */