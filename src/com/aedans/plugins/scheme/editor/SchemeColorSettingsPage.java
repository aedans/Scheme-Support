package com.aedans.plugins.scheme.editor;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import icons.SchemePluginIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by Aedan Smith.
 */

public class SchemeColorSettingsPage implements ColorSettingsPage {
    private static AttributesDescriptor[] attributesDescriptors = new AttributesDescriptor[] {
            new AttributesDescriptor("Comments", SchemeSyntaxHighlighter.Companion.getCOMMENT_KEY()),
            new AttributesDescriptor("Keywords", SchemeSyntaxHighlighter.Companion.getKEYWORD_KEY()),
            new AttributesDescriptor("Booleans", SchemeSyntaxHighlighter.Companion.getBOOLEAN_KEY()),
            new AttributesDescriptor("Identifiers", SchemeSyntaxHighlighter.Companion.getIDENTIFIER_KEY()),
            new AttributesDescriptor("Parentheses", SchemeSyntaxHighlighter.Companion.getPAREN_KEY()),
            new AttributesDescriptor("Characters", SchemeSyntaxHighlighter.Companion.getCHARACTER_KEY()),
            new AttributesDescriptor("Strings", SchemeSyntaxHighlighter.Companion.getSTRING_KEY()),
            new AttributesDescriptor("Numbers", SchemeSyntaxHighlighter.Companion.getNUMBER_KEY())
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return SchemePluginIcons.SCHEME_ICON;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SchemeSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return SchemeColorSettingsPageDemoTextKt.getSchemeColorSettingsPageDemoText();
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return attributesDescriptors;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Scheme";
    }
}
