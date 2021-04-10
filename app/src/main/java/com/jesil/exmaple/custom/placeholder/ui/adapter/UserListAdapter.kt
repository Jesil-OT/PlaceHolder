package com.jesil.exmaple.custom.placeholder.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jesil.exmaple.custom.placeholder.data.model.UserData
import com.jesil.exmaple.custom.placeholder.databinding.ItemPositionBinding

class UserListAdapter : ListAdapter<UserData, UserListAdapter.UserListAdapterViewHolder>(UserComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListAdapterViewHolder {
        val binding = ItemPositionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserListAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserListAdapterViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null){
            holder.bind(currentItem)
        }
    }

    class UserListAdapterViewHolder(private val binding: ItemPositionBinding) :
        RecyclerView.ViewHolder(binding.root){

            fun bind(userData: UserData) {
                binding.apply {
                    Glide.with(itemView)
                        .load(userData.picture)
                        .into(userPhoto)
                    userName.text = userData.firstName + " " + userData.lastName
                    userEmail.text = userData.email
                    userTitle.text = userData.title
                }
            }
        }


    class UserComparator : DiffUtil.ItemCallback<UserData>(){
        override fun areItemsTheSame(oldItem: UserData, newItem: UserData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: UserData, newItem: UserData): Boolean {
            return oldItem == newItem
        }
    }
}