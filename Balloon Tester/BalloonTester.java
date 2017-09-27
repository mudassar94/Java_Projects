/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class BalloonTester 
{
    public static void main(String [] args)
    { 
        String one;
        String two;

        one = "Red";
        two = "Blue";
        
        int alt2;
        alt2 = -50;

        Balloon firstBalloon = new Balloon(one,100);

        Balloon secondBalloon = new Balloon(two,alt2);

        String FirstBalloonName;
        double FirstBalloonAlt;

        FirstBalloonName = firstBalloon.getName();
        FirstBalloonAlt = firstBalloon.getAltitude();

        System.out.println("The name of the first balloon is " + FirstBalloonName);
        System.out.println("The altitude of the first balloon is " + FirstBalloonAlt);

        String SecondBalloonName;
        double SecondBalloonAlt;

        SecondBalloonName = secondBalloon.getName();
        SecondBalloonAlt = secondBalloon.getAltitude();

        System.out.println("The name of the second balloon is " + SecondBalloonName);
        System.out.println("The altitude of the second balloon is " + SecondBalloonAlt);

        firstBalloon.ascendTo(200);
        
        secondBalloon.adjustAltitude(100);
        
        System.out.println("The name of the first balloon is " + FirstBalloonName);
        System.out.println("The ascended altitude of the first balloon now is " + firstBalloon.getAltitude());
        
        System.out.println("The name of the second balloon is " + SecondBalloonName);
        System.out.println("The adjusted altitude of the second balloon now is " + secondBalloon.getAltitude());
        
        firstBalloon.adjustAltitude(-100);
        System.out.println("The name of the first balloon is " + FirstBalloonName);
        System.out.println("The adjusted altitude of the first balloon now is " + firstBalloon.getAltitude());
        
        secondBalloon.descendTo(firstBalloon.getAltitude());
        System.out.println("The name of the second balloon is " + SecondBalloonName);
        System.out.println("The altitude of the second balloon is now the same as the first"
                + " one at " + secondBalloon.getAltitude());
        
        System.out.println("The current altitude of the first balloon times three is "
                 + 3*FirstBalloonAlt);
        
        System.out.println("The altitude of the second balloon after it has been moved"
                + " 200 meters below its current altitude is "
                 + (secondBalloon.getAltitude()-200));
        
        
    }
    
}
