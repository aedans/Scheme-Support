package com.aedans.plugins.scheme.editor

/**
 * Created by Aedan Smith.
 */

val schemeColorSettingsPageDemoText = """
(define true #t)
(define false #f)

;;; For loop implementation
;;; Usage: (for '(0 1 2 3 4) as i (print i))
;;;    or: (for i in '(0 1 2 3 4) (print i))
(define-syntax for
  (syntax-rules (in as)
    ((for element in list body ...)
     (map (lambda (element)
            body ...)
          list))
    ((for list as element body ...)
     (for element in list body ...))))
""".substring(1)
