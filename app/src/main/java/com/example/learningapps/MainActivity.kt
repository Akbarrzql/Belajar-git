package com.example.learningapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CHANNEL_ID
        var builder = NotificationCompat.Builder(this, )
            .setSmallIcon(R.drawable.notification)
            .setContentTitle("Progress Belajar")
            .setContentText("Hi, Selesaikan Kelasmu Di kotlin Programming")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }

    fun MoveKotlinLeraning(view: View) {
        val intent = Intent(this, KotlinActivity::class.java)
        startActivity(intent)
    }

    fun MoveJavaLearning(view: View) {
        val intent = Intent(this, JavaActivity::class.java)
        startActivity(intent)
    }

}