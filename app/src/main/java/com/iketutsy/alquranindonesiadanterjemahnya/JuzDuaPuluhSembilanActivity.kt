package com.iketutsy.alquranindonesiadanterjemahnya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.google.android.gms.ads.*

class JuzDuaPuluhSembilanActivity : AppCompatActivity() {
    lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("alquran_indonesia_dan_terjemahnya.pdf")
                .pages(
                        1098	,
                        1099	,
                        1100	,
                        1101	,
                        1102	,
                        1103	,
                        1104	,
                        1105	,
                        1106	,
                        1107	,
                        1108	,
                        1109	,
                        1110	,
                        1111	,
                        1112	,
                        1113	,
                        1114	,
                        1115	,
                        1116	,
                        1117	,
                        1118	,
                        1119	,
                        1120	,
                        1121	,
                        1122	,
                        1123	,
                        1124	,
                        1125	,
                        1126	,
                        1127	,
                        1128	,
                        1129	,
                        1130	,
                        1131	,
                        1132	,
                        1133	,
                        1134	,
                        1135	,
                        1136	,
                        1137	,
                        1138	,
                        1139	,
                        1140	,
                        1141	,
                        1142	,
                        1143	,
                        1144	,
                        1145	,
                        1146	,
                        1147	,
                        1148	,
                        1149	,
                        1150	,
                        1151	,
                        1152	,
                        1153	,
                        1154	,
                        1155	,
                        1156
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
