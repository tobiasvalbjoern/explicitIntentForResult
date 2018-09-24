package dk.tobias.activities.intents

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val extras = intent.extras ?: return
        val qString = extras.getString("${R.string.input}")
        Toast.makeText(this, qString, Toast.LENGTH_SHORT).show()

        BackButton.setOnClickListener{
            val returnIntent = Intent()
            val myString = editText.text.toString()
            returnIntent.putExtra("Activity2", myString)
            setResult(Activity.RESULT_OK,returnIntent)
            finish()
        }

    }
}
