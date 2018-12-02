package net.bradball.android.themeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import net.bradball.android.themeapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var appBar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appBar = app_toolbar
        setSupportActionBar(appBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navcontroller = findNavController(R.id.fragment_nav_host)
        setupActionBarWithNavController(navcontroller, AppBarConfiguration.Builder().build())
        appBar.title = "My Application"
    }
}
