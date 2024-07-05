package ruelas.donia.superheroes

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso

class HeroDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_details2)

        val bundle = intent.extras
        val nameHero = bundle?.getString("name")
        val photoHero = bundle?.getString("photo")
        val nameRealHero = bundle?.getString("realname")
        val companyHero = bundle?.getString("company")
        val descriptionHero = bundle?.getString("description")

        val tvName = findViewById<TextView>(R.id.tvName)
        val ivAvatar = findViewById<ImageView>(R.id.ivAvatar)
        val tvRealName = findViewById<TextView>(R.id.tvRealName)
        val tvCompany = findViewById<TextView>(R.id.tvCompany)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)

        tvName.text = nameHero
        ivAvatar.loadUrl(photoHero.toString())
        tvRealName.text = nameRealHero
        tvCompany.text = companyHero
        tvDescription.text = descriptionHero

    }
    fun ImageView.loadUrl(url: String) {
        Picasso.get().load(url).into(this)
    }
}