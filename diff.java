package simple_merge;

import java.util.ArrayList;

public class diff {
  boolean spaceL=false;
  boolean spaceR=false;
  int spaceNum;
  ArrayList<String> left = new ArrayList<String>();
  ArrayList<String> right = new ArrayList<String>();
  
  //��
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
  public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
  public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
  
  
  diff(boolean sl,boolean sr,int sNum, ArrayList<String> l, ArrayList<String> r){
    this.spaceL = sl;
    this.spaceR = sr;
    this.spaceNum =sNum;
    this.left = l;
    this.right =r;
  }
  public static String yellow(String content){
    return ANSI_YELLOW + content + ANSI_RESET;
  }
  
}