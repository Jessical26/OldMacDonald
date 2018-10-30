class Chick implements Animal
{     
     protected String myType; 
     protected String mySound;
     protected String myOtherSound;
     public Chick(String type, String othersound, String sound)
     {
       myType = type;
       mySound = sound;
       myOtherSound = othersound;
       
     }
     public Chick()
     {
       myType = "unknown";
       mySound = "unknown";
       myOtherSound = "unknown";
     }
     
     public String getSound(){
       if((int)(Math.random()*2)==0)
       {
          return mySound;
       }else
       {
         return myOtherSound;
       }
     }
     public String getType(){return myType;}
}
