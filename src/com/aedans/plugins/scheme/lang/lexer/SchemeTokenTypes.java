// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aedans.plugins.scheme.lang.psi.impl.*;

public interface SchemeTokenTypes {

  IElementType ABBREVIATION = new SchemeElementType("ABBREVIATION");
  IElementType APPLICATION = new SchemeElementType("APPLICATION");
  IElementType BEGIN_DEFINITION = new SchemeElementType("BEGIN_DEFINITION");
  IElementType BEGIN_EXPRESSION = new SchemeElementType("BEGIN_EXPRESSION");
  IElementType BODY = new SchemeElementType("BODY");
  IElementType CONSTANT = new SchemeElementType("CONSTANT");
  IElementType DATUM = new SchemeElementType("DATUM");
  IElementType DEFINITION = new SchemeElementType("DEFINITION");
  IElementType EXPRESSION = new SchemeElementType("EXPRESSION");
  IElementType FORM = new SchemeElementType("FORM");
  IElementType FORMALS = new SchemeElementType("FORMALS");
  IElementType IF_EXPRESSION = new SchemeElementType("IF_EXPRESSION");
  IElementType KEYWORD = new SchemeElementType("KEYWORD");
  IElementType LAMBDA_EXPRESSION = new SchemeElementType("LAMBDA_EXPRESSION");
  IElementType LETREC_DEFINITION = new SchemeElementType("LETREC_DEFINITION");
  IElementType LETREC_SYNTAX_EXPRESSION = new SchemeElementType("LETREC_SYNTAX_EXPRESSION");
  IElementType LET_DEFINITION = new SchemeElementType("LET_DEFINITION");
  IElementType LET_SYNTAX_EXPRESSION = new SchemeElementType("LET_SYNTAX_EXPRESSION");
  IElementType LIST = new SchemeElementType("LIST");
  IElementType NIL = new SchemeElementType("NIL");
  IElementType QUOTE_EXPRESSION = new SchemeElementType("QUOTE_EXPRESSION");
  IElementType SET_EXPRESSION = new SchemeElementType("SET_EXPRESSION");
  IElementType SYMBOL = new SchemeElementType("SYMBOL");
  IElementType SYNTAX_BINDING = new SchemeElementType("SYNTAX_BINDING");
  IElementType SYNTAX_DEFINITION = new SchemeElementType("SYNTAX_DEFINITION");
  IElementType VARIABLE = new SchemeElementType("VARIABLE");
  IElementType VARIABLE_DEFINITION = new SchemeElementType("VARIABLE_DEFINITION");
  IElementType VECTOR = new SchemeElementType("VECTOR");

  IElementType APOSTROPHE = new SchemeTokenType("APOSTROPHE");
  IElementType BACKQUOTE = new SchemeTokenType("BACKQUOTE");
  IElementType BEGIN = new SchemeTokenType("BEGIN");
  IElementType BOOLEAN = new SchemeTokenType("BOOLEAN");
  IElementType CHARACTER = new SchemeTokenType("CHARACTER");
  IElementType CLOSE_PAREN = new SchemeTokenType("CLOSE_PAREN");
  IElementType COMMA = new SchemeTokenType("COMMA");
  IElementType COMMA_AT = new SchemeTokenType("COMMA_AT");
  IElementType DEFINE = new SchemeTokenType("DEFINE");
  IElementType DEFINE_SYNTAX = new SchemeTokenType("DEFINE_SYNTAX");
  IElementType DOT = new SchemeTokenType("DOT");
  IElementType IDENTIFIER = new SchemeTokenType("IDENTIFIER");
  IElementType IF = new SchemeTokenType("IF");
  IElementType LAMBDA = new SchemeTokenType("LAMBDA");
  IElementType LETREC_SYNTAX = new SchemeTokenType("LETREC_SYNTAX");
  IElementType LET_SYNTAX = new SchemeTokenType("LET_SYNTAX");
  IElementType NUMBER = new SchemeTokenType("NUMBER");
  IElementType OPEN_PAREN = new SchemeTokenType("OPEN_PAREN");
  IElementType POUND = new SchemeTokenType("POUND");
  IElementType QUOTE = new SchemeTokenType("QUOTE");
  IElementType SET = new SchemeTokenType("SET");
  IElementType STRING = new SchemeTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ABBREVIATION) {
        return new SchemeAbbreviationImpl(node);
      }
      else if (type == APPLICATION) {
        return new SchemeApplicationImpl(node);
      }
      else if (type == BEGIN_DEFINITION) {
        return new SchemeBeginDefinitionImpl(node);
      }
      else if (type == BEGIN_EXPRESSION) {
        return new SchemeBeginExpressionImpl(node);
      }
      else if (type == BODY) {
        return new SchemeBodyImpl(node);
      }
      else if (type == CONSTANT) {
        return new SchemeConstantImpl(node);
      }
      else if (type == DATUM) {
        return new SchemeDatumImpl(node);
      }
      else if (type == DEFINITION) {
        return new SchemeDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SchemeExpressionImpl(node);
      }
      else if (type == FORM) {
        return new SchemeFormImpl(node);
      }
      else if (type == FORMALS) {
        return new SchemeFormalsImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new SchemeIfExpressionImpl(node);
      }
      else if (type == KEYWORD) {
        return new SchemeKeywordImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new SchemeLambdaExpressionImpl(node);
      }
      else if (type == LETREC_DEFINITION) {
        return new SchemeLetrecDefinitionImpl(node);
      }
      else if (type == LETREC_SYNTAX_EXPRESSION) {
        return new SchemeLetrecSyntaxExpressionImpl(node);
      }
      else if (type == LET_DEFINITION) {
        return new SchemeLetDefinitionImpl(node);
      }
      else if (type == LET_SYNTAX_EXPRESSION) {
        return new SchemeLetSyntaxExpressionImpl(node);
      }
      else if (type == LIST) {
        return new SchemeListImpl(node);
      }
      else if (type == NIL) {
        return new SchemeNilImpl(node);
      }
      else if (type == QUOTE_EXPRESSION) {
        return new SchemeQuoteExpressionImpl(node);
      }
      else if (type == SET_EXPRESSION) {
        return new SchemeSetExpressionImpl(node);
      }
      else if (type == SYMBOL) {
        return new SchemeSymbolImpl(node);
      }
      else if (type == SYNTAX_BINDING) {
        return new SchemeSyntaxBindingImpl(node);
      }
      else if (type == SYNTAX_DEFINITION) {
        return new SchemeSyntaxDefinitionImpl(node);
      }
      else if (type == VARIABLE) {
        return new SchemeVariableImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new SchemeVariableDefinitionImpl(node);
      }
      else if (type == VECTOR) {
        return new SchemeVectorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
