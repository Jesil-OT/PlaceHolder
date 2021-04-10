package com.jesil.exmaple.custom.placeholder.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.jesil.exmaple.custom.placeholder.databinding.ActivityUserBinding
import com.jesil.exmaple.custom.placeholder.ui.adapter.UserListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserActivity : AppCompatActivity() {

    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userAdapter = UserListAdapter()

        binding.apply {
            recyclerView.apply {
                adapter = userAdapter
            }

            viewModel.user.observe(this@UserActivity){
                userAdapter.submitList(it.data)
            }
        }
    }


}