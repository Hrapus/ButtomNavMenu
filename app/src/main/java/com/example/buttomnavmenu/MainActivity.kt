package com.example.buttomnavmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.buttomnavmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNav.selectedItemId = R.id.item3

        binding.bNav.setOnItemReselectedListener {
            when(it.itemId){
                R.id.item1 -> {
                    Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "item4", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}