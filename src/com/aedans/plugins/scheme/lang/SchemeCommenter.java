package com.aedans.plugins.scheme.lang;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Aedan Smith.
 */

public class SchemeCommenter implements Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return ";";

    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "#|";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "|#";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return "#|";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return "|#";
    }
}
