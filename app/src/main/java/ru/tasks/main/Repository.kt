package ru.tasks.main

import ru.tasks.adapter.TaskItem

object Repository  {
    var tasks: List<TaskItem> = listOf(
        TaskItem(text = "1 задача"),
        TaskItem(text = "2 задача"),
        TaskItem(text = "3 задача"),
    )
}