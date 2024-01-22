package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
   private String octValue;
   
   public OctalObserver(Subject subject) {
        this.subject = subject;
   }

   public void update() {
        int s = this.subject.getState();
        this.octValue = Integer.toOctalString(s);
   }

   public String getValue() {
        return this.octValue;
   }

}
