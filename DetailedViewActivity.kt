package com.example.thesteptracker1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val highestStepsButton: Button = findViewById(R.id.highestStepsButton)
        val highestStepsText: TextView = findViewById(R.id.highestSteps)
        val averageStepsText: TextView = findViewById(R.id.averageSteps)
        val backButton: Button = findViewById(R.id.backButton)

        // Logic to calculate highest steps and average steps
        highestStepsButton.setOnClickListener {
            // Example logic to find the highest step day and average
            val dailySteps = arrayOf(5000, 7000, 8000, 6000, 7500, 9000, 6500) // Example steps for 7 days
            val highestSteps = dailySteps.maxOrNull() ?: 0
            val averageSteps = dailySteps.average()

            highestStepsText.text = "Day with highest steps: $highestSteps steps"
            averageStepsText.text = "Average steps per day: ${"%.2f".format(averageSteps)} steps"
        }

        // Navigate back to the Main Screen
        backButton.setOnClickListener {
            finish() // Closes the DetailedViewActivity
        }
    }
}


