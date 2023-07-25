package com.example.kiosk

fun main() {

    println("어서오십시오.  주문을 입력하여 주세요")//매장식사&포장여부 만들 예정
    
    println("1. 매장식사, 2. 포장")
    var choice = readLine()!!.toString()
    var choose = when(choice) {
        "1" -> "매장식사"
        "2" -> "포장"
        else ->"돌아가기"
    }
    println("메뉴를 입력하여 주세요")
    println("1. 분식, 2. 김밥, 3. 블라블라~~")

    var num = readLine()!!.toInt()
    var menu = Mainmenu()


    println("${choose} 입니다.  준비되면 안내해 드리겠습니다. 감사합니다. Made by ${menu.order(num)}")

}

class Mainmenu {
    fun order(pick:Int): String {

        var one = bunSik()
//    var two = kimBab()
//    var three = 메뉴 뭐였더라()
//    var four = 메뉴 뭐였더라()
//    var five = 메뉴 뭐였더라()
        var result:String

        when(pick) {
            1-> result = (one.order1(pick.toString()))
            //2-> result = (two.order2(pick.toString()))
            //3-> result = (three.order3(pick.toString()))
            //4-> result = (four.order4(pick.toString()))
            //5-> result = (five.order5(pick.toString()))//1~5 입력시 다음 코드를 출력 하도록 작성
            6-> result = println("처음으로 돌아가기").toString()//readLine 복귀
            0-> result = println("주문 취소").toString()//0 입력시 터미널 종료
            else-> result = println("처음으로 돌아가기").toString()
        }
        return result
    }
}

class bunSik {
    fun order1(pick: String): String {
        println("분식을 선택하셨습니다.  원하시는 메뉴를 선택하여 주세요")
        println("1. 떡볶이(3.0), 2. 튀김(2.5), 3. 소떡소떡(3.5), 4. 어묵(0.5), 5. 라면(2.5)")
        var pick=readLine()!!.toInt()
        var detail = bunSikDetail()
        var result:String

        when(pick) {
            1-> result = (detail.menu1()).toString()
            2-> result = (detail.menu2()).toString()
            3-> result = (detail.menu3()).toString()
            4-> result = (detail.menu4()).toString()
            5-> result = (detail.menu5()).toString()//1~5 입력시 다음 코드를 출력 하도록 작성
            else-> result = println("처음으로 돌아가기").toString()//readLine 복귀
        }
        return result
    }
}

class bunSikDetail{
    fun menu1(){
        var price=3000
        var name = "떡볶이"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력하여 주세요")
        var quantity =  readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price*quantity}원 입니다")
    }
    fun menu2(){
        var price=2500
        var name = "튀김"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력하여 주세요")
        var quantity =  readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price*quantity}원 입니다")
    }
    fun menu3(){
        var price=3500
        var name = "소떡소떡"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력하여 주세요")
        var quantity =  readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price*quantity}원 입니다")
    }
    fun menu4(){
        var price=500
        var name = "어묵"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력하여 주세요")
        var quantity =  readLine()!!.toInt()
        println("${name} ${quantity}개, 총합 ${price*quantity}원 입니다")
    }
    fun menu5(){
        var price=2500
        var name = "라면"
        println(name)
        println("가격 : ${price}원")
        println("수량을 입력하여 주세요")
        var quantity =  readLine()!!.toInt()
        println("${name} ${quantity}인분, 총합 ${price*quantity}원 입니다")
    }
}