package com.example.a334zyrianov

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class toolbar : AppCompatActivity() {
    lateinit var tb:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        val video:VideoView=findViewById(R.id.videoView)
        val medioaController=MediaController(this)
        medioaController.setAnchorView(video)
        val onLineurl = Uri.parse("https://rr3---sn-25ge7nzd.googlevideo.com/videoplayback?expire=1671038319&ei=D7GZY42gGo6L6dsP_7GxuAk&ip=185.147.212.18&id=o-ALB2_2a8QS1d8guABM4x1RCFL78MzCMu-BPyym2nZFmM&itag=18&source=youtube&requiressl=yes&mh=pm&mm=31%2C26&mn=sn-25ge7nzd%2Csn-h5qzened&ms=au%2Conr&mv=m&mvi=3&pl=24&initcwndbps=702500&spc=zIddbCVt1AqOUpQt9mWJGT01jjnMcws&vprv=1&mime=video%2Fmp4&ns=H7pnqCuW5loMz_b62l6hRTwK&cnr=14&ratebypass=yes&dur=165.720&lmt=1664315358357458&mt=1671015922&fvip=1&fexp=24001373%2C24007246&c=WEB&txp=5538434&n=Uwrf6OHMHatKEQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgXryJbfZstp62DU1bSqDeOvqjy7eMLxfzjxcFF_xb1tYCIAD7M7OucMuCqmBG7fvCsgkRcST46b1UaTia8SaUjOus&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRAIgGD7WKFXwscjZbqKPXvkal3NE-lvzPplJGZfSh_JUqbACIDH5N2KxxcpQ99q2S-fUP78mVR1Q7uZ9kyIjbyj8RsTu")
        video.setMediaController(medioaController)
        video.setVideoURI(onLineurl)
        video.requestFocus()

        val video2:VideoView=findViewById(R.id.videoView2)
        val mediaController2=MediaController(this)
        medioaController.setAnchorView(video2)

        val offl=Uri.parse("android.resourse://$packageName/${R.raw.klaus2}")
        video2.setMediaController(mediaController2)
        video2.setVideoURI(offl)
        video2.requestFocus()

        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Клаус"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                val inte = Intent(this, development::class.java)
                startActivity(inte)
                finish()
            }
            R.id.one -> {
                Toast.makeText(this, "работает", Toast.LENGTH_SHORT).show()
            }
            R.id.two -> {
                val intent = Intent(this@toolbar, Signin::class.java)
                startActivity(intent)
                finish()
            }
            R.id.three -> {
                val intent = Intent(this@toolbar, UserProfile::class.java)
                startActivity(intent)
                finish()
            }
        }
        return true
    }
}