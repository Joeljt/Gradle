package map

//def map = [
//        red: "#FF0000",
//        green: "#00FF00",
//        yellow: "#0000FF"
//]
//
//println map.red
//
//map.transparent = "#0000000"
//println map.toMapString()
//
//
def Students = [
        1 : [ name : "John", age : 25],
        2 : [ name : "Susan", age : 13],
        3 : [ name : "Tommy", age : 45]
]
Students.each {}



String.metaClass.getUpperCase = {
    String value -> return value.toUpperCase()
}

def str = "lijiateng"
println(str.getUpperCase("hhhhhhhh"))