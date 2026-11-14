app/src/main/java/package com.aiphotostudio.app

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aiphotostudio.app.ui.home.HomeScreen
import com.aiphotostudio.app.ui.theme.StudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.dark(Color.TRANSPARENT)
        )
        setContent {
            StudioTheme {
                // PLACEHOLDER values. In step 3 these come from the Firebase backend.
                HomeScreen(balance = 100, isPremium = false)
            }
        }
    }
}
