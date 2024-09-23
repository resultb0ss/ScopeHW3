fun main() {
    var array: IntArray = intArrayOf(2,34,5,6,7,8,34,45,65,67,87)

    var result = with(array){
        "Количество элементов в массиве: ${this.count()},Cумма элементов массива: ${this.sum()}"
    }
    println(result)
}