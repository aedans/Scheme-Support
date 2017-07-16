// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SchemeParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABBREVIATION) {
      r = abbreviation(b, 0);
    }
    else if (t == APPLICATION) {
      r = application(b, 0);
    }
    else if (t == BEGIN_DEFINITION) {
      r = begin_definition(b, 0);
    }
    else if (t == BEGIN_EXPRESSION) {
      r = begin_expression(b, 0);
    }
    else if (t == BODY) {
      r = body(b, 0);
    }
    else if (t == CONSTANT) {
      r = constant(b, 0);
    }
    else if (t == DATUM) {
      r = datum(b, 0);
    }
    else if (t == DEFINITION) {
      r = definition(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == FORM) {
      r = form(b, 0);
    }
    else if (t == FORMALS) {
      r = formals(b, 0);
    }
    else if (t == ID) {
      r = id(b, 0);
    }
    else if (t == IF_EXPRESSION) {
      r = if_expression(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = lambda_expression(b, 0);
    }
    else if (t == LET_DEFINITION) {
      r = let_definition(b, 0);
    }
    else if (t == LET_SYNTAX_EXPRESSION) {
      r = let_syntax_expression(b, 0);
    }
    else if (t == LETREC_DEFINITION) {
      r = letrec_definition(b, 0);
    }
    else if (t == LETREC_SYNTAX_EXPRESSION) {
      r = letrec_syntax_expression(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == NIL) {
      r = nil(b, 0);
    }
    else if (t == QUOTE_EXPRESSION) {
      r = quote_expression(b, 0);
    }
    else if (t == SET_EXPRESSION) {
      r = set_expression(b, 0);
    }
    else if (t == SYMBOL) {
      r = symbol(b, 0);
    }
    else if (t == SYNTAX_BINDING) {
      r = syntax_binding(b, 0);
    }
    else if (t == SYNTAX_DEFINITION) {
      r = syntax_definition(b, 0);
    }
    else if (t == SYNTAX_RULES_EXPRESSION) {
      r = syntax_rules_expression(b, 0);
    }
    else if (t == VARIABLE_DEFINITION) {
      r = variable_definition(b, 0);
    }
    else if (t == VECTOR) {
      r = vector(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return simpleFile(b, l + 1);
  }

  /* ********************************************************** */
  // APOSTROPHE datum
  //                | BACKQUOTE datum
  //                | COMMA datum
  //                | COMMA_AT datum
  public static boolean abbreviation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbreviation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBREVIATION, "<abbreviation>");
    r = abbreviation_0(b, l + 1);
    if (!r) r = abbreviation_1(b, l + 1);
    if (!r) r = abbreviation_2(b, l + 1);
    if (!r) r = abbreviation_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // APOSTROPHE datum
  private static boolean abbreviation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbreviation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, APOSTROPHE);
    r = r && datum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BACKQUOTE datum
  private static boolean abbreviation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbreviation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKQUOTE);
    r = r && datum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA datum
  private static boolean abbreviation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbreviation_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && datum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA_AT datum
  private static boolean abbreviation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbreviation_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA_AT);
    r = r && datum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN expression expression* CLOSE_PAREN
  public static boolean application(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && expression(b, l + 1);
    r = r && application_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, APPLICATION, r);
    return r;
  }

  // expression*
  private static boolean application_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "application_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_PAREN BEGIN definition* CLOSE_PAREN
  public static boolean begin_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, BEGIN);
    r = r && begin_definition_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, BEGIN_DEFINITION, r);
    return r;
  }

  // definition*
  private static boolean begin_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_definition_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "begin_definition_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_PAREN BEGIN expression* CLOSE_PAREN
  public static boolean begin_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, BEGIN);
    r = r && begin_expression_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, BEGIN_EXPRESSION, r);
    return r;
  }

  // expression*
  private static boolean begin_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_expression_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "begin_expression_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // definition* expression+
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    r = body_0(b, l + 1);
    r = r && body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // definition*
  private static boolean body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // expression+
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BOOLEAN|NUMBER|CHARACTER|STRING|nil
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = nil(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BOOLEAN|NUMBER|CHARACTER|STRING|symbol|list|vector
  public static boolean datum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATUM, "<datum>");
    r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = vector(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_definition
  //              | syntax_definition
  //              | begin_definition
  //              | let_definition
  //              | letrec_definition
  public static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_definition(b, l + 1);
    if (!r) r = syntax_definition(b, l + 1);
    if (!r) r = begin_definition(b, l + 1);
    if (!r) r = let_definition(b, l + 1);
    if (!r) r = letrec_definition(b, l + 1);
    exit_section_(b, m, DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // constant
  //              | id
  //              | quote_expression
  //              | lambda_expression
  //              | if_expression
  //              | set_expression
  //              | application
  //              | let_syntax_expression
  //              | letrec_syntax_expression
  //              | syntax_rules_expression
  //              | begin_expression
  //              | abbreviation
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = constant(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = quote_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = if_expression(b, l + 1);
    if (!r) r = set_expression(b, l + 1);
    if (!r) r = application(b, l + 1);
    if (!r) r = let_syntax_expression(b, l + 1);
    if (!r) r = letrec_syntax_expression(b, l + 1);
    if (!r) r = syntax_rules_expression(b, l + 1);
    if (!r) r = begin_expression(b, l + 1);
    if (!r) r = abbreviation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // definition|expression
  public static boolean form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "form")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORM, "<form>");
    r = definition(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  //           | OPEN_PAREN id* CLOSE_PAREN
  //           | OPEN_PAREN id+ DOT id CLOSE_PAREN
  public static boolean formals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formals")) return false;
    if (!nextTokenIs(b, "<formals>", IDENTIFIER, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMALS, "<formals>");
    r = id(b, l + 1);
    if (!r) r = formals_1(b, l + 1);
    if (!r) r = formals_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_PAREN id* CLOSE_PAREN
  private static boolean formals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formals_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && formals_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // id*
  private static boolean formals_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formals_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formals_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPEN_PAREN id+ DOT id CLOSE_PAREN
  private static boolean formals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formals_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && formals_2_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // id+
  private static boolean formals_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formals_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formals_2_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ID, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN IF expression expression expression CLOSE_PAREN
  //                 | OPEN_PAREN IF expression expression CLOSE_PAREN
  public static boolean if_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expression_0(b, l + 1);
    if (!r) r = if_expression_1(b, l + 1);
    exit_section_(b, m, IF_EXPRESSION, r);
    return r;
  }

  // OPEN_PAREN IF expression expression expression CLOSE_PAREN
  private static boolean if_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, IF);
    r = r && expression(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PAREN IF expression expression CLOSE_PAREN
  private static boolean if_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, IF);
    r = r && expression(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN LAMBDA formals body CLOSE_PAREN
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, LAMBDA);
    r = r && formals(b, l + 1);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LAMBDA_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN LET_SYNTAX OPEN_PAREN syntax_binding* definition* CLOSE_PAREN
  public static boolean let_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, LET_SYNTAX, OPEN_PAREN);
    r = r && let_definition_3(b, l + 1);
    r = r && let_definition_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LET_DEFINITION, r);
    return r;
  }

  // syntax_binding*
  private static boolean let_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_definition_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!syntax_binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_definition_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // definition*
  private static boolean let_definition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_definition_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_definition_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_PAREN LET_SYNTAX OPEN_PAREN syntax_binding* CLOSE_PAREN expression+ CLOSE_PAREN
  public static boolean let_syntax_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_syntax_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, LET_SYNTAX, OPEN_PAREN);
    r = r && let_syntax_expression_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && let_syntax_expression_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LET_SYNTAX_EXPRESSION, r);
    return r;
  }

  // syntax_binding*
  private static boolean let_syntax_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_syntax_expression_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!syntax_binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_syntax_expression_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // expression+
  private static boolean let_syntax_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_syntax_expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_syntax_expression_5", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN LETREC_SYNTAX OPEN_PAREN syntax_binding* CLOSE_PAREN definition* CLOSE_PAREN
  public static boolean letrec_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, LETREC_SYNTAX, OPEN_PAREN);
    r = r && letrec_definition_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && letrec_definition_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LETREC_DEFINITION, r);
    return r;
  }

  // syntax_binding*
  private static boolean letrec_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_definition_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!syntax_binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letrec_definition_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // definition*
  private static boolean letrec_definition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_definition_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letrec_definition_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_PAREN LETREC_SYNTAX OPEN_PAREN syntax_binding* CLOSE_PAREN expression+ CLOSE_PAREN
  public static boolean letrec_syntax_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_syntax_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, LETREC_SYNTAX, OPEN_PAREN);
    r = r && letrec_syntax_expression_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && letrec_syntax_expression_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LETREC_SYNTAX_EXPRESSION, r);
    return r;
  }

  // syntax_binding*
  private static boolean letrec_syntax_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_syntax_expression_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!syntax_binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letrec_syntax_expression_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // expression+
  private static boolean letrec_syntax_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_syntax_expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letrec_syntax_expression_5", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN datum* CLOSE_PAREN
  //        | OPEN_PAREN datum+ DOT datum CLOSE_PAREN
  //        | abbreviation
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST, "<list>");
    r = list_0(b, l + 1);
    if (!r) r = list_1(b, l + 1);
    if (!r) r = abbreviation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_PAREN datum* CLOSE_PAREN
  private static boolean list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && list_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // datum*
  private static boolean list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!datum(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPEN_PAREN datum+ DOT datum CLOSE_PAREN
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && list_1_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && datum(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // datum+
  private static boolean list_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = datum(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!datum(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN CLOSE_PAREN
  public static boolean nil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nil")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, CLOSE_PAREN);
    exit_section_(b, m, NIL, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN QUOTE datum CLOSE_PAREN
  public static boolean quote_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quote_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, QUOTE);
    r = r && datum(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, QUOTE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // SET id expression
  public static boolean set_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_expression")) return false;
    if (!nextTokenIs(b, SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && id(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, SET_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // form*
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!form(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN id expression CLOSE_PAREN
  public static boolean syntax_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_binding")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && id(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, SYNTAX_BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN DEFINE_SYNTAX id expression CLOSE_PAREN
  public static boolean syntax_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, DEFINE_SYNTAX);
    r = r && id(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, SYNTAX_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN SYNTAX_RULES list expression+ CLOSE_PAREN
  public static boolean syntax_rules_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_rules_expression")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, SYNTAX_RULES);
    r = r && list(b, l + 1);
    r = r && syntax_rules_expression_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, SYNTAX_RULES_EXPRESSION, r);
    return r;
  }

  // expression+
  private static boolean syntax_rules_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_rules_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntax_rules_expression_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PAREN DEFINE id expression CLOSE_PAREN
  //                       | OPEN_PAREN DEFINE OPEN_PAREN id id* CLOSE_PAREN body CLOSE_PAREN
  //                       | OPEN_PAREN DEFINE OPEN_PAREN id id* DOT id CLOSE_PAREN body CLOSE_PAREN
  public static boolean variable_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_definition_0(b, l + 1);
    if (!r) r = variable_definition_1(b, l + 1);
    if (!r) r = variable_definition_2(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION, r);
    return r;
  }

  // OPEN_PAREN DEFINE id expression CLOSE_PAREN
  private static boolean variable_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, DEFINE);
    r = r && id(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PAREN DEFINE OPEN_PAREN id id* CLOSE_PAREN body CLOSE_PAREN
  private static boolean variable_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, DEFINE, OPEN_PAREN);
    r = r && id(b, l + 1);
    r = r && variable_definition_1_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // id*
  private static boolean variable_definition_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_definition_1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPEN_PAREN DEFINE OPEN_PAREN id id* DOT id CLOSE_PAREN body CLOSE_PAREN
  private static boolean variable_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PAREN, DEFINE, OPEN_PAREN);
    r = r && id(b, l + 1);
    r = r && variable_definition_2_4(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && body(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // id*
  private static boolean variable_definition_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_definition_2_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_definition_2_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // POUND OPEN_PAREN datum* CLOSE_PAREN
  public static boolean vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector")) return false;
    if (!nextTokenIs(b, POUND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, POUND, OPEN_PAREN);
    r = r && vector_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, VECTOR, r);
    return r;
  }

  // datum*
  private static boolean vector_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!datum(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vector_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
