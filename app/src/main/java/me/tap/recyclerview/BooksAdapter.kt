package me.tap.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_books.view.*

class BooksAdapter(val context: Context, val books: List<Books>) :
    RecyclerView.Adapter<BooksAdapter.BookViewHolder>() {

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentBook: Books? = null
        var currentPosition: Int = 0

        init {
            //For when items are clicked
            itemView.setOnClickListener {
                Toast.makeText(context, currentBook!!.title + " Clicked", Toast.LENGTH_SHORT).show()
            }

            //on click listener set for the share icon to share books with other apps
            itemView.imageShare.setOnClickListener {
                val message: String = "My Favorite book is: " + currentBook!!.title

                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"

                context.startActivity(Intent.createChooser(intent, " Please select app: "))
            }
        }

        fun setData(books: Books?, pos: Int) {
            itemView.textTitle.text = books!!.title

            this.currentBook = books
            this.currentPosition = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_books, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.setData(book, position)
    }
}
