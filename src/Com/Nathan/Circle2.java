/**
 * @author Nathan Henriques
 * @date 03/25/2024
 * code that finds the point of a circle                                                               
 */

package Com.Nathan;

import methods.Point;

public class Circle2 {
   private double x;
   private double y;
   // Constructor with parameters
   public Circle2(double x, double y) {
       this.x = x;
       this.y = y;
   }
   // Default constructor (defaults to origin)
   public Circle2() {
       this.x = 0.0;
       this.y = 0.0;
   }
   // Accessor methods for x and y
   public double getX() {
       return x;
   }
   public double getY() {
       return y;
   }
   // Method to calculate Euclidean distance between two points
   public double dist(Circle2 o) {
       double deltaX = this.x - o.x;
       double deltaY = this.y - o.y;
       return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
   }
   // Method to find midpoint between two points
   public Circle2 midpoint(Circle2 o) {
       double midX = (this.x + o.x) / 2;
       double midY = (this.y + o.y) / 2;
       return new Circle2(midX, midY);
   }
}
                                                      
