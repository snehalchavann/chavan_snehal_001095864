/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    double gradePoint;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }
     public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(){
        
        seatassignment = new SeatAssignment(this); //links seatassignment to seat
        System.out.println("test " + seatassignment.seat);
        occupied = true;   
        return seatassignment;
    }
    
    public String getCourseName(){
        return courseoffer.getCourseName();
    }
    
    public int getCourseCredit(){
        return courseoffer.getCredits();
    }
    
}
