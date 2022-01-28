package org.geeksforgeeks.changingbackgroundanimation

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRelativeLayout = findViewById<RelativeLayout>(R.id.relative_layout_1)
        val mButton = findViewById<Button>(R.id.button_1)

        val mColors = arrayOf(ColorDrawable(Color.GREEN), ColorDrawable(Color.RED))

        mButton.setOnClickListener {
            val mTransition = TransitionDrawable(mColors)
            mRelativeLayout.background = mTransition
            mTransition.startTransition(2000)
        }
    }
}