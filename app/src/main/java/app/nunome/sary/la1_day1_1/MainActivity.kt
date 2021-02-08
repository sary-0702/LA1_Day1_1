package app.nunome.sary.la1_day1_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num: Int = 0
        textView.text = "0"

        plusButton.setOnClickListener {
            num = num + 1
            textView.text = num.toString()

            if (num % 3 == 0) {
                textView.setTextColor(Color.GREEN)
            } else if (num % 5 == 0) {
                textView.setTextColor(Color.BLUE)
            } else if (num % 5 == 0 && num % 3 == 0){
                textView.setTextColor(Color.RED)
            } else {
                textView.setTextColor(Color.BLACK)
            }
        }

        minusButton.setOnClickListener {
            num = num - 1
            textView.text = num.toString()

            if (num % 3 == 0) {
                textView.setTextColor(Color.GREEN)
            } else if (num % 5 == 0) {
                textView.setTextColor(Color.BLUE)
            } else if (num % 5 == 0 && num % 3 == 0){
                textView.setTextColor(Color.RED)
            } else {
                textView.setTextColor(Color.BLACK)
            }
        }

        resetButton.setOnClickListener {
            num = 0
            textView.text = num.toString()

            if (num % 3 == 0) {
                textView.setTextColor(Color.GREEN)
            } else if (num % 5 == 0) {
                textView.setTextColor(Color.BLUE)
            } else if (num % 5 == 0 && num % 3 == 0){
                textView.setTextColor(Color.RED)
            } else {
                textView.setTextColor(Color.BLACK)
            }
        }

    }
}