public class clock{
      public static void main(String[] args){
          int hour;
          double angle;
          int min;
          String time;
          for(hour=9;hour<9+12;hour++){
            for(min=0;min<12;min++){
              angle=((hour*30)+min*(30-2.5))%360;
              time=hour+":"+min*5;
              System.out.println(time+" - "+angle);}
	 System.out.println();
}}}
