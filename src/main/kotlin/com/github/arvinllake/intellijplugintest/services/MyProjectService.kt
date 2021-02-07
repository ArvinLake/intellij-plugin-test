package com.github.arvinllake.intellijplugintest.services

import com.github.arvinllake.intellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
