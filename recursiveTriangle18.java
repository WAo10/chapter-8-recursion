import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1

       int length = (int) Math.sqrt(Math.pow(xPos[1]-xPos[0], 2)
       +Math.pow(yPos[1]-yPos[0], 2));


       //if the segment/distance is 30 or so, good length to stop
            //find the mid points of each line segment
            //make the x and y array (3 points + first point to finish triangle)


         int[] mPx = new int[4];
        int[] mPy = new int[4];
        
        int[] mPnx = new int[4];
        int[] mPny = new int[4];
        
        
        if (length<30)
        {
            return;
        }
        else
        {
           for (int i = 0; i<xPos.length-1; i++)
           {
             mPx[i] = (xPos[i]+xPos[i+1])/2;
             mPy[i] = (yPos[i]+yPos[i+1])/2;
           }
           
           mPx[3]=mPx[0];
            mPy[3]=mPy[0];
          
           
           int[] mPx1 = {mPx[0], mPx[0]-length, mPx[1]-1, mPx[0]};
           
           int[] mPx2;
           
           int[] mPx3;
          
           int[] mPy1 = {mPx[0]};
           
           int[] mPy2;
           
           int[] mPy3;
          
            //draw the Triangle
            page.drawPolyline (mPx, mPy, mPx.length);
            page.drawPolyline (mPx1, mPy1, mPx.length);
            page.drawPolyline (mPx2, mPy2, mPx.length);
            page.drawPolyline (mPx3, mPy3, mPx.length);
            
            //draw other triangles
            Triangle(mPx1, mPy1, page);
            Triangle(mPx2, mPy2, page);
            Triangle(mPx3, mPy3, page);
        }
          
 

            //create x,y Array using the midpoints you calculated
            //example




            // Recursive calls for each section of triangle



        //}



   }//end of Triangle
}
