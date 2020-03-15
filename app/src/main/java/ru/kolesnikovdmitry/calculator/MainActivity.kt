package ru.kolesnikovdmitry.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sign


class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstStr    : String = ""
        var secondStr   : String = ""
        var curOperator : String = ""
        var curTextView : Int    = 1
        var curAns      : String = ""

        val mScrollView : HorizontalScrollView = findViewById(R.id.scrollViewTest)
        val mScrollViewSecond : HorizontalScrollView = findViewById(R.id.scrollViewSecond)

        val mTextViewFirst   : TextView = findViewById(R.id.textViewActMainFirstNum)
        val mTextViewSecond  : TextView = findViewById(R.id.textViewActMainSecondNum)
        val mTextViewOperand : TextView = findViewById(R.id.textViewActMainOperand)
        val mTextViewAns     : TextView = findViewById(R.id.textViewActMainAns)

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "0"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)

            } else {
                secondStr += "0"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "1"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "1"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }

        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "2"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "2"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button3: Button = findViewById(R.id.button3);
        button3.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "3"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "3"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button4: Button = findViewById(R.id.button4);
        button4.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "4"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "4"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button5: Button = findViewById(R.id.button5);
        button5.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "5"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "5"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button6: Button = findViewById(R.id.button6);
        button6.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "6"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "6"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button7: Button = findViewById(R.id.button7);
        button7.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "7"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "7"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button8: Button = findViewById(R.id.button8);
        button8.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "8"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "8"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        val button9: Button = findViewById(R.id.button9);
        button9.setOnClickListener {
            if (curTextView == 1) {
                firstStr += "9"
                mTextViewFirst.text = firstStr
                //прокрутка
                mScrollView.post(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollView.postDelayed(Runnable { mScrollView.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            } else {
                secondStr += "9"
                curAns = calculate(firstStr, secondStr, curOperator)
                mTextViewAns.text = "=$curAns"
                mTextViewSecond.text = secondStr
                //прокрутка
                mScrollViewSecond.post(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) })
                mScrollViewSecond.postDelayed(Runnable { mScrollViewSecond.fullScroll(HorizontalScrollView.FOCUS_RIGHT) }, 1000)
            }
        }
        //Answer
        val buttonAns: Button = findViewById(R.id.buttonAns)
        buttonAns.setOnClickListener {
            if (secondStr == "" && firstStr != "") {
                return@setOnClickListener
            }
            secondStr   = ""
            firstStr    = curAns
            curAns      = ""
            curTextView = 1
            curOperator = ""

            mTextViewAns.text     = curAns
            mTextViewFirst.text   = firstStr
            mTextViewOperand.text = curOperator
            mTextViewSecond.text  = secondStr
        }
        //Operators
        val buttonMultiplic: Button = findViewById(R.id.buttonMultiplic)
        buttonMultiplic.setOnClickListener {
            if (firstStr == "") return@setOnClickListener
            if (firstStr != "" && secondStr != "") {
                secondStr   = ""
                firstStr    = curAns
                curAns      = ""
                curTextView = 1
                curOperator = ""

                mTextViewAns.text     = curAns
                mTextViewFirst.text   = firstStr
                mTextViewOperand.text = curOperator
                mTextViewSecond.text  = secondStr
            }
            curTextView = 2;
            curOperator = "*"
            mTextViewOperand.text = curOperator
        }
        val buttonDivision: Button = findViewById(R.id.buttonDivision)
        buttonDivision.setOnClickListener {
            if (firstStr == "") return@setOnClickListener
            if (firstStr != "" && secondStr != "") {
                secondStr   = ""
                firstStr    = curAns
                curAns      = ""
                curTextView = 1
                curOperator = ""

                mTextViewAns.text     = curAns
                mTextViewFirst.text   = firstStr
                mTextViewOperand.text = curOperator
                mTextViewSecond.text  = secondStr
            }
            curTextView = 2
            curOperator = "/"
            mTextViewOperand.text = curOperator
        }
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        buttonPlus.setOnClickListener {
            if (firstStr == "") return@setOnClickListener
            if (firstStr != "" && secondStr != "") {
                secondStr   = ""
                firstStr    = curAns
                curAns      = ""
                curTextView = 1
                curOperator = ""

                mTextViewAns.text     = curAns
                mTextViewFirst.text   = firstStr
                mTextViewOperand.text = curOperator
                mTextViewSecond.text  = secondStr
            }
            curTextView = 2
            curOperator = "+"
            mTextViewOperand.text = curOperator
        }
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        buttonMinus.setOnClickListener {
            if (firstStr == "") return@setOnClickListener
            if (firstStr != "" && secondStr != "") {
                secondStr   = ""
                firstStr    = curAns
                curAns      = ""
                curTextView = 1
                curOperator = ""

                mTextViewAns.text     = curAns
                mTextViewFirst.text   = firstStr
                mTextViewOperand.text = curOperator
                mTextViewSecond.text  = secondStr
            }
            curTextView = 2
            curOperator = "-"
            mTextViewOperand.text = curOperator
        }
        //delete and clean
        val buttonDelete: ImageView = findViewById(R.id.buttonDelete)
        buttonDelete.setOnClickListener {
            if (curTextView == 1) {
                firstStr = firstStr.dropLast(1)  //Удаляем последний элемент из строки
                mTextViewFirst.text = firstStr
            } else {
                secondStr = secondStr.dropLast(1)  //Удаляем последний элемент из строки
                mTextViewSecond.text = secondStr
                try {
                    mTextViewAns.text = "=${calculate(firstStr, secondStr, curOperator)}"
                } catch (ex: Throwable) {
                    mTextViewAns.text = ""
                }
            }
        }
        val buttonClean: Button = findViewById(R.id.buttonC)
        buttonClean.setOnClickListener {
            curAns      = ""
            firstStr    = ""
            secondStr   = ""
            curOperator = ""
            curTextView = 1
            mTextViewAns.text     = curAns
            mTextViewFirst.text   = firstStr
            mTextViewSecond.text  = secondStr
            mTextViewOperand.text = curOperator
        }
        //point
        val buttonPoint : Button = findViewById(R.id.buttonPoint)
        buttonPoint.setOnClickListener {
            var countPoints = 0
            if(firstStr == "") return@setOnClickListener
            if(curTextView == 2 && curOperator != "" && secondStr == "") return@setOnClickListener
            if(curTextView == 1 && curOperator == "") {
                for (char in firstStr) {
                    if(char == '.') countPoints++
                }
                if(countPoints > 0) return@setOnClickListener
                firstStr += "."
                mTextViewFirst.text = firstStr
            }
            else {
                for (char in secondStr) {
                    if(char == '.') countPoints++
                }
                if(countPoints > 0) return@setOnClickListener
                secondStr += "."
                mTextViewSecond.text = secondStr
            }
        }
        val buttonSignum : Button = findViewById(R.id.buttonPM)
        buttonSignum.setOnClickListener {
            if(firstStr == "") return@setOnClickListener
            if(curOperator != "" && secondStr == "") return@setOnClickListener
            if(curTextView == 1) {
                try {
                    if(sign(firstStr.toDouble()) == -1.0) {
                        firstStr = firstStr.drop(1)
                    }
                    else if (sign(firstStr.toDouble()) == 1.0){
                        firstStr = "-" + firstStr
                    }
                    mTextViewFirst.text = firstStr
                }catch (ex : Throwable) {
                    firstStr = ""
                    mTextViewFirst.text = firstStr
                }
            }
            else {
                try {
                    if(sign(secondStr.toDouble()) == -1.0) {
                        secondStr = secondStr.drop(1)
                    }
                    else if(sign(secondStr.toDouble()) == 1.0){
                        secondStr = "-" + secondStr
                    }
                    mTextViewSecond.text = secondStr
                    curAns = calculate(firstStr, secondStr, curOperator)
                    mTextViewAns.text = "=" + curAns
                } catch (ex : Throwable) {
                    secondStr = ""
                    mTextViewSecond.text = secondStr
                }
            }
        }
    }


    private fun calculate(firstStr: String, secondStr: String, curOperator: String): String {
        val firstNum = firstStr.toDouble()
        val secondNum = secondStr.toDouble()
        var ans: Double = 0.0

        when (curOperator) {
            "+" -> {
                ans = firstNum + secondNum
            }
            "-" -> {
                ans = firstNum - secondNum
            }
            "*" -> {
                ans = firstNum * secondNum
            }
            "/" -> {
                assert(secondNum == 0.0)
                ans = firstNum / secondNum
            }
        }
        var ansStr = "$ans"
        if(ansStr[ansStr.length - 1] == '0' && ansStr[ansStr.length - 2] == '.') {
            return "${ans.toInt()}"
        }
        else {
            return ansStr
        }


    }
}
