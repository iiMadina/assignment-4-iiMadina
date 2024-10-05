package edu.temple.assignment4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val displayImageView = findViewById<ImageView>(R.id.imageView)
        val displayTextView = findViewById<TextView>(R.id.textView)

        val images = arrayOf(
            ImageItem(R.drawable.josh_kerr, "Josh Kerr"),
            ImageItem(R.drawable.alex_walsh, "Alex Walsh"),
            ImageItem(R.drawable.maria_perez, "Maria Perez"),
            ImageItem(R.drawable.ravi_dahiya, "Ravi Dahiya"),
            ImageItem(R.drawable.spencer_lee, "Spencer Lee"),
            ImageItem(R.drawable.carlos_alcaraz, "Carlos Alcaraz"),
            ImageItem(R.drawable.leo_neugebauer, "Leo Neugebauer"),
            ImageItem(R.drawable.mykayla_skinner, "MyKayla Skinner"),
            ImageItem(R.drawable.neeraj_chopra, "Neeraj Chopra"),
            ImageItem(R.drawable.prisca_awiti, "Prisca Awiti"),
            ImageItem(R.drawable.richard_torrez_jr, "Richard Torrez Jr"),
            ImageItem(R.drawable.simone_biles, "Simone Biles"),
            ImageItem(R.drawable.yusuf_dikec, "Yusuf Dikec"),
            ImageItem(R.drawable.joe_kovacs, "Joe Kovacs"),
            ImageItem(R.drawable.mckayla_maroney, "McKayla Maroney")
        )

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, 1)

        recyclerView.adapter = ImageAdapter(images) {item: ImageItem ->
            displayImageView.setImageResource(item.image)
            displayTextView.text = item.imageName
        }
    }
}