package com.github.collinsperry21.s2cplugin.services

import com.intellij.openapi.project.Project
import com.github.collinsperry21.s2cplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
