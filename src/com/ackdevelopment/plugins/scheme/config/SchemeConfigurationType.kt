package com.ackdevelopment.plugins.scheme.config

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project
import icons.SchemePluginIcons
import javax.swing.Icon

/**
 * Created by Aedan Smith.
 */

class SchemeConfigurationType : ConfigurationType {
    private val configurationFactory = object : ConfigurationFactory(this) {
        override fun createTemplateConfiguration(project: Project): RunConfiguration {
            return SchemeRunConfiguration(project, this)
        }
    }

    override fun getDisplayName(): String {
        return "Scheme Runtime"
    }

    override fun getConfigurationTypeDescription(): String {
        return "Scheme runtime configuration"
    }

    override fun getIcon(): Icon {
        return SchemePluginIcons.SCHEME_ICON
    }

    override fun getId(): String {
        return "com.ackdevelopment.plugins.scheme.config.SchemeConfigurationType"
    }

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(configurationFactory)
    }
}
