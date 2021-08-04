package com.iketutsy.alquranindonesiadanterjemahnya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.google.android.gms.ads.*

class JuzSembilanActivity : AppCompatActivity() {
    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("alquran_indonesia_dan_terjemahnya.pdf")
                .pages(
                        380	,
                        381	,
                        382	,
                        383	,
                        384	,
                        385	,
                        386	,
                        387	,
                        388	,
                        389	,
                        390	,
                        391	,
                        392	,
                        393	,
                        394	,
                        395	,
                        396	,
                        397	,
                        398	,
                        399	,
                        400	,
                        401	,
                        402	,
                        403	,
                        404	,
                        405	,
                        406	,
                        407	,
                        408	,
                        409	,
                        410
                        )
                .scrollHandle(DefaultScrollHandle(this))
                .load()

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
