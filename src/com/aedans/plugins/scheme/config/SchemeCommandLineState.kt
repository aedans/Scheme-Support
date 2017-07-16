package com.aedans.plugins.scheme.config

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.KillableProcessHandler
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment

/**
 * Created by Aedan Smith.
 */

class SchemeCommandLineState(environment: ExecutionEnvironment, val runConfiguration: SchemeRunConfiguration)
    : CommandLineState(environment) {
    override fun startProcess(): ProcessHandler {
        val commandLine = GeneralCommandLine()
        commandLine.exePath = runConfiguration.interpreterPath
        commandLine.parametersList.addParametersString(runConfiguration.interpreterParameters)
        val processHandler = KillableProcessHandler(commandLine)
        ProcessTerminatedListener.attach(processHandler, environment.project)
        return processHandler
    }
}
