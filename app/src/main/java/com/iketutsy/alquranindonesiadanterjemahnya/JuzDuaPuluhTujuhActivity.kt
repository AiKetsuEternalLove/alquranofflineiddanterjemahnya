package com.iketutsy.alquranindonesiadanterjemahnya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.google.android.gms.ads.*

class JuzDuaPuluhTujuhActivity : AppCompatActivity() {
    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("alquran_indonesia_dan_terjemahnya.pdf")
                .pages(
                        1004	,
                        1005	,
                        1006	,
                        1007	,
                        1008	,
                        1009	,
                        1010	,
                        1011	,
                        1012	,
                        1013	,
                        1014	,
                        1015	,
                        1016	,
                        1017	,
                        1018	,
                        1019	,
                        1020	,
                        1021	,
                        1022	,
                        1023	,
                        1024	,
                        1025	,
                        1026	,
                        1027	,
                        1028	,
                        1029	,
                        1030	,
                        1031	,
                        1032	,
                        1033	,
                        1034	,
                        1035	,
                        1036	,
                        1037	,
                        1038	,
                        1039	,
                        1040	,
                        1041	,
                        1042	,
                        1043	,
                        1044	,
                        1045	,
                        1046	,
                        1047	,
                        1048	,
                        1049	,
                        1050	,
                        1051
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
