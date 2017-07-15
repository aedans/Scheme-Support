package com.ackdevelopment.plugins.scheme.lang;

import com.intellij.lang.Language;

/**
 * Created by Aedan Smith.
 */

public class SchemeLanguage extends Language {
    public static final SchemeLanguage SCHEME_LANGUAGE = new SchemeLanguage();

    private SchemeLanguage() {
        super("Scheme");
    }
}
