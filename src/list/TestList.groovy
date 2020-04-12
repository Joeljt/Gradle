package list

// Groovy 中直接使用 [] 声明数组即可
def list = [123, "dada", true, false, 3234, 4.223443, 0L]
println(list.class)
for (int i = 0; i < list.size(); i++) {
    // 获取集合数据可以直接使用中括号，不用调用 get 方法
    // println(list[i].class)
}

// 使用 as 关键字来指定声明的列表类型
def linkedList = [123,321,"213",boolean ] as LinkedList
println(linkedList.class)

// 或者在声明的时候直接使用强类型进行声明
def arr = [1,2,3] as int[]
int[] arrStrongDefine = [1, 2, 3]
println(arr.class)