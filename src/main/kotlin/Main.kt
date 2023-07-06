fun main() {
//    var myStack = Stack()
//    println(myStack.pop())
//    myStack.push(34)
//    myStack.push(35)
//    myStack.push(36)
//    myStack.push(37)
//    myStack.push(38)
//    println(myStack.peek())
//    println(myStack.pop())
//    println(myStack.peek())
//    myStack.push(14)
//    myStack.push(51)
//    myStack.push(88)
//    var x = myStack.pop()
//    var y = myStack.pop()
//    var z = x!!+y!!
//    //null assertion operator, making sure the types being added are not of type null
//    println(z)
    var str = "hello"
    var result = mutableListOf<Char>()
    var stack = Stack()
    str.forEach { c -> stack.push(c) }
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    println(result.joinToString(""))


}
class Stack{
    var data = mutableListOf<Int>()

    fun push (value: Int){
        data.add(value)
    }
    fun pop(): Int?{
        if (data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek(): Int? {
        if (data.isEmpty()) {
            return null
        }
         return data[data.lastIndex]
    }
    fun isEmpty(): Boolean{
        return data.isEmpty()
    }

}