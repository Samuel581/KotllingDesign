package com.example.mdc

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.mdc.databinding.ActivityScrollingBinding
import com.google.android.material.bottomappbar.BottomAppBar

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_scrolling)
        //Vinculando con Binding

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root) //-> Raiz de la vista AKA

        //Usando binding
        binding.fab.setOnClickListener {
            if (binding.bottonAppBar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER){
                binding.bottonAppBar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_END
            }
            else{
                binding.bottonAppBar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
            }
        }
        //Snackbar

        binding.bottonAppBar.setNavigationOnClickListener({
            Snackbar.make(binding.root, "Evento exitoso", Snackbar.LENGTH_LONG)
                .setAnchorView(binding.fab)
                .show()
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}