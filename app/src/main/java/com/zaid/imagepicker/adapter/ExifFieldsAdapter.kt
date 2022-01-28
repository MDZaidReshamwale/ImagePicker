package com.zaid.imagepicker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zaid.imagepicker.R
import com.zaid.imagepicker.domain.ExifTagsContainer
import com.zaid.imagepicker.domain.Type
import com.zaid.imagepicker.presenter.PhotoDetailPresenter
import kotlinx.android.synthetic.main.item_exif_data.view.*

class ExifFieldsAdapter(var exifList: List<ExifTagsContainer>, val presenter: PhotoDetailPresenter)
    : RecyclerView.Adapter<ExifFieldsAdapter.ViewHolder>() {

    val viewHolderReferenceList = mutableListOf<ViewHolder>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_exif_data, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = exifList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        viewHolderReferenceList.add(holder)
        holder.bind(exifList[position], presenter)
    }

    fun updateList(exifList: List<ExifTagsContainer>) {
        this.exifList = exifList
        notifyDataSetChanged()
    }

    fun setAddress(address: String) = with(viewHolderReferenceList[0].itemView) {
        text_address.visibility = View.VISIBLE
        text_address.text = address
    }

    fun hideAddress() = with(viewHolderReferenceList[0].itemView) {
        text_address.visibility = View.GONE
        text_address.text = ""
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: ExifTagsContainer, presenter: PhotoDetailPresenter) = with(itemView) {
            text_properties.text = item.getOnStringProperties()
            itemView.setOnClickListener { presenter.onItemPressed(item) }
            when (item.type) {
                Type.GPS -> {
                    image_type.setImageResource(R.drawable.ic_pin_drop_black_24dp)
                    text_type.text = resources.getString(R.string.item_location)
                }
                Type.CAMERA_PROPERTIES -> {
                    image_type.setImageResource(R.drawable.ic_photo_camera_black_24dp)
                    text_type.text = resources.getString(R.string.item_camera_properties)
                }
                Type.DATE -> {
                    image_type.setImageResource(R.drawable.ic_date_range_black_24dp)
                    text_type.text = resources.getString(R.string.item_date)
                }
                Type.DIMENSION -> {
                    image_type.setImageResource(R.drawable.ic_photo_size_select_actual_black_24dp)
                    text_type.text = resources.getString(R.string.item_dimension)
                }
                Type.OTHER -> {
                    image_type.setImageResource(R.drawable.ic_blur_on_black_24dp)
                    text_type.text = resources.getString(R.string.item_other)
                }
                Type.OTHER -> {
                    image_type.setImageResource(R.drawable.ic_blur_on_black_24dp)
                    text_type.text = resources.getString(R.string.item_other)
                }
            }
        }

    }

}


