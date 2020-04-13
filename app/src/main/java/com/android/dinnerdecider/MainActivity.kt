package com.android.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList =
        arrayListOf("Mexican", "Italian", "Chineese", "Pizza", "Burger", "Indian Food")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            selectedFoodText.text = foodList[Random().nextInt(foodList.count())]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodText.text.isNotEmpty()) {
                foodList.add(addFoodText.text.toString())
                addFoodText.text.clear()
            } else {
                Toast.makeText(this, getString(R.string.toast_text), Toast.LENGTH_LONG).show()
            }
        }
    }
}
