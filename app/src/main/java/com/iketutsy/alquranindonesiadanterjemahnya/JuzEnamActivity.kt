package com.iketutsy.alquranindonesiadanterjemahnya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.google.android.gms.ads.*

class JuzEnamActivity : AppCompatActivity() {
    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("alquran_indonesia_dan_terjemahnya.pdf")
                .pages(
                        291 ,
                        292	,
                        293	,
                        294	,
                        295	,
                        296	,
                        297	,
                        298	,
                        299	,
                        300	,
                        301	,
                        302	,
                        303	,
                        304	,
                        305	,
                        306	,
                        307	,
                        308	,
                        309	,
                        310	,
                        311	,
                        312	,
                        313	,
                        314	,
                        315	,
                        316	,
                        317	,
                        318
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
