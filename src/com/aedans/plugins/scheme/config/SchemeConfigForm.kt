package com.aedans.plugins.scheme.config

import com.intellij.execution.ui.CommonProgramParametersPanel
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.MacroAwareTextBrowseFolderListener
import java.awt.BorderLayout
import javax.swing.JComponent

/**
 * Created by Aedan Smith.
 */

class SchemeConfigForm : CommonProgramParametersPanel() {
    private var interpreterPathComponent: LabeledComponent<JComponent>? = null
    private var interpreterPathField: TextFieldWithBrowseButton? = null

    private fun initOwnComponents() {
        val chooseInterpreterDescriptor = FileChooserDescriptorFactory.createSingleLocalFileDescriptor()
        chooseInterpreterDescriptor.description = "Choose interpreter"

        interpreterPathField = TextFieldWithBrowseButton()
        interpreterPathField!!.addBrowseFolderListener(MacroAwareTextBrowseFolderListener(chooseInterpreterDescriptor, project))

        interpreterPathComponent = LabeledComponent.create(createComponentWithMacroBrowse(interpreterPathField!!), "Interpreter path")
        interpreterPathComponent!!.labelLocation = BorderLayout.WEST
    }

    override fun addComponents() {
        initOwnComponents()

        add(interpreterPathComponent)

        super.addComponents()
    }

    internal fun reset(configuration: SchemeRunConfiguration) {
        interpreterPathField!!.text = configuration.interpreterPath
        setProgramParameters(configuration.interpreterParameters)
    }

    internal fun apply(configuration: SchemeRunConfiguration) {
        configuration.interpreterPath = interpreterPathField!!.text
        configuration.interpreterParameters = programParametersComponent.component.text
    }
}
