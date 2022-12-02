package com.rafi.rafiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rafi.rafiapp.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.inslg.setOnClickListener {
            Toast.makeText(this, "Instagram: rafiasyam__", Toast.LENGTH_SHORT).show()
        }

        binding.gitlg.setOnClickListener {
            Toast.makeText(this, "GitHub: RAFiasyam", Toast.LENGTH_SHORT).show()
        }

        binding.linlg.setOnClickListener {
            Toast.makeText(this, "Linkiden: Rafi Asyam", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}