package ruelas.donia.superheroes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }
    
    private fun getSuperheros(): MutableList<Superhero>{
        val superheros:MutableList<Superhero> = ArrayList()
        superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg","Iron Man, también conocido como Tony Stark, es un personaje icónico del universo Marvel, én conocido como Tony Stark, es un personaje én conocido como Tony Stark, es un personaje icónico del universo Marvel icónico del universo Marvelcreado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby. Apareció por primera vez en \"Tales of Suspense\" #39 en 1963."))
        return superheros
    }

    fun setUpRecyclerView(){
        val mAdapter: RecyclerAdapter = RecyclerAdapter()

        //busca el layout del recycleView y lo asigna a la variable
        val mRecyclerView : RecyclerView = findViewById(R.id.rvSuperheroList)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        //llamamos al Adapter creado y le pasamos los parametros
        mAdapter.RecyclerAdapter(getSuperheros(), this)
        mRecyclerView.adapter = mAdapter

    }
}