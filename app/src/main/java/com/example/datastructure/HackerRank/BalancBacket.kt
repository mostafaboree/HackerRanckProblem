package com.example.datastructure.HackerRank

class StuckC(){
   private val array =ArrayList<Char>()
    fun push(value:Char){
        array.add(value)
    }
    fun pop():Char{
        val lastValue = array[array.size-1]
        array.removeAt(array.size-1)
        return lastValue
    }
    fun peek():Char{
        return array[array.size-1]
    }
    fun isEmpty():Boolean{
        return array.isEmpty()


}}
fun isBalanced(s: String): String {
    val stuck = StuckC()
    s.forEachIndexed { index, c ->
        if(stuck.isEmpty()){
            stuck.push(c)
            return@forEachIndexed
        }
        if(compare(stuck.peek(),c)){
        stuck.pop()}
        else{
            stuck.push(c)
    }}
   if(stuck.isEmpty())
       return "YES"
    else
       return "NO"

}
fun compare(s:Char,s1:Char): Boolean{
   if((s=='(' && s1==')') || (s=='{' && s1=='}') || (s=='[' && s1==']'))
       return true
    else
        return false
}
fun compare2(s:String,s1:String): Boolean{
    for(index in 0 until s.length){
        if(compare(s[index],s1[index])){
           continue
        }
        else{
           return false
        }
    }
    return true
}
fun main(args: Array<String>) {
    val s = "{{[[(())]]}}"

        val result = isBalanced(s)

        println(result)

    }
