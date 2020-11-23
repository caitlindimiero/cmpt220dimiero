public class Time { // Time class for Problem One
        private int hour;
        private int minute;
        private int second;
        private long time;
      
        public Time() {
          this(System.currentTimeMillis());
        }
        public Time(long elapsedTime) { // Long time data field
          // this((int)(elapsedTime / 3600000) % 24, (int)(elapsedTime / 60000) % 60,
          //   (int)(elapsedTime / 1000) % 60);
          time = elapsedTime;
        }

        public Time(int hour, int minute, int second) {
          // this.hour = hour;
          // this.minute = minute;
          // this.second = second;
          time = hour * 3600 + minute * 60 + second;
        }
        public int getHour() { // Getter method for Hour
          return (int)(time / 3600) % 24;
        }
        public int getMinute() { // Getter method for Minute
          return (int)(time / 60 ) % 60;
        }
        public int getSecond() { // Getter method for Second
          return (int)(time % 60);
        }
        public long getSeconds() { // Getter method for Second
          return time;
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
          return this.getHour()+ ":" + this.getMinute() + ":" + this.getSecond();
        }
        public Object clone() throws CloneNotSupportedException {  
          return super.clone();  
        }
    }


      
