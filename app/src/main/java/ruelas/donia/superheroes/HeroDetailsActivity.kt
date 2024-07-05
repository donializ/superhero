package ruelas.donia.superheroes

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HeroDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_details2)

        val bundle = intent.extras
        val nameHero = bundle?.getString("name")
        val tvName = findViewById<TextView>(R.id.tvName)
        tvName.text = nameHero
    }
}