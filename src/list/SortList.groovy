package list

//def list = [-4, 2, 1, 0, -2, 23, 5]

// Java Collection 排序
//Collections.sort(list, {
//    a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1
//})

// 直接使用 Groovy 的 sort 方法 + 闭包实现
//list.sort(){
//    a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? 1 : -1
//}

// 根据某个条件进行排序
//def strList = ["da22222222","l222i", "jia", "hhhhhhhh"]
//strList.sort(){
//    return it.size()
//}
//
//println(strList)

//def isPure = {
//    int it ->
//        for (i in 2 .. it - 1){
//            if (it % i == 0){
//                return false
//            }
//        }
//        return true
//}
//
//List getNum(target, closure){
//    int i = 1;
//    int count = 0;
//    def targetList = []
//    while (true){
//        if (closure.call(i)){
//            count++
//            targetList.add(i)
//        }
//
//        if (count == target){
//            return targetList
//        }
//        i++
//    }
//}
//
//println(getNum(8, isPure))


// 列表的查找
def list = [-2, 1, 3, 4, 5, 2]
//println(list.find {return it % 2 ==0})
//println(list.findAll {return it % 2 ==0})

// 列表增加
//list.add(9)
//list << 90
//list = list + 190
//println(list.toListString())

// 列表删除
//list.remove(-2)
//list.removeAll {
//    it % 2 == 0
//}
//
//println list - -2
//println list - [4, 5]
//println(list.toListString())