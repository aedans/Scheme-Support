package com.ackdevelopment.plugins.scheme.config

import com.intellij.execution.configurations.RunProfile
import com.intellij.execution.runners.DefaultProgramRunner

/**
 * Created by Aedan Smith.
 */

class SchemeRunner : DefaultProgramRunner() {
    override fun getRunnerId(): String {
        return "com.ackdevelopment.plugins.scheme.config.SchemeRunner"
    }

    override fun canRun(s: String, runProfile: RunProfile): Boolean {
        return true
    }
}
