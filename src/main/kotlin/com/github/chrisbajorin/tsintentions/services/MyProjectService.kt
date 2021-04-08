package com.github.chrisbajorin.tsintentions.services

import com.github.chrisbajorin.tsintentions.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
