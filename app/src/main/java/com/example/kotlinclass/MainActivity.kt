package com.example.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val shopUp = ActivityMainBinding.inflate(layoutInflater)
        setContentView(shopUp.root)

        // 주 생성자
        // class Person constructor(value: String) { 'constructor'이 생략이 가능
        class Person(value: String) {   // constructor 생략된 모습
            init {
                println("value: $value")    // 초기화 성공
            }
            fun someFun() {
                println("value: $value")    // 오류  
            }
        }
        
        //클래스에서 변수 선언하고 매개변수를 변수에 대입
        class User(name: String, age: Int) {
            var name: String
            var age: Int
            init {
                this.name = name
                this.age = age
            }
            fun into() {
                println("name: $name, age: $age")
            }
        }
        
        // val 키워드를 생성자 매개변수에 넣어서 바로 사용
        class FirstUse(val par1: Int, val Par2: Int) {
            fun useNow() {
                println("par1 값은 $par1, par2 값은 $par2")   
            }
        }
        

        Person("프라이머리")

        // 부 생성자
        // 파라미터의 개수 또는 파라미터 타입이 다르면 중복해서 만들 수 있다.
        class Kotlin {
            constructor(value: String) {
                println("전달받은 파라미터는 ${value}")
            }
            constructor(value: Int) {
                println("전달받은 파라미터는 ${value}")
            }
        }
        
        Kotlin("값")     // String 파라미터
        Kotlin(10)     // Integer 파라미터
        
        // 주 생성자와 부 생성자
        // class Project(name: String) {
        //     constructor(name: String, ver: Int) {   // 오류발생
        //         코드 내용
        //     }
        // }
        
        // 알맞은 코드
        class Project(name: String) {
            constructor(name: String, ver: Int): this(name) {
                코드     
            }
        }

        // 디폴트 생성자
       class Student {
            init {
                Log.d("Student Class", "생성자 없이도 동작합니다.")
            }
        }

        Student()

        class People {
            var name: String = "Java"
            var age: Int = 30
            fun printInfo(): String {
                return "피플의 정보 - 이름: $name, 나이: $age"
            }
        }

        var people = People()
        Log.d("People Class", "피플 클래스 자바의 나이는 ${people.age}")

        shopUp.btnShow.setOnClickListener {
            shopUp.textShow.text = "${people.printInfo()}"     // 도트연산자로 접근가능
        }
    }
}
