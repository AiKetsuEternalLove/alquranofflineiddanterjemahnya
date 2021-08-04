package com.iketutsy.alquranindonesiadanterjemahnya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*


class MainActivity : AppCompatActivity() {
    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMukodimah = findViewById<Button>(R.id.btnMukodimah)
        val btnJuz1 = findViewById<Button>(R.id.btnJuz1)
        val btnJuz2 = findViewById<Button>(R.id.btnJuz2)
        val btnJuz3 = findViewById<Button>(R.id.btnJuz3)
        val btnJuz4 = findViewById<Button>(R.id.btnJuz4)
        val btnJuz5 = findViewById<Button>(R.id.btnJuz5)
        val btnJuz6 = findViewById<Button>(R.id.btnJuz6)
        val btnJuz7 = findViewById<Button>(R.id.btnJuz7)
        val btnJuz8 = findViewById<Button>(R.id.btnJuz8)
        val btnJuz9 = findViewById<Button>(R.id.btnJuz9)
        val btnJuz10 = findViewById<Button>(R.id.btnJuz10)
        val btnJuz11 = findViewById<Button>(R.id.btnJuz11)
        val btnJuz12 = findViewById<Button>(R.id.btnJuz12)
        val btnJuz13 = findViewById<Button>(R.id.btnJuz13)
        val btnJuz14 = findViewById<Button>(R.id.btnJuz14)
        val btnJuz15 = findViewById<Button>(R.id.btnJuz15)
        val btnJuz16 = findViewById<Button>(R.id.btnJuz16)
        val btnJuz17 = findViewById<Button>(R.id.btnJuz17)
        val btnJuz18 = findViewById<Button>(R.id.btnJuz18)
        val btnJuz19 = findViewById<Button>(R.id.btnJuz19)
        val btnJuz20 = findViewById<Button>(R.id.btnJuz20)
        val btnJuz21 = findViewById<Button>(R.id.btnJuz21)
        val btnJuz22 = findViewById<Button>(R.id.btnJuz22)
        val btnJuz23 = findViewById<Button>(R.id.btnJuz23)
        val btnJuz24 = findViewById<Button>(R.id.btnJuz24)
        val btnJuz25 = findViewById<Button>(R.id.btnJuz25)
        val btnJuz26 = findViewById<Button>(R.id.btnJuz26)
        val btnJuz27 = findViewById<Button>(R.id.btnJuz27)
        val btnJuz28 = findViewById<Button>(R.id.btnJuz28)
        val btnJuz29 = findViewById<Button>(R.id.btnJuz29)
        val btnJuz30 = findViewById<Button>(R.id.btnJuz30)

        btnMukodimah.setOnClickListener {
            val intent = Intent(this, MukodimahActivity::class.java)
            startActivity(intent)
        }
        btnJuz1.setOnClickListener { val intent = Intent(this, JuzSatuActivity::class.java)
            startActivity(intent) }
        btnJuz2.setOnClickListener { val intent = Intent(this, JuzDuaActivity::class.java)
            startActivity(intent) }
        btnJuz3.setOnClickListener { val intent = Intent(this, JuzTigaActivity::class.java)
            startActivity(intent) }
        btnJuz4.setOnClickListener { val intent = Intent(this, JuzEmpatActivity::class.java)
            startActivity(intent) }
        btnJuz5.setOnClickListener { val intent = Intent(this, JuzLimaActivity::class.java)
            startActivity(intent) }
        btnJuz6.setOnClickListener { val intent = Intent(this, JuzEnamActivity::class.java)
            startActivity(intent) }
        btnJuz7.setOnClickListener { val intent = Intent(this, JuzTujuhActivity::class.java)
            startActivity(intent) }
        btnJuz8.setOnClickListener { val intent = Intent(this, JuzDelapanActivity::class.java)
            startActivity(intent) }
        btnJuz9.setOnClickListener { val intent = Intent(this, JuzSembilanActivity::class.java)
            startActivity(intent) }
        btnJuz10.setOnClickListener { val intent = Intent(this, JuzSepuluhActivity::class.java)
            startActivity(intent) }
        btnJuz11.setOnClickListener { val intent = Intent(this, JuzSebelasActivity::class.java)
            startActivity(intent) }
        btnJuz12.setOnClickListener { val intent = Intent(this, JuzDuaBelasActivity::class.java)
            startActivity(intent) }
        btnJuz13.setOnClickListener { val intent = Intent(this, JuzTigaBelasActivity::class.java)
            startActivity(intent) }
        btnJuz14.setOnClickListener { val intent = Intent(this, JuzEmpatBelasActivity::class.java)
            startActivity(intent) }
        btnJuz15.setOnClickListener { val intent = Intent(this, JuzLimaBelasActivity::class.java)
            startActivity(intent) }
        btnJuz16.setOnClickListener { val intent = Intent(this, JuzEnamBelasActivity::class.java)
            startActivity(intent) }
        btnJuz17.setOnClickListener { val intent = Intent(this, JuzTujuhBelasActivity::class.java)
            startActivity(intent) }
        btnJuz18.setOnClickListener { val intent = Intent(this, JuzDelapanBelasActivity::class.java)
            startActivity(intent) }
        btnJuz19.setOnClickListener { val intent = Intent(this, JuzSembilanBelasActivity::class.java)
            startActivity(intent) }
        btnJuz20.setOnClickListener { val intent = Intent(this, JuzDuaPuluhActivity::class.java)
            startActivity(intent) }
        btnJuz21.setOnClickListener { val intent = Intent(this, JuzDuaPuluhSatuActivity::class.java)
            startActivity(intent) }
        btnJuz22.setOnClickListener { val intent = Intent(this, JuzDuaPuluhDuaActivity::class.java)
            startActivity(intent) }
        btnJuz23.setOnClickListener { val intent = Intent(this, JuzDuaPuluhTigaActivity::class.java)
            startActivity(intent) }
        btnJuz24.setOnClickListener { val intent = Intent(this, JuzDuaPuluhEmpatActivity::class.java)
            startActivity(intent) }
        btnJuz25.setOnClickListener { val intent = Intent(this, JuzDuaPuluhLimaActivity::class.java)
            startActivity(intent) }
        btnJuz26.setOnClickListener { val intent = Intent(this, JuzDuaPuluhEnamActivity::class.java)
            startActivity(intent) }
        btnJuz27.setOnClickListener { val intent = Intent(this, JuzDuaPuluhTujuhActivity::class.java)
            startActivity(intent) }
        btnJuz28.setOnClickListener { val intent = Intent(this, JuzDuaPuluhDelapanActivity::class.java)
            startActivity(intent) }
        btnJuz29.setOnClickListener { val intent = Intent(this, JuzDuaPuluhSembilanActivity::class.java)
            startActivity(intent) }
        btnJuz30.setOnClickListener { val intent = Intent(this, JuzTigaPuluhActivity::class.java)
            startActivity(intent) }

        var mAdView = AdView(this)
        mAdView.adSize = AdSize.BANNER
        mAdView.adUnitId = "ca-app-pub-7744888115839081/1224360563"
        // TODO: Add adView to your view hierarchy.

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mAdView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(adError: LoadAdError) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }
    }
}