package com.aedans.plugins.scheme.config

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import javax.swing.JComponent

/**
 * Created by Aedan Smith.
 */

class SchemeRunConfigurationEditor : SettingsEditor<SchemeRunConfiguration>() {
    private var lispConfigForm: SchemeConfigForm? = SchemeConfigForm()

    override fun resetEditorFrom(runConfiguration: SchemeRunConfiguration) {
        lispConfigForm!!.reset(runConfiguration)
    }

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(runConfiguration: SchemeRunConfiguration) {
        lispConfigForm!!.apply(runConfiguration)
    }

    override fun createEditor(): JComponent {
        return lispConfigForm!!
    }

    override fun disposeEditor() {
        lispConfigForm = null
    }
}
