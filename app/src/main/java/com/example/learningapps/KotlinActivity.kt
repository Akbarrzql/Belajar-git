package com.example.learningapps

import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kotlin.*


class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)


        pknbtn.setOnClickListener {
            if (expandblelayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(cardview, AutoTransition())
                expandblelayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(cardview, AutoTransition())
                expandblelayout.visibility = View.GONE
            }
            ObjectAnimator.ofFloat(0f, 100f).apply {
                duration = 1000
                start()
            }

           pknbtn1.setOnClickListener {
                if (expandblelayout1.visibility == View.GONE) {
                    TransitionManager.beginDelayedTransition(cardview1, AutoTransition())
                    expandblelayout1.visibility = View.VISIBLE
                } else {
                    TransitionManager.beginDelayedTransition(cardview1, AutoTransition())
                    expandblelayout1.visibility = View.GONE
                }
                ObjectAnimator.ofFloat(0f, 100f).apply {
                    duration = 1000
                    start()
                }
            }

            pknbtn2.setOnClickListener {
                if (expandblelayout2.visibility == View.GONE) {
                    TransitionManager.beginDelayedTransition(cardview2, AutoTransition())
                    expandblelayout2.visibility = View.VISIBLE
                } else {
                    TransitionManager.beginDelayedTransition(cardview2, AutoTransition())
                    expandblelayout2.visibility = View.GONE
                }
                ObjectAnimator.ofFloat(0f, 100f).apply {
                    duration = 1000
                    start()
                }
            }
        }
    }

    fun moveyt(view: View) {
        val intent = Intent( Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6dSNbskzlz4&t=10s")
    );
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.google.android.youtube");
        startActivity(intent)}

    fun moveartikel(view: View) {
        val uri = Uri.parse("https://medium.com/@rezkyauliapratama/part-1-hei-kotlin-pengenalan-7dd31a263a8e")

        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

}
