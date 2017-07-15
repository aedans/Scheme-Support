package com.ackdevelopment.plugins.scheme.config

import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

/**
 * Created by Aedan Smith.
 */

class SchemeRunConfiguration(project: Project, configurationFactory: ConfigurationFactory)
    : RunConfigurationBase(project, configurationFactory, "Scheme Run Configuration") {
    var interpreterPath = ""
    var interpreterParameters = ""

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return SchemeRunConfigurationEditor()
    }

    override fun checkConfiguration() {

    }

    override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): RunProfileState? {
        return SchemeCommandLineState(executionEnvironment, this)
    }
}
