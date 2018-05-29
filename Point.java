/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryprimitives;

/**
 *
 * @author coral2018
 */
public class Point 
{
    private double x,y;
    //constructor
    public Point(double x,double y){
    this.x=x;
    this.y=y;
    }
    
    double get_x(){return this.x;}
    double get_y(){return this.y;}
    
    //distance -- return the distance of this point to the other point
    public double distance(Point other)
    {
        double dist = Math.pow(other.get_x()-this.x,2)+Math.pow(other.get_y()-this.y,2);
        return Math.sqrt(dist);    
    }
    
    public boolean equals(Point other)
    {
        if(other.get_x() == this.x && other.get_y() == this.y)
            return true;
        else
            return false;
        
    }
}

