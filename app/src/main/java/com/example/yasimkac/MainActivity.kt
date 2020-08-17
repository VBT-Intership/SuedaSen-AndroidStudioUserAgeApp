package com.example.yasimkac
import java.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        YasButonu.setOnClickListener(View.OnClickListener {
            var dogumYili:Int=editTextNumber2.text.toString().toInt()//Önce stringe sonra integere çeviricez ki işlem yapalım
            var guncelYıl:Int=Calendar.getInstance().get(Calendar.YEAR)

            var yas=guncelYıl-dogumYili

            //textView.text= "Yaşınız: $yas"//Edittextten de bilgi alırken textview yazarken de text kullanılır
            textView.setText("Yaşınız: " + yas)
        })

    }
}