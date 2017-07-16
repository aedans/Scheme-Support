package com.aedans.plugins.scheme.lang.psi;

import com.aedans.plugins.scheme.lang.psi.gen.SchemeId;

/**
 * Created by Aedan Smith.
 */

public class SchemePsiImplUtil {
    public static String getName(SchemeId schemeId) {
        return schemeId.getText();
    }
}
