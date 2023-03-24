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

        // 프라이머리 생성자
        class Person(value: String) {
            init {
                Log.d("Person Class", "전달받은 파라미터는 ${value}")
            }
        }

        Person("프라이머리")

        // 세컨더리 생성자
        // 파라미터의 개수 또는 파라미터 타입이 다르면 중복해서 만들 수 있다.
        class Kotlin {
            constructor(value: String) {
                Log.d("Kotlin Class", "전달받은 파라미터는 ${value}")
            }
            constructor(value: Int) {
                Log.d("Kotlin Class", "전달받은 파라미터는 ${value}")
            }
        }
        
        Kotlin("값")     // String 파라미터
        Kotlin(10)     // Integer 파라미터

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