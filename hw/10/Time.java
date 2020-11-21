public class Time { // Time class for Problem One
        private int hour;
        private int minute;
        private int second;
        private int time;
      
        public Time() {
          this(System.currentTimeMillis());
        }
        public Time(long elapsedTime) { // Long time data field
          this((int)(elapsedTime / 3600000) % 24, (int)(elapsedTime / 60000) % 60,
            (int)(elapsedTime / 1000) % 60);
        }
        public Time(int hour, int minute, int second) {
          this.hour = hour;
          this.minute = minute;
          this.second = second;
        }
        public int getHour() { // Getter method for Hour
          return hour;
        }
        public int getMinute() { // Getter method for Minute
          return minute;
        }
        public int getSecond() { // Getter method for Second
          return second;
        }
        public void setTime(long elapseTime) {
          hour = (int)((elapseTime / 3600000) % 24);
          minute = (int)((elapseTime / 60000) % 60);
          second = (int)((elapseTime / 1000) % 60);
        }
        public int compareTo(Object arg0) {
            return (int) (time - ((Time) arg0).time);
        }
        @Override
        public String toString() { // toString() method
          return hour + ":" + minute + ":" + second;
        }
        public Object clone(){  
            try{  
                return super.clone();  
            }catch(Exception e){ 
                return null; 
            }
        }
    }


      
