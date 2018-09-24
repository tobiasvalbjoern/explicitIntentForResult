package dk.tobias.activities.intents

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val RC_SECOND_ACTIVITY=1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val i = Intent(this, Activity2::class.java)
            i.putExtra("${R.string.input}", "hello new world!")
            startActivityForResult(i,RC_SECOND_ACTIVITY)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==RC_SECOND_ACTIVITY){
            if(resultCode==Activity.RESULT_OK){
                textView.text = data?.getStringExtra("Activity2")
            }
        }
    }
}
