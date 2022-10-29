package com.example.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val version = editTextAndroidVersion.text
        val codeName = editTextAndroidCodeName.text

        if(version.toString() == ""  || codeName.toString() == ""){
            return;
        }

        val templateLayout = templateId.layoutParams
        val textLayout = templateTextId.layoutParams
        val tableRow = TableRow(applicationContext)
        val textView1 = TextView(applicationContext)
        val textView2 = TextView(applicationContext)

        textView1.text = version
        textView1.layoutParams = textLayout
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16.0f)
        textView2.text = codeName
        textView2.layoutParams = textLayout
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16.0f)

        tableRow.background = templateId.background
        tableRow.layoutParams = templateLayout
        tableRow.addView(textView1)
        tableRow.addView(textView2)
        tableLayoutId.addView(tableRow)

        editTextAndroidVersion.setText("")
        editTextAndroidCodeName.setText("")
    }
}
