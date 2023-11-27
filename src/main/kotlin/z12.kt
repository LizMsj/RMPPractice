fun main() {
    println("число:")

    try {
        val n: Int = readLine()!!.toInt()
        println(getCubeList(n))
    }
    catch (ex : java.lang.NumberFormatException)
    {
        println("Число, пж")
    }

}

fun getCubeList(n: Int) : MutableList<Int> {
    var list: MutableList<Int> = mutableListOf()
    for(i in 0..n){
        list.add(i * i * i)
    }
    return list
}

/*
Умение быстро возводить в куб целые числа является очень важным качеством
для молодых пришельцев. Настолько важным, что от экзаменационной оценки
по данному предмету зависит дальнейшая судьба молодых гостей из космоса -
кто-то пойдет водить звездолет, а кто-то нет. Реализуйте функцию getCubeList (n),
возвращающую список целых чисел, состоящий из кубов порядковых номеров элементов
от 0 до n-1 включительно. Нумерация начинается с 0.
 */