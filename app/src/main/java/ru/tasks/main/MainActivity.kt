package ru.tasks.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import ru.tasks.R
import ru.tasks.adapter.TasksAdapter

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var adapter: TasksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        adapter = TasksAdapter()
        recyclerViewTasks.adapter = adapter

        viewModel.viewState().observe(this, Observer<MainViewState> { t ->
            t?.let { adapter.tasks = it.tasks }
        })

    }
}