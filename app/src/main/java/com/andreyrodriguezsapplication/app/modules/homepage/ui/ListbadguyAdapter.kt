package com.andreyrodriguezsapplication.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.databinding.RowListbadguyBinding
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.ListbadguyRowModel
import kotlin.Int
import kotlin.collections.List

class ListbadguyAdapter(
  var list: List<ListbadguyRowModel>
) : RecyclerView.Adapter<ListbadguyAdapter.RowListbadguyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbadguyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbadguy,parent,false)
    return RowListbadguyVH(view)
  }

  override fun onBindViewHolder(holder: RowListbadguyVH, position: Int) {
    val listbadguyRowModel = ListbadguyRowModel()
    // TODO uncomment following line after integration with data source
    // val listbadguyRowModel = list[position]
    holder.binding.listbadguyRowModel = listbadguyRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbadguyRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListbadguyRowModel
    ) {
    }
  }

  inner class RowListbadguyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbadguyBinding = RowListbadguyBinding.bind(itemView)
  }
}
