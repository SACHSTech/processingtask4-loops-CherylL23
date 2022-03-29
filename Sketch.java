import processing.core.PApplet;

public class Sketch extends PApplet {
  
  public void settings() {
    
    // put your size call here
    size(400, 400);
  }

  public void setup() {
    
    //background colour
    background(255, 255, 255);
  }
  
  public void draw() {
 
    //first quadrant
    stroke(0);
    fill(6, 145, 13);
    
    for (int circleY = 20; circleY <= 180; circleY += 40) {
      for (int circleX = 220; circleX <= 380; circleX += 40) {
       ellipse(circleX, circleY, (float) (width * 0.075), 
 (float) (height * 0.075));
      }
    }
    
    //second quadrant 
    for(int lineX = 20; lineX <= 180; lineX += 20) {
      line(lineX, (float) (height * 0), lineX, (float) (height * 0.5));
    }
    
    for(int lineY = 20; lineY <= 180; lineY += 20) {
      line( (float) (width * 0), lineY, (float) (height * 0.5), lineY);
    }
    
    //third quadrant
    for(int grayScale = 200; grayScale >=0; grayScale--) {
      stroke(grayScale);
      line(grayScale, (float) (height / 2), grayScale, (float) (height));
    } 

    //fourth quadrant
    stroke(0);
    fill(78, 56, 186);
    translate(300, 300);
   for (int intPetals = 0; intPetals <8; intPetals++) {
     rotate(PI / 4);
     ellipse((float) (width * 0.1), (float) (height * 0), (float) (width * 0.2), (float) (height * 0.075)); 
    }

    //middle of the flower
    stroke(0);
    fill(247, 247, 27); 
    ellipse( (float) (width * 0), (float) (height * 0), (float) (width * 0.125), (float) (height * 0.125)); 
  }
}