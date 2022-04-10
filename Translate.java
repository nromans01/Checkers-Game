class Translate { // translate class start

   private String startL;
   private String toL;
   private String toFrom;
   
   public Translate(String sl, String tl) { // constructor start
      startL = sl;
      toFrom += translater(startL);
      toFrom += " ";
      toL = tl;
      toFrom += translater(toL);
      
   } // constructor end
   
   public String translater(String space){ // translator method start
      String changed = "";
      String colm;
      String row;
      
      
      row = space.substring(0,1);
      colm = space.substring(1);
      
      
      if (colm.equals("8")){
         changed += "0";
      }
      else if (colm.equals("7")){
         changed += "1";
      }
      else if (colm.equals("6")){
         changed += "2";
      }
      else if (colm.equals("5")){
         changed += "3";
      }
      else if (colm.equals("4")){
         changed += "4";
      }
      else if (colm.equals("3")){
         changed += "5";
      }
      else if (colm.equals("2")){
         changed += "6";
      }
      else if (colm.equals("1")){
         changed += "7";
      }
      
      
      if (row.equals("a")){
         changed += "0";
      }
      else if (row.equals("b")){
         changed += "1";
      }
       else if (row.equals("c")){
         changed += "2";
      }
       else if (row.equals("d")){
         changed += "3";
      }
       else if (row.equals("e")){
         changed += "4";
      }
       else if (row.equals("f")){
         changed += "5";
      }
       else if (row.equals("g")){
         changed += "6";
      }
       else if (row.equals("h")){
         changed += "7";
      }
      
      return changed;
   } // translator method end
   
   public String retMoves(){
      toFrom = toFrom.substring(4);
      return toFrom;
   }

} // Translate class end


// 