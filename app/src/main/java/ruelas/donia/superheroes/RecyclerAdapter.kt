package ruelas.donia.superheroes
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var superheros: MutableList<Superhero>  = ArrayList()
    lateinit var context:Context
    //constructor
    fun RecyclerAdapter(superheros : MutableList<Superhero>, context: Context){
        this.superheros = superheros
        this.context = context
    }
    // Clase ViewHolder:  hace referencia a los items de la celda
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /* el view.findViewByID() busca los items a través de id, y
        *luego añadimos el as X donde X es el tipo del componente (ImageView, TextView…).
        */
        val superheroName = view.findViewById(R.id.tvSuperhero) as TextView
        val realName = view.findViewById(R.id.tvRealName) as TextView
        val publisher = view.findViewById(R.id.tvPublisher) as TextView
        val avatar = view.findViewById(R.id.ivAvatar) as ImageView
        val cvElemento = view.findViewById<CardView>(R.id.cvElemento)



        // dicho método lo llamamos desde  onBindViewHolder() para que rellene los datos
        fun bind(superhero:Superhero, context: Context){
            superheroName.text = superhero.name
            realName.text = superhero.realName
            publisher.text = superhero.publisher
            //la vista (celda)
            //itemView.setOnClickListener(View.OnClickListener {
                //Toast.makeText(context, superhero.name, Toast.LENGTH_SHORT).show()

            //})

            cvElemento.setOnClickListener{
                val intent = Intent(context, HeroDetailsActivity::class.java)
                intent.putExtra("name", superhero.name)
                intent.putExtra("photo",superhero.photo)
                intent.putExtra("realname",superhero.realName)
                intent.putExtra("company",superhero.publisher)
                intent.putExtra("description",superhero.description)
                context.startActivity(intent)
            }


            avatar.loadUrl(superhero.photo)
        }
        fun ImageView.loadUrl(url: String) {
            Picasso.get().load(url).into(this)
        }
    }

    //coge cada una de las posiciones de la lista de superhéroes y
    // pasarlas a la clase ViewHolder para que esta pinte todos los valores.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = superheros.get(position)
        holder.bind(item, context)
    }
    //devuelve un objeto ViewHolder al cual le pasamos la celda que hemos creado.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_superhero_list, parent, false))
    }
    //devuelve el tamaño de la lista, que lo necesita el RecyclerView.
    override fun getItemCount(): Int {
        return superheros.size
    }
}