package com.rafi.rafiapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rafi.rafiapp.databinding.ItemRowLaptopBinding

class CustomAdapter(private val mList: List<Item>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemRowLaptopBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemRowLaptopBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.binding.apply {
            imgItem.setImageResource(ItemsViewModel.image)
            txtItem.setText(ItemsViewModel.text)

            root.setOnClickListener{
                root.context.startActivity(
                    Intent(root.context, DetailActivity::class.java)
                        .putExtra(DetailActivity.dataEx, ItemsViewModel)
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}