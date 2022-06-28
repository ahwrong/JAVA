package com.varxyz.jv251.exception;

@SuppressWarnings("serial")
public class DuplicatedEntiyException extends RuntimeException {
   public DuplicatedEntiyException(String msg) {
      super(msg);
   }
}